package it.nmlab.lines.service;

import it.nmlab.lines.model.Point;
import it.nmlab.lines.model.Space;

public class PointService {

	private Space space;

	public PointService(Space space) {
		this.space = space;
	}

	public void add(Point p) {
		space.add(p);
	}
}
