package it.nmlab.lines.model;

import java.util.HashSet;

public class Line {

	private final HashSet<Point> points;
	
	public Line(HashSet<Point> points) {
		this.points = points;
	}

	public HashSet<Point> getPoints() {
		return points;
	}
	
}
