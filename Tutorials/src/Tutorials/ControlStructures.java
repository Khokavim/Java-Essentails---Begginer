package Tutorials;

import java.lang.reflect.Array;

public class ControlStructures {
	
	public static void main(String args[]){
	
		//TEST SELECTION SORT
		int[] sortedArray;
		int[] array = {90, 93, 9, 78 ,9, 89,45,67}; //Array to sort
		int[][] array2 = [5,6,8];

		sortedArray = selectionSort(array);
		//printArray(sortedArray);
		
		//TEST SWITCH
		String string="";
		string = switchOnAnArray(array);
//		System.out.println(string);
		System.out.println(ternary(1));
		
	}
	
	/*Prints an array of integers
	 * @params integer array
	 * @return void
	 */
	private static void printArray(int[] array) {
		 for(int a=0; a < Array.getLength(array); a++) {
	    	   System.out.println(" "+ array[a]);
	       }		
	}

	/* Sorts an array of integers
	 * @params integer array
	 * @return sorted integer array
	 * 
	 * When specifying the parameters for a method, you declare the data type of the parameter alongside the parameter
	 * E.G int[](data type) array(parameter_name)
	 */
	public static int[] selectionSort(int[] array){
	  	int holder;
		
		for(int i=0; i < Array.getLength(array)-1; i++) {
			
			for (int j=i+1; j < Array.getLength(array);j++) 
			    
				if(array[i] > array[j]) // Compares if the value at array index i is greater than the value at array index j
				{
				 holder=array[i]; //Holds the value at array index i
				 
				 array[i] = array[j]; // Swaps the value at array index i for the value at array index j

				 array[j]=holder;//Assigns the previous value at array index i to array index j
				}	
			}		
		
       return array;
	}

	/*Switches through an array and returns different values
	 * @params integer array
	 * @returns string
	 */
	public static String switchOnAnArray(int[] array) {
		String switchResult = "";
		
		for(int i=0; i< Array.getLength(array); i++) {
			
			switch(array[i]) 
			{
			case 8:  switchResult = "You are assigned to FEMA";
			         break;
			case 90: switchResult = "You are assigned to NCC";
			         continue;
			case 93: switchResult = "You are assigned to NIRA";
			         break;
			}			
		}
		return switchResult;
	}
	
	/* Checks if the condition of a variable is satisfied, assigns a value if it is true then false otherwise
	 * @params integer value j
	 * @return boolean
	 */
	public static boolean ternary(int j) {
	  return j == 1 ? true : false;
	}
}
