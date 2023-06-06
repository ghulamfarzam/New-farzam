package tek.dragons.week.eight.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CopyThird {
	
	public static void main(String[] args) {
		// create a program which will do the following
		// 1. have an array of double number with length user want.
		// 2. get input from user and assign into the array.
		// 3. output the sum of numbers in the array.
		
		System.out.print("Enter the length of array: ");
		
		int length = (int) getUserInput();
		
		// Declare double array with given length
		double[] numbers = new double[length];
		// Lets get values from user
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter " + (i + 1) + " number: ");
			numbers[i] = getUserInput();
		}
		// loop through the array to get total of numbers
		double total = 0;
		for (double number : numbers) {
			total += number;
		}
		System.out.println("Total Of Numbers is : " + total);
	}
	public static double getUserInput() {
		boolean isCorrectNumber = false;
		double number = 0;
		while (!isCorrectNumber) {
			Scanner scanner = new Scanner(System.in);
			try {
				number = scanner.nextDouble();
				isCorrectNumber = true;
			} catch (InputMismatchException ex) {
				System.out.print("Wrong Entry retry: ");
			}
		}
			return number;
		}
	}

