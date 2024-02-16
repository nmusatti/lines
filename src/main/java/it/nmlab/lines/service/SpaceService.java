package it.nmlab.lines.service;

import java.util.Collection;

import it.nmlab.lines.model.Point;
import it.nmlab.lines.model.Space;

/**
 * The service class just delegates to the Space class.
 */
public class SpaceService {

	private Space space;

	public SpaceService(Space space) {
		this.space = space;
	}

	public void add(Point p) {
		space.add(p);
	}

	public Collection<Point> getPoints() {
		return space.get();
	}
	
	public Collection<Collection<Point>> getLines(int points) {
		return space.lines(points);
	}
	
	public void delete() {
		space.delete();
	}
}
