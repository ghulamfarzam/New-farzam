package tek.dragons.week.ten.day_two;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Recap {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		Collections.addAll(numbers, 25, 26, 22, 23, 24, 100, 10);
		
		//Sort (form highest to lowest). 
	//	Collections.reverse(numbers);
		
		//Sort (from lowest to highest). 
		//Collections.sort(numbers);
		
		Collections.sort(numbers, Collections.reverseOrder());
		//sort only works with list collections. 
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			int number = iterator.next();
			
			if(number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}

		}
		
		
	}
	
	

}
