package tek.dragons.week.eight.day_three;

import java.util.Scanner;

public class Activity {
	
	//on main method declare a int number = assign any number;
	//then check if the number is odd print the number is odd.
	//otherwise throw RuntimException with message. 
	
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number % 2 != 0) {
			System.out.println(number + " is odd");
		} else {
			throw new RuntimeException(number + " is not odd");
		}
		
	}

}
