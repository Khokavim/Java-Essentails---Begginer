package Tutorials;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Deque;

public class DequeExample {
	public static void main(String[] args) {
		//A deque is a LinkedList with that can have elements appended/removed from the beginning or end of the the queue
		
		Deque<String> myQueue = new LinkedList<>(); 

		// add elements in the queue using offer() - return true/false
		myQueue.addFirst("Tuesday");
		myQueue.offer("Monday");
		myQueue.offer("Thursday");
		myQueue.add("Sunday");
		boolean flag = myQueue.offer("Wednesday");
		
		System.out.println("Wednesday inserted successfully? "+flag);
		
		// add more elements using add() - throws IllegalStateException
		try {
			myQueue.add("Saturday");
			myQueue.add("Friday");
			myQueue.add("Weekend");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pick the head of the queue: " + myQueue.peek());
		
		String head = null;
		String tail = null;
		try {
			// remove head - remove()
			head = myQueue.removeFirst();
			System.out.print("1) Push out " + head + " from the deque "); 
			System.out.println("and the new head is now: "+myQueue.getFirst());
			
			tail = myQueue.removeLast();
			System.out.print("2) Push out " + tail + " from the deque "); 
			System.out.println("and the new tail is now: "+myQueue.getLast());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
		// remove the head - poll()
		head = myQueue.pollLast();
		System.out.print("2) Push out " + tail + " from the deque");
		System.out.println("and the new tail is now: "+myQueue.peekLast());
		
		// find out if the queue contains an object using contains() - returns true/false
		System.out.println("Does the queue contain 'Weekend'? " + myQueue.contains("Weekend"));
		System.out.println("Does the queue contain 'Monday'? " + myQueue.contains("Monday"));
	}

}
