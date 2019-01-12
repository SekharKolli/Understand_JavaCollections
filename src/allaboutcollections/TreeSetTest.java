/*
 * Purpose : Demos the use of TestSet collection. And also demo the use of comparator
 *
 * Date: 10-January-2019
 */

package allaboutcollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

// TreeSet<String> planets = new TreeSet<>();
		TreeSet<String> planets = new TreeSet<>(new MyComparator()); // Sort in reverse order

		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Earth");
		planets.add("Mars");
		planets.add("Pluto");
		planets.add("Jupiter");
		planets.add("Saturn");
		planets.add("Uranus");
		planets.add("Neptune");

		System.out.println("Size of planets : " + planets.size());

		for (String p : planets) {
			System.out.println(p + "; ");
		}
	}// EO main

} // EO TreeSetTest

/**
 * implements my comparator, so that TreeSet can sort in reverse order
 */
class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.compareTo(o2) > 0) {
			return -1;
		} else if (o1.compareTo(o2) < 0) {
			return 1;
		} else {
			return 0;
		}
	}

} // EO MyComparator
