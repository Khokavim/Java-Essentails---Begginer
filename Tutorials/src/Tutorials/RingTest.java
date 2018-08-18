package Tutorials;

public class RingTest {
	
	public static void main(String args[]) {
		
		//Object Instantiation
	  	Ring ring1=new Ring("Meshach", "red","Classical Ring");
	  	
	    //Set Item color (Ring EXTENDS Collector) 
    	ring1.setItemColor("Blue");
    	
        //Set Ring Weight
	    ring1.setWeight(9);

	    //Set native item params
	    ring1.setRestParams(1, "Gucci", 2005);

	    //print Ring 1 Attributes
	    ring1.printAttributes();
	}

}
