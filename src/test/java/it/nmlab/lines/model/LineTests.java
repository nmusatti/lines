package it.nmlab.lines.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.nmlab.lines.exception.LinesException;

public class LineTests {

	public LineTests() {
	}

	@Test
	public void testValidLine() {
		Line l = new Line();
		l.addPoint(new Point(0.0, 0.0));
		l.addPoint(new Point(1.0, 1.0));
		l.addPoint(new Point(2.0, 2.0));
		assertEquals(3, l.getPoints().size());
	}

	@Test
	public void testInvalidLine() {
		Line l = new Line();
		l.addPoint(new Point(0.0, 0.0));
		l.addPoint(new Point(1.0, 1.0));
		assertThrows(LinesException.class, () -> l.addPoint(new Point(2.0, -2.0)));
	}
}
