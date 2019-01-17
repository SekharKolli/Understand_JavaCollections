/*
 * Purpose : Demos the use of priority queue
 * Date: 17-January-2019
 */

package sk.learns.priorityQueue;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("First");
		pq.add("Second");
		pq.add("Third");
		pq.add("Forth");
		pq.add("Fifth");
		
		System.out.println(pq.poll() + ":" + pq.peek());

	}

}
