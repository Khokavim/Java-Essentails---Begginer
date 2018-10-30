	
public class HelloWorld  {
   
	public static void main(String args[]) {
		Integer integer = null;
		Object  object = null;
		
		//Prints the integer and object variables which are null java Objects : 
		System.out.println("Object: "+object+" Integer: "+ integer);
		
		//This utilizes the returnWhitespace method 
		System.out.println("Object: "+returnWhitesSpace(object) +" Integer: "+ returnWhitesSpace(integer));
	}
	
	//A static method to return whitespace on a null object or primitive type object
	public static String returnWhitesSpace(Object _object) {
		if(_object == null) {
			return "";
		}
		return " ";		
	}
}
