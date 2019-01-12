/*
 * Purpose : Demo the use of HashTables
 * Date: 10-January-2019
 * 
 * Difference between HashTables and HashMaps. They are same, except for the following
 * 1. HashTables are synchronized. They are thread-safe. meaning only one thread is allowed to act/modify them
 * 2. HashTables do not allow null values for keys as well values (NullPointerException Thrown). (HashMaps allow them for both keys and values)
 * 3. UnSorted and UnOrdered. This is due to hashing
 * 4. ??This is older collection. than HashMap??
 */

package allaboutcollections;

import java.util.Enumeration;
import java.util.Hashtable;

public class DemoHashTables {

	public static void main(String[] args) {

		Hashtable<String, Double> bankAccRecords = new Hashtable<>();

		/* Adding values */
		bankAccRecords.put("Mitchell Nugent", 10420.93d);
		bankAccRecords.put("Phylicia Santini", 10230.93d);
		bankAccRecords.put("Palmira Teamer", 23100.63d);
		bankAccRecords.put("Jen Manuelito", 86100.23d);
		bankAccRecords.put("Hermina Berner", 15600.43d);
		bankAccRecords.put("Coral Rochell", 15300.95d);
		bankAccRecords.put("Valentine Brander", 41200.93d);
		bankAccRecords.put("Cecilia Cerda", 10520.22d);
		bankAccRecords.put("Zachary Holaway", 10032.03d);
		bankAccRecords.put("Tanesha Hammack", 96032.63d);

		/* Enumerating */
		Enumeration<String> enu = bankAccRecords.keys();
		while (enu.hasMoreElements()) {
			String key = (String) enu.nextElement().toString(); // Read Key
			Double value = bankAccRecords.get(key); // Extract value using key OR we can convert both key & value toString()
			System.out.println(key + " : " + value);

		}

	}

}
