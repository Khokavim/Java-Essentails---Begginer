package Tutorials;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] arguments= {"h","e","l","l","o"};
		 
		List<String> list = new ArrayList<String>();
		
	        for (String a : arguments)
	            list.add(a);
	        Collections.shuffle(list, new Random());
	        System.out.println(list);

	}
	
	/*swap: Swaps the position of two random characters/elements in a list 
	 * 
	 * @params List<E> accepts a list of any primitive or abstract data type, index i , index j
	 * @returns void
	 */
	public static <E> void swap(List<E> a, int i, int j) {
        E tmp = a.get(i);
	    a.set(i, a.get(j));
	    a.set(j, tmp);
	}
	
	/*shuffle: Iterates through a list while swapping the characters/elements in the list 
	 *         Swaps elements list.size() - 1 times. There are a total of "list.size()"! permutations 
	 * 
	 * @params List<?> accepts a list of any primitive or abstract data type , instance of the Random class 
	 * @returns void
	 */
	public static void shuffle(List<?> list, Random rnd) {
	    for (int i = list.size(); i > 1; i--){
	        swap(list, i -1, rnd.nextInt(i));
	      }
	}
	
}
