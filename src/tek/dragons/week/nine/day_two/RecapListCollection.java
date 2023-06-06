package tek.dragons.week.nine.day_two;

import java.util.ArrayList;
import java.util.LinkedList;

public class RecapListCollection {
	//on top of the array.
	//flexible to manipulation 
	//ArrayList
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mohammad");
		names.add("Ali");
		names.add("Sabor");
		names.add("Ahmad");
		
		//to get the size of the array. 
		System.out.println("The array size is " + names.size());
		
		if(names.isEmpty()) {
			System.out.println("The array is empty");
		} else {
			System.out.println("The array has data");
		}
		for( int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for(String name : names ) {
			if(name.startsWith("A"));
			System.out.println(name);
		}
		
		//how to remove element from an array. 
		names.remove(2);
		
		//remove by value;
		names.remove("Ali");
		System.out.println("Array after removal " + names.size());
		
		//LinkedList
		//the LinkedList has information about previous element and next element 
		//there is space between each index unlike ordinary index.
		//with LInkedList we can get first element and last element. 
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(22);
		numbers.add(12);
		
		int firstElement = numbers.getFirst();
		System.out.println(firstElement);
		int lastElement = numbers.getLast();
		System.out.println(lastElement);
		
		for (int value : numbers) {
			System.out.println(value);
		}
		
	}

}
