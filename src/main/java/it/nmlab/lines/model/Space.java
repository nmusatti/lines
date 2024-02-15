package it.nmlab.lines.model;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

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
	
	public Set<Set<Point>> lines(int length) {
		Set<Set<Point>> ps = Sets.powerSet(points);
		if ( length == 0 ) {
			return ps;
		}
		else {
			return ps.stream().filter(s -> s.size() >= length).collect(Collectors.toSet());
		}
	}
	
	public void delete() {
		points.clear();
	}
}
