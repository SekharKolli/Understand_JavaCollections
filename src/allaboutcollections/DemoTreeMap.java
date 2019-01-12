/*
 * Purpose : Explore Treemap collection. Extract the keySet(). Extract Map.Entry<k.v>. convert one map collection to the other
 *
 * Date: 10-January-2019
 */

package allaboutcollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {

		TreeMap<String, Double> bankAccRecords = new TreeMap<>();

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

		/* Using Set to extract KeySet */
		Set<String> users = bankAccRecords.keySet();
		System.out.println("Here are the keys, in our case users : " + users);

		System.out.println("Is Tanesha Hammack an account holder here : " + bankAccRecords.containsKey("Tanesha Hammack")); // Keys are case-sensitive
		System.out.println("Does anybody have 15600.43 in their account : " + bankAccRecords.containsValue(15600.43d)); // Values have to be an exact match

		/* Here is a way to print the TreeMap */
		Set<Map.Entry<String, Double>> entries = bankAccRecords.entrySet();
		Iterator<Map.Entry<String, Double>> it = entries.iterator();
		double banksAvgFunds = 0;
		int recCnt = 0;
		while (it.hasNext()) {
			Map.Entry<String, Double> entry = (Map.Entry<String, Double>) it.next();
			
			// System.out.println(entry);
			System.out.println(entry.getKey() + " | " + entry.getValue()); // Access key and value separately
			
			/* Calc Avg */
			banksAvgFunds += entry.getValue();
			recCnt++;
		}

		System.out.println("Bank Holds Avg :" + (banksAvgFunds / recCnt));
	}

}
