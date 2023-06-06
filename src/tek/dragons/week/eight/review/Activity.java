package tek.dragons.week.eight.review;

import java.util.Scanner;

public class Activity {
	// create a program which will do the following
	// 1. have an array of double number with length user want.
	// 2. get input from user and assign into the array.
	// 3. output the sum of numbers in the array.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array.");
		int length = scanner.nextInt();

		// Declare double array with given length.

		double[] numbers = new double[length];

		// let's get values from user
		for (int i = 0; i < numbers.length; i ++) {
			System.out.println("Enter " + (i + 1) + " number: ");
			numbers[i] = scanner.nextDouble();
		}
		// loop through the array to get total of numbers.
		double total = 0;
		for (double number : numbers) {
			total += number;
		}
		System.out.println("Total of numbers is: " + total);
		scanner.close();
	}
}
