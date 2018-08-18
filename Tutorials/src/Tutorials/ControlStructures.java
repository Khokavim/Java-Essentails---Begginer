package Tutorials;

import java.lang.reflect.Array;

public class ControlStructures {
	
	public static void main(String args[]){
	
		//TEST SELECTION SORT
		int[] sortedArray;
		int[] array = {90, 93, 9, 78 ,9, 89,45,67}; //Array to sort

		sortedArray = selectionSort(array);
		printArray(sortedArray);
		
		//TEST SWITCH
		String string="";
		string = switchOnAnArray(array);
		System.out.println(string);
		
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
	 */
	public static int[] selectionSort(int[] array){
		/*
		 * SELECTION SORT ALGORITHM
		 */
	  		int holder;
		//int[] arraySorted;
		
		for(int i=0; i < Array.getLength(array)-1; i++) {
			
			for (int j=i+1; j < Array.getLength(array);j++) 
			    
				if(array[i] > array[j]) 
				{
				 holder=array[i];
//				 System.out.println("holder" + holder);
				 
				 array[i] = array[j];
//				 System.out.println("array[i]" + array[i]);

				 array[j]=holder;
//				 System.out.println("array[j]" + array[j]);
				}	
			}
		
		
       return array;
	}

	/*Switches through an array and returns diffrent values
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
}
