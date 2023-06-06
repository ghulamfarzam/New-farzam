package tek.dragons.week.nine.day_two;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Activity4 {

	public static void main(String[] args) {
		// Create a program that make 10 unique random between 0 - 15;
		
		
		TreeSet<Integer> randomNumbers = new TreeSet<>();
		
		int retryCounter = 0;
		while(randomNumbers.size() < 5) {
			retryCounter ++;
			int random = (int) (Math.random() * 57);
			if(random != 0) {
			randomNumbers.add(random);
		}
		}
		for(int random : randomNumbers) {
			System.out.println(random);
		}
			
		System.out.println("Retry counter is " + retryCounter);
		

	}
	

}
