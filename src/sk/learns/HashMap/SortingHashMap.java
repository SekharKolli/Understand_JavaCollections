/*
 * Purpose : Demos TreeSet to help with sorting values
 * Date: 17-January-2019
 */

package sk.learns.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortingHashMap {

	public static void main(String[] args) {

		HashMap ingredients = new HashMap();

		ingredients.put("key23", "Coriander seeds");
		ingredients.put("key45", "Red Chillies");
		ingredients.put("key67", "Turmeric");
		ingredients.put("key89", "Cumin");
		ingredients.put("key12", "Iodised Salt");
		ingredients.put("key87", "Black Pepper");
		ingredients.put("key65", "Fenugreek Leaves");
		ingredients.put("key43", "Mustard");
		ingredients.put("key32", "Dried Ginger");
		ingredients.put("key31", "Cassia");
		ingredients.put("key21", "Cardamom Amomum");
		ingredients.put("key19", "Cloves");
		ingredients.put("key82", "Nutmeg");
		ingredients.put("key44", "Mace");
		ingredients.put("key57", "Asafoetida");

		Set s = ingredients.keySet();
		Set sortedSet = new TreeSet(s);

		for (Iterator it = sortedSet.iterator(); it.hasNext();) {
			System.out.println(it.next());
			System.out.println();
		}

	}

}
