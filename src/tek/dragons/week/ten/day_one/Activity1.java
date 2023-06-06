package tek.dragons.week.ten.day_one;

import java.util.ArrayList;
import java.util.Iterator;

public class Activity1 {

	public static void main(String[] args) {
		// Create an array list of Integers
		//between 0 - 30 just add Odd numbers to ArrayList
		//and print them. 
		
		ArrayList<Integer> numbers = new ArrayList<>();

		for(int i = 0; i <= 10; i++) {
			if(i % 2 != 0) {
				numbers.add(i);
				
			}
		}
		//how to sort ArrayList from lowest to highest. 
		//how to sort ArrayList from highest to lowest. 
		//for each. 
		for(int number : numbers) {
		System.out.println(number);
		
	}
		
		//Regular for loop. 
		for(int i = 0; i < numbers.size(); i++) {
			System.err.println(numbers.get(i));
		}
		
		//using iterator and while loop. 
		Iterator<Integer> numbersIterator = numbers.iterator();
		while(numbersIterator.hasNext()) {
			System.out.println(numbersIterator.next());
		}
		
	}
}
