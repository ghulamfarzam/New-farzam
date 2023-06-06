package tek.dragons.week.nine.day_two;

import java.util.HashSet;
public class Activty {

	public static void main(String[] args) {
		// Create a HashSet of type int 
		//add some values in there
		//print the size 
		//find the Sum of the values. 
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(8);
		numbers.add(9);
		numbers.add(7);

		
		
		System.out.println("The size of HashSet is " + numbers.size());
		
		int total = 0;
		for(int value : numbers) {
			total += value; 
			System.out.println(value);
		}
		System.out.println("The sum of the HashSet is " + total);
	
	}

}
