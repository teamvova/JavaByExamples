/**
 * 
 */
package arrays;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Vova team 2016
 * Get our feets wet
 *
 */
public class HasMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 	Create a Category Array with <Key , Value>
		 * 	Category: id, name
		 */

		HashMap<Integer, String> categoryMap = new HashMap<Integer, String>();
		categoryMap.put(4, "Sport");
		categoryMap.put(18, "Health");
		categoryMap.put(5, "Lifestyle");
		categoryMap.put(6, "Entertainment");
		categoryMap.put(8, "Technology");
		
		/**
		 * 	Foreach Loop
		 */

		for (Entry<Integer, String> m : categoryMap.entrySet()) {
			System.out.print("" + m.getKey());
			System.out.print(" - ");
			System.out.print("" + m.getValue());
			System.out.println();
		}

	}

}
