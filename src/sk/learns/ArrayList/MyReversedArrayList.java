/*
 * Purpose : 1\ Demoing using an iterator 2\ Demoing the use of While() iterator loop
 * Date: 17-January-2019
 */

package sk.learns.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyReversedArrayList {
	@SuppressWarnings("rawtypes")
	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" }) // Suppressing warnings to focus on concept
	public static void main(String args[]) {
		List list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

// for (Object obj : CanIReverseArrayList.reverse(list)) // CE : Can only iterate over an array or an instance of java.lang.Iterable
		Iterator it = reverse(list);
		while (it.hasNext()) { // But we can use Iterating while loop to finish iterating
			Object obj = (Object) it.next();
			System.out.print(obj + ", ");
		}
	}
}