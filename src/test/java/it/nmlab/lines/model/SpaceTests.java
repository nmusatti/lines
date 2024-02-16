package it.nmlab.lines.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpaceTests {

	public SpaceTests() {
	}

	@Test
	public void basicTest() {
		Space space = new Space(false);
		space.add(new Point(0.0d, 0.0d));
		space.add(new Point(1.0d, 1.0d));
		space.add(new Point(2.0d, 2.0d));
		assertEquals(3, space.get().size());
		space.delete();
		assertEquals(0, space.get().size());
	}
	
	@Test
	public void setLinesTest() {
		Space space = new Space(false);
		space.add(new Point(0.0d, 0.0d));
		space.add(new Point(1.0d, 1.0d));
		space.add(new Point(2.0d, 2.0d));
		space.add(new Point(3.0d, 1.0d));
		assertEquals(11, space.lines(1).size());		
	}
	
	@Test
	public void permutationLinesTest() {
		Space space = new Space(true);
		space.add(new Point(0.0d, 0.0d));
		space.add(new Point(1.0d, 1.0d));
		space.add(new Point(2.0d, 2.0d));
		space.add(new Point(3.0d, 1.0d));
		assertEquals(48, space.lines(3).size());		
	}
}
