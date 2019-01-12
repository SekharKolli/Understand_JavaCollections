/*
 * Purpose : To learn about  ArrayList. Demos the use of homogeneous list and un-homogeneous list (we can store objects in the list)
 *
 * Date: 10-December-2018
 */

package allaboutcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

class Employee {
	int i;
	String name;

	public Employee(int i, String name) {
		this.i = i;
		this.name = name;
	}

	@Override
	public String toString() { return "{EmpId=" + i + "; name=" + name + "}"; }

}

public class MyArrayList {

	@SuppressWarnings({ "unchecked", "rawtypes" }) // Compiler Warning when inserting objects. And this is exactly the point of demo
	public static void main(String[] args) {

		Employee emp1 = new Employee(1001, "Jack");
		Employee emp2 = new Employee(1002, "Joe");
		Employee emp3 = new Employee(1003, "Jim");

		// We can create an array list using any of the three ways
		ArrayList list1 = new ArrayList(); // Leaving this empty helps us create a list of objects
		ArrayList<String> list2 = new ArrayList<String>(); // Collections use Wrapper Classes or DataTypes defined
		ArrayList<Employee> list3 = new ArrayList<Employee>(); // Or we can have user defined datatypes

		// use .add method to add items to the list
		list1.add(10);
		list1.add(2.2f);
		list1.add("Intel");
		list1.add(true);
		list1.add('S');
		list1.add(emp1);
		System.out.println("List 1 is : " + list1 + " Size is " + list1.size());

		list2.add("Tom");
		list2.add("Dick");
		list2.add("Sally");
		list2.add("Hero");
		System.out.println("List 2 is : " + list2 + " Size is " + list2.size());

		list3.add(emp1);
		list3.add(emp2);
		list3.add(emp3);
		list3.add(new Employee(104, "Jill"));
		System.out.println("List 3 is : " + list3 + " Size is " + list3.size());

		// Accessing and iterating list elements
		// 1) Using For Loop

		System.out.print("\nRegular For,  Contents of list1 : ");
		for (int i = 0; i < list1.size(); i++)
			System.out.print(list1.get(i) + "|");

		System.out.print("\nRegular For,  Contents of list2 : ");
		for (int i = 0; i < list2.size(); i++)
			System.out.print(list2.get(i) + "|");

		System.out.print("\nRegular For, Contents of list3 : ");
		for (int i = 0; i < list3.size(); i++)
			System.out.print(list3.get(i) + "|");

		// 2) Using the forEach Loop
		System.out.print("\n ForEach,  Contents of list1 : ");
		for (Object obj : list1)
			System.out.print(obj + "|");

		System.out.print("\n ForEach,  Contents of list2 : ");
		for (String str : list2)
			System.out.print(str + "|");

		System.out.print("\n ForEach,  Contents of list3 : ");
		for (Employee employee : list3)
			System.out.print(employee + "|");

		// 3 Using Iterator
		Iterator itr;
		System.out.print("\nIterator,  Contents of list1 : ");
		itr = list1.iterator();
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.print(obj + "|");
		}
		System.out.print("\nIterator,  Contents of list2 : ");
		itr = list2.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.print(s + "|");
		}
		System.out.print("\nIterator,  Contents of list3 : ");
		itr = list3.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.print(e + "|");
		}

		// 4 Using List Iterator. Same as Iterator, only difference is that we can traverse in reverse
		ListIterator lstItr;
		System.out.print("\nList Iterator in sequence,  Contents of list1 : ");
		lstItr = list1.listIterator();
		while (lstItr.hasNext()) {
			Object obj = (Object) lstItr.next();
			System.out.print(obj + "|");
		}
		System.out.print("\nList Iterator in reverse,  Contents of list1 : ");
		while (lstItr.hasPrevious()) { // B'cos iterator is pointing to the last item, we'll be able to traverse back
			Object obj = (Object) lstItr.previous();
			System.out.print(obj + "|");
		}

		// 5 Using Enumeration
		System.out.print("\nEnumerations,  Contents of list1 : ");
		Enumeration emr = Collections.enumeration(list1);
		while (emr.hasMoreElements()) {
			Object obj = (Object) emr.nextElement();
			System.out.print(obj + "|");
		}

	}

}
