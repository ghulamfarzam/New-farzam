package tek.dragons.week.ten.day_one;

import java.util.ArrayList;
import java.util.Collections;

public class Activity {

	public static void main(String[] args) {
		// Create an array list of Integers
		//between 0 - 30 just add Odd numbers to ArrayList
		//and print them. 
		
		ArrayList<Integer> numbers = new ArrayList<>();

		for(int i = 0; i <= 20; i++) {
			if(i % 2 != 0) {
				numbers.add(i);
				
			}
		}
		//how to sort ArrayList from lowest to highest. 
		Collections.sort(numbers);
		//how to sort ArrayList from highest to lowest.
		Collections.reverse(numbers);
		//for each. 
		for(int number : numbers) {
		System.out.println(number);
		
	}
		
		
	}
}
