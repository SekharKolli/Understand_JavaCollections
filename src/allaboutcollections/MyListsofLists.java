/**
 * Purpose : program allow us to play with all kinds of List collections available in Java
 * 
 */

package allaboutcollections;

import java.util.List;
import java.util.Stack;

public class MyListsofLists {

	public static void main(String[] args) {

		
		List<String> planets;
		
//		planets = new ArrayList<String>(); // Entry-Order is maintained. No Default Sorting. Accepts Duplicates. Accepts Null 
//		planets = new LinkedList<String>(); // Entry-Order is maintained. No Default Sorting. Accepts Duplicates. Accepts Null 
//		planets = new Vector<String>(); // Entry-Order is maintained. No Default Sorting. Accepts Duplicates. Accepts Null
		planets = new Stack<String>(); // Entry-Order is maintained. No Default Sorting. Accepts Duplicates. Accepts Null
		
		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Earth");
		planets.add("Mars");
		planets.add("Pluto");
		planets.add("Jupiter");
		planets.add("Saturn");
		planets.add("Uranus");
		planets.add("Neptune");
		System.out.println(planets+" // Original List.");
		System.out.println("size is "+planets.size());
//		System.out.println(" Capacity is "+planets.capacity()); 

		planets.add("Earth"); // Adding Duplicates 
		System.out.println(planets+" // Adding duplicate 'Earth'"); 

		planets.add(null); // Can I add Null? 
		System.out.println(planets+" // Adding null"); 
		
		planets.add(2, "Sun"); // Adding at a position
		System.out.println(planets+" // Adding Sun at position 2");
		planets.remove("Sun");		// If duplicates exist in the list, then the first one gets removed
		
//		System.out.println("First Element is : "+planets.firstElement()+" Last Element is : "+planets.lastElement()); // Available only to class vectors
		
//		planets.push("sun"); // Used for Stack
//		System.out.println(planets+" // Adding sun using the pop method");
//		planets.pop();
//		planets.pop();
		
		
		for (String str : planets) {
			System.out.print(str+" | "); 
		}

	}


}
