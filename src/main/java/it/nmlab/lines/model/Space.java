package it.nmlab.lines.model;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import it.nmlab.lines.exception.LinesException;

public class Space {

	private SortedSet<Point> points = new TreeSet<>();
	
	public Space() {
		
	}
	
	public void add(Point p) {
		if ( ! points.add(p) ) {
			throw new LinesException("Point already present");
		}
	}
	
	public Set<Point> get() {
		return points;
	}
	
	public List<Line> lines(int length) {
		if ( length == 0) {
			return List.of();
		}
		else if ( length == 1 ) {
			throw new LinesException("Infinite lines");
		}
		else {
			return new Engine(points).findLines(length);
		}
	}
	
	public void delete() {
		points.clear();
	}
}
