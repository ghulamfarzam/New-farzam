package tek.dragons.week.eight.day_three;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		//compile error is a kind of error that will happen during the compile time
		//and you can not execute your that have compile error. 
	
		
		//logical error is when the code does not produce the expected result. it the job of tester to find this error. 
		
		//Runtime exceptions. 
		//as a tester we stop running if we face error. 
		//as a developer we have to handle the exception and clarify for the user and make an explanation for the user. 
		
		//Runtime Exception: happening during the execution of a code 
		//that code might crash due to error in code mistake or data mistakes. 
		//Handling an exception: try and catch block.
		//if try block executes successfully then execution continues 
		//if try block catch the exception then catch block will execute 
		//every try block should have at least one catch block.
		//a try/catch can have finally block at the end as optional
		//finally block will execute all the time. 
		
		System.out.println("Code starts here");
		try {
		double result = 50 /0;
		System.out.println(result);
		} catch(ArithmeticException exception) {
			System.out.println("an exception happened due to division by 0");
			
		}
		System.out.println("Code ends here");
	}
}
