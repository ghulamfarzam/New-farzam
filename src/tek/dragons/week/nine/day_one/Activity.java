package tek.dragons.week.nine.day_one;

import java.util.Scanner;

public class Activity {

	public static void main(String[] args) {
		// Create an array that storing 5 numbers and try to assign any number
		// and print the numbers 1 by 1;

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 11;
		numbers[2] = 11;
		numbers[3] = 12;
		numbers[4] = 22;
		

		System.out.println("length of the array is " + numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//delete value in index 3;
		numbers[3] = 0;

	}
	//array is fixed in size 
	//array is fast but not flexible and not manipulation in the array. 

}
