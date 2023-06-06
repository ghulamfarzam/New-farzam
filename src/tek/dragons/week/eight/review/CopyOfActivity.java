package tek.dragons.week.eight.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CopyOfActivity {
	// create a program which will do the following
	// 1. have an array of double number with length user want.
	// 2. get input from user and assign into the array.
	// 3. output the sum of numbers in the array.

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the length of array: ");
	        int length = 0;
	        try {
	            length = scanner.nextInt();
	        } catch (InputMismatchException ex) {
	            System.out.println("Wrong input for lenght of array");
	            scanner.close();
	            throw new RuntimeException("We Can not countinue");
	        }
	        // Declare double array with given length        
	        double[] numbers = new double[length];
	        // Lets get values from user        
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter " + (i + 1) + " number: ");
	            scanner = new Scanner(System.in);
	            try {
	                numbers[i] = scanner.nextDouble();
	            } catch (InputMismatchException ex) {
	                System.out.println("Wrong Entry");
	            }
	        // loop through the array to get total of numbers        
	        double total = 0;
	        for (double number : numbers) {
	            total += number;
	        }
	        System.out.println("Total Of Numbers is : " + total);
	        scanner.close();
	        }
	}
}
