package it.nmlab.lines.model;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

import it.nmlab.lines.exception.LinesException;

/**
 * The domain class. All the action takes place in the lines method.
 */
public class Space {

	private SortedSet<Point> points = new TreeSet<>();
	private boolean usePermutations;
	
	public Space(boolean usePermutations) {
		this.usePermutations = usePermutations;
	}
	
	public void add(Point p) {
		if ( ! points.add(p) ) {
			throw new LinesException("Point already present");
		}
	}
	
	public Set<Point> get() {
		return points;
	}

	/**
	 * Return a collection of lines, i.e. collections of points, with at least 'length' elements.
	 *
	 * The result is a collection of the elements of the power set of the set of points present in
	 * the space that have at least 'length' elements (2 if 'length' is 1). This follows the
	 * specification, that states that "a line is a set of points". However, if we consider 'set' in
	 * the strict mathematical sense, a set's elements are not ordered and any ordering defines a
	 * different line. 
	 * If the 'usePermutations' system property is true, all permutations of each set of points
	 * are returned. Note that in this case lines are considered to have a direction, so that
	 * [ ( 0, 0 ), ( 1, 1 ) ] is considered to be different from [ ( 1, 1 ), ( 0, 0 ) ].
	 * A possible, future improvement could be the removal of such duplicates.
	 * 
	 * @param length the minimum number of points in each line
	 * @return a collection of lines with at least 'length' points
	 */
	public Collection<Collection<Point>> lines(int length) {
		Set<Set<Point>> ps = Sets.powerSet(points);
		if ( length < 1 ) {
			throw new LinesException("Line length should be a positive integer");
		}
		else { 
			Stream<Set<Point>> ssp = ps.stream().filter(s -> s.size() >= Math.max(length, 2));
			if ( ! usePermutations ){
				return ssp.collect(Collectors.toSet());
			}
			else {
				return ssp.map(t -> Collections2.permutations(t))
						.flatMap(u -> u.stream())
						.collect(Collectors.toList());
			}
		}
	}
	
	public void delete() {
		points.clear();
	}
}
