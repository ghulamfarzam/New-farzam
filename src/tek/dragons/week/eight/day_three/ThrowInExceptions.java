package tek.dragons.week.eight.day_three;

import java.util.Scanner;

public class ThrowInExceptions {
	
	//Throw is keyword used part of the code to throw new Exception and stop execution 
	//throw always require an exception from RunTimeException Family. 
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your age");
	int age = scanner.nextInt();
	
	if(age > 21) {
		System.out.println("You are eligible to drink");
	}else {
		throw new RuntimeException("You are under 21 years old.");
	}
	System.out.println("Code end here");

	}

}
