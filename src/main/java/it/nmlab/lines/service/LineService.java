package it.nmlab.lines.service;

import java.util.List;

import it.nmlab.lines.model.Line;
import it.nmlab.lines.model.Space;

public class LineService {

	private Space space;
	
	public LineService(Space space) {
		this.space = space;
	}

	public List<Line> get(int points) {
		return space.lines(points);
	}

}
