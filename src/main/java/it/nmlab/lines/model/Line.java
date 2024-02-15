package it.nmlab.lines.model;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

import it.nmlab.lines.exception.LinesException;

public class Line {

	private SortedSet<Point> points = new TreeSet<>();
	
	public Line() {
	}

	public Line(Point...points) {
		for ( Point p : points ) {
			addPoint(p);
		}
	}
	
	public Collection<Point> getPoints() {
		return points;
	}
	
	public void addPoint(Point p) {
		if ( points.contains(p) ) {
			throw new LinesException("Point already present");
		}
		points.add(p);
	}
}
