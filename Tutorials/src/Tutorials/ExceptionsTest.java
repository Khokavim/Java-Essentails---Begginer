package Tutorials;

import java.lang.reflect.Array;

public class ExceptionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] array= {9,99,0};
	  int k = -1;
      
      exceptions(k, array);
	}
	
	public static void exceptions(int k, int[] array) throws IndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
	  
	try {
		for(int i=k; i < Array.getLength(array);i++) { 
			//Value K must be greater i in all cases. It would throw an IndexOutOfBoundsException if k is less tha i 
		     k=array[i];
		     System.out.println(k);
     	}		
	}catch(IndexOutOfBoundsException e) {
     System.out.println("Please give K a value greater than or equal to 0, K has been set to: K = " + e.getMessage());
     	e.printStackTrace();
	  }finally {
		System.out.println("I was executed");
	  }
	
	}
	
}
