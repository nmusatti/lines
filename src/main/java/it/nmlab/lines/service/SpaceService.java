package it.nmlab.lines.service;

import java.util.List;
import java.util.Set;

import it.nmlab.lines.model.Line;
import it.nmlab.lines.model.Point;
import it.nmlab.lines.model.Space;

public class SpaceService {

	private Space space;

	public SpaceService(Space space) {
		this.space = space;
	}

	public void add(Point p) {
		space.add(p);
	}

	public Set<Point> getPoints() {
		return space.get();
	}
	
	public List<Line> getLines(int points) {
		return space.lines(points);
	}
	
	public void delete() {
		space.delete();
	}
}
