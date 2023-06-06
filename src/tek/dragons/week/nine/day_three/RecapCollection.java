package tek.dragons.week.nine.day_three;

import java.util.HashSet;
import java.util.TreeSet;
public class RecapCollection {

	public static void main(String[] args) {
		

		//HashSet<Integer> numbers = new HashSet<>();
		TreeSet<Integer> numbers = new TreeSet<>();
		
		
		numbers.add(111);
		numbers.add(222);
		numbers.add(333);
		numbers.add(109);
		numbers.add(222);
		
		System.out.println("Size is " + numbers.size());
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
