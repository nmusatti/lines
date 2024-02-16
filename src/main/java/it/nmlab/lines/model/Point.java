package it.nmlab.lines.model;

import java.util.Objects;

/**
 * Point implements Comparable to support lexicographic ordering.
 */
public class Point implements Comparable<Point> {

	private final double x;
	private final double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( obj == null || getClass() != obj.getClass() )
            return false;
        Point p = (Point)obj;
        return this.x == p.x && this.y == p.y;
	}

	@Override
	public int compareTo(Point o) {
		if ( o == null ) {
			return 1;
		}
		int xc = Double.compare(x, o.x);
		return xc != 0 ? xc : Double.compare(y, o.y);
	}
}
