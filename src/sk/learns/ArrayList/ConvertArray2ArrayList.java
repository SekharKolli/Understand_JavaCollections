/*
 * Purpose : Demos the conversion of an array to an ArrayList
 * Date: 17-January-2019
 */

package sk.learns.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ConvertArray2ArrayList {

	public static void main(String[] args) {

		/* using the Array.aslist() method */
//		int[] i = new int[] { 1, 2, 3, 4, 5, 6, 7 }; // To use Arrays.asList() for conversion to list, we cannot use a primitive type

		Integer[] wrapperIntergerArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7 }; // Has to be a wrapper class
		
		List<Integer> l = Arrays.asList(wrapperIntergerArray); //On the other hand, if your array has Objects, not primitives in it, Arrays.asList will work:
		
		System.out.println(l);
		
		/* Converting a primitive to Wrapper to collection */
		
		int[] iArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Interger[] wiArr = iArr.clone();
		

	}

}
