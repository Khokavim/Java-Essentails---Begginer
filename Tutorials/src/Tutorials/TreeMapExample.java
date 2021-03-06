package Tutorials;

import java.util.TreeMap;

public class TreeMapExample {
	/* A Tree-Map sorts the elements in the mapping in an alphabetic order 
	 * You may get the firstKey() and lastKey() after sorting. (Tree map is a red-black tree implementation) 
	 * */

	public static void main(String[] args) {
		TreeMap<String, Integer> vehicles = new TreeMap<String, Integer>();
		
		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 7);
		vehicles.put("Audi", 1);	
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		// Iterate over all vehicles, using the keySet method.
		for(Object key: vehicles.keySet())
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();
		
		System.out.println("Highest key: " + vehicles.lastKey());
		System.out.println("Lowest key: " + vehicles.firstKey());
		
		System.out.println("\nPrinting all values:");
		for(Object val: vehicles.values())
			System.out.println(val);
		System.out.println();
		
		// Clear all values.
		vehicles.clear();
		
		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size());
	}
}
