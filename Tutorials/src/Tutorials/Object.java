package Tutorials;

public class Object {
	
   
	public static void main(String args[]) {
		Integer integer = null;
		Object  object = null;
		
		//Prints the integer and object variables which are null java Objects : 
		System.out.println("Object: "+object+" Integer: "+ integer);
		
		//This utilizes the returnWhitespace method 
		System.out.println("Object: "+returnWhiteSpace(object) +" Integer: "+ returnWhiteSpace(integer));
	}
	
	//A method to return whitespace on a null Object
	private static String returnWhiteSpace(Object _object) {
		if(_object == null) {
			return "";
		}
		return " ";	
	}

	//A method to return whitespace on a null Integer or primitive type object
	public static String returnWhiteSpace(Integer _integer) {
		if(_integer == null) {
			return "";
		}
		return " ";		
	}
}



