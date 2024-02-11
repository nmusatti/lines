package it.nmlab.lines.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.nmlab.lines.exception.LinesException;

public class Space {

	private HashSet<Point> points = new HashSet<Point>();
	
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
	
	public List<Line> lines(int points) {
		return List.of();
	}
	
	public void delete() {
		points.clear();
	}
}
