package Tutorials;

public class ExecutionTime {

		   public static void main(String[] args) {
			   //Dealing with timestamp (milli, micro, pico, nano) - use primitive type long

		      long startTime = System.currentTimeMillis();

		      long total = 0;
		      for (float i = 0; i < 90000000; i++) {
		         total += i;
		      }
              
		      System.out.println(total);
		      long stopTime = System.currentTimeMillis();
		      long elapsedTime = stopTime - startTime;
		      System.out.println(elapsedTime);
		   }
}
