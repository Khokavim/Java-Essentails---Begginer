package Tutorials;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	/*ConcurrentHashmap allow HashMaps to be updated during run time
	 * */
	
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> vehicles = new ConcurrentHashMap<String, Integer>();
		
		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		// Iterate over all vehicles, using the keySet method.
		for(Object key: vehicles.keySet())
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();
		
		String searchKey = "Audi";
		if(vehicles.containsKey(searchKey))
			System.out.println("Found total " + vehicles.get(searchKey) + " "
					+ searchKey + " cars!\n");
		
		/*Enumerations accept a collection of values of the same data type from elements defined with more than one primitive type
		 * 
		 * Enumerations strip/collect values of the same data type from elements
		 * */
		
		Enumeration<Integer> elems = vehicles.elements();
		while(elems.hasMoreElements())
			System.out.println(elems.nextElement());
		System.out.println();
		
	    //putIfAbsent() method updates the ConcurrentHashMap collection with (key, value) pairs 
		
		Object val = vehicles.putIfAbsent("Audi", 9);
		if(val != null)
			System.out.println("Audi was found in the map and its value was updated!");
		
		val = vehicles.putIfAbsent("Nissan", 9);
		if(val == null)
			System.out.println("Nissan wasn't found in map, thus a new pair was created!");
		System.out.println();
		
		// The next statements throw a NullPointerException, if uncommented.
		//vehicles.put("Nissan", null);
		//vehicles.put(null, 6);
		
		// Clear all values.
		vehicles.clear();
		
		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size());
	}
}