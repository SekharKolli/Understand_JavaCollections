/*
 * Purpose : Demos the use of Maps collection. Also demos conversion of one collection to the other 
 *
 * Date: 10-January-2019
 */

package allaboutcollections;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class DemoMapCollection {

	public static void main(String[] args) {
		HashMap<String,Integer> hashMapMths = new HashMap<>();

		hashMapMths.put("January", 1);
		hashMapMths.put("February", 2);
		hashMapMths.put("March", 3);
		hashMapMths.put("April", 4);
		hashMapMths.put("May", 5);
		hashMapMths.put("June", 6);
		hashMapMths.put("July", 7);
		hashMapMths.put("August", 8);
		hashMapMths.put("September", 9);
		hashMapMths.put("October", 10);
		hashMapMths.put("November", 11);
		hashMapMths.put("December", 12);
		
		System.out.println("Entry Order is not maintained \n"+hashMapMths);
		Set<String> mmHashSet = hashMapMths.keySet();
		System.out.println("\nHere is the Set containing all the Hashes:"+mmHashSet);
		for (String mmm : mmHashSet) {
			System.out.print(mmm+" "+hashMapMths.get(mmm)+"|");
		}
		
		/* Can convert from one collection to the other */
		TreeMap<String, Integer> treeMapMths = new TreeMap<>(hashMapMths);

		/* Difference between Hashmap & TreeMap */
		// 1. Order of entry is not maintained & Order of entry is not maintained, but keys are sorted
		System.out.println("\n\n Notice TreeSet outputs a Sorted <Key=Value> pairs \n"+treeMapMths);
		System.out.println("Compare with HashMap <Key=Value> pairs \n"+hashMapMths);
		
		hashMapMths.clear(); // Clearing values for future use
		treeMapMths.clear(); 
		
		// 2. HashMap accepts Null keys and values.  		
		hashMapMths.put(null, null);
		System.out.println("\nAdding Key=null & Value=null \n"+hashMapMths);
		hashMapMths.put("Thirteenth Month", null);
		hashMapMths.put(null, 13); // If we provide the same key, value is going to be overwritten
		System.out.println("Adding either a null key or a null Value \n"+hashMapMths);
		
		// 2. TreeMap doesn't accept null keys from ??Java 1.4??
//		treeMapMths.put(null, null); // Throws a NullPointerException
//		treeMapMths.put(null, 13); // Throws a NullPointerException
		treeMapMths.put("Thirteenth Month", null);
		System.out.println("Only null values are allowed. null key throws a NullPointerException\n"+treeMapMths);
		System.out.println("\nAdding Key=null & Value=null, Throws a NullPointerException\n"+treeMapMths);
		
	}// EO main

}// EO DemoMapCollection
