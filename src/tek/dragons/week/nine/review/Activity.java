package tek.dragons.week.nine.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity {

	
		//Create a program that ask name and school score point(grade)
		//make sure score is between 0 and 100 if not ask again
		//based on score 
		// 91 - 100 (A)
		// 81 - 90 (B) 
		//71 - 80 (C)
		//61 - 70 (D)
		//Below 60 is F
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student name");
		String studentName = scanner.next();
		
		int score = getScoreInput();
		
		printGrade(studentName, score);
	}
	public static int getScoreInput() {
		int score = 0; 
		boolean isCorrectScore = false; 
		System.out.println("Enter Score");
		
		while(isCorrectScore == false) {
			Scanner scanner = new Scanner(System.in);
			try {
				score = scanner.nextInt();
				if(score < 0 || score > 100) {
					System.out.println("Wrong score input try again");
					isCorrectScore = false;
				}else {
					isCorrectScore = true;
				}
		} catch (InputMismatchException e) {
			System.out.println("Wrong score input try again");
			isCorrectScore = false;
		}
		}
		return score;
	}
		
		private static void printGrade(String studentName, int score) {
			String grade = "";
		if(score > 91 && score <= 100) {
			grade = "A";
		} else if (score > 80 && score <= 90) {
			grade = "B";
		} else if(score > 70 && score <= 80) {
			grade = "C";
		} else if(score > 60 && score <= 70) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println(studentName + "'s grade is "	 + grade);

	}
	
	}

