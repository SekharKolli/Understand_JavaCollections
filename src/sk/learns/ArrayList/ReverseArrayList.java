
package sk.learns.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {
	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

	public static void main(String args[]) {
		List list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");

		for (Object obj : ReverseArrayList.reverse(list)) // CE : Can only iterate over an array or an instance of java.lang.Iterable
			System.out.print(obj + ", ");
	}
}