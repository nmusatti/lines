package it.nmlab.lines.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Engine {

	class Local<T> {
		public T value;
		
		Local(T v) {
			value = v;
		}
	}
	
	private ArrayList<Point> points;
	
	public Engine(Collection<Point> points) {
		this.points = new ArrayList<Point>(points);
	}

	private Stream<Integer> findSegmentEnds(int pi) {
		final Local<Boolean> found = new Local<>(false);
		return Stream.iterate(pi + 1, i -> i + 1)
				.limit(points.size() - pi - 1)
				.filter(i -> {
						if ( points.get(i).getX() == points.get(pi).getX() ) {
							if ( ! found.value ) {
								found.value = true;
								return true;
							}
							return false;
						}
						return true;
					});
	}
	
	public List<Line> findLines(int length) {
		assert length >= 2;
		ArrayList<Line> lines = new ArrayList<>();
		Stream.iterate(0, i -> i + 1)
			.limit(points.size() - length + 1)
			.forEach(i -> {
				findSegmentEnds(i).forEach(e -> {
					lines.add(new Line(points.get(i), points.get(e)));
				});
		});
		return lines;
	}
}
