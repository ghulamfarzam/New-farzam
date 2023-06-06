package tek.dragons.week.nine.day_one;

import java.util.LinkedList;

public class LinkedListCollections {
	//LinkedList is another class of list collection.
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(900);
		numbers.add(1000);
		
		System.out.println("Linked List size is " + numbers.size());
		
		int number = numbers.get(2);
		System.out.println(number);
		
		numbers.addFirst(500);
		numbers.addLast(1100);
		
		//LinkedList have method for first element and last element to get them. 
		
		System.out.println("The first element in Linked List is " + numbers.getFirst());
		System.out.println("The last element in Linked List is " + numbers.getLast());
		
		
		
	}
	
	

}
