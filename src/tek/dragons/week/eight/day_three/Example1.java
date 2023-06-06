package tek.dragons.week.eight.day_three;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// every try/catch block can have one finally as optional.
		try {
			System.err.println("Enter your age");
			int number = scanner.nextInt();
			System.out.println("Your age is " + number);
		} catch (RuntimeException exception) {
			System.out.println("You have to enter a number for your age");
		} finally {
			// finally block means no matter if try block execute successfully or try block
			// catch an exception, "finally" block will get executed.
			System.out.println("Finally Block executed");
			scanner.close();

			// if we don't know what exception will happen we have to use exception family
			// (RuntimeException).

		}

	}
}
