/*
 * Purpose : Can we have a two-dimensional ArrayList. Ans is no. We create an single dimensional object of objects, although similar, we cannot
 * access the elements using arr[][] operator
 * Date: 11-January-2019
 */

package allaboutcollections;

import java.util.ArrayList;

public class TwoDimentionalArrayList {
	public static void main(String[] args) {
		ArrayList<String> _1D_ArrayList = new ArrayList<>();
		ArrayList<ArrayList<String>> _2D_ArrayList = new ArrayList<>(); // is this a two dimentinal Arraylist? Ans: no

		_1D_ArrayList.add("1_one");
		_1D_ArrayList.add("1_two");
		_1D_ArrayList.add("1_three");
		_1D_ArrayList.add("1_four");

		_2D_ArrayList.add(_1D_ArrayList);
		System.out.println("After adding _1_ : " + _1D_ArrayList); // The same object is being used so if I .clear() it then I loose  

		_1D_ArrayList.add("2_one");
		_1D_ArrayList.add("2_two");
		_1D_ArrayList.add("2_three");

		_2D_ArrayList.add(_1D_ArrayList);
		System.out.println("After adding _2_ : " + _1D_ArrayList);

		_1D_ArrayList.add("3_one");
		_1D_ArrayList.add("3_two");

		_2D_ArrayList.add(_1D_ArrayList);
		System.out.println("After adding _3_ : " + _1D_ArrayList);

		System.out.println(_2D_ArrayList);
		System.out.println("get(0) : " + _2D_ArrayList.get(0));
		System.out.println("get(1) : " + _2D_ArrayList.get(1));
		System.out.println("get(2) : " + _2D_ArrayList.get(2));

		/* Unsure if I'm able to use foreach in this case */
		for (ArrayList<String> al : _2D_ArrayList) {
			// System.out.println(al);
			for (String s : al) {
				System.out.print("[" + s + "], ");
			}
			System.out.println("-");

		}

	}

}
