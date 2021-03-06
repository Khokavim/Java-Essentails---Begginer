package Tutorials;

public class RingTest {
	
	public static void main(String args[]) {
		
		//Object Instantiation
		Collector collector=new Collector("Meshach","Classical Ring","Red");
	  	Ring ring1=new Ring("Meshach", "blue","Classical Ring");
	  	
	  	Collector collect=ring1;
	  	
	  	collector.printItem();
	  	
	    //Set Item color (Ring EXTENDS Collector) 
    	ring1.setItemColor("Blue");
    	
        //Set Ring Weight
	    ring1.setWeight(9);

	    //Set native item params
	    collect.setRestParams(1, "Gucci", 2005);

	    //print Ring 1 Attributes
	    ring1.printAttributes();
	}

}
