/*
 * Purpose : Demos the use of static Collections.sort() method for sorting
 * Date: 17-January-2019
 */

package sk.learns.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListEg {
	public static void main(String args[]) {
		ArrayList<String> strings = new ArrayList<String>();

		strings.add("D");
		strings.add("B");
		strings.add("C");
		strings.add("A");

		System.out.println("Strings collected (Before Sorting) : " + strings);
		Collections.sort(strings);
		System.out.println("Strings collected (After Sorting) : " + strings);

// for (String s : strings) {
// System.out.print(s + " ");
// }
	}
}