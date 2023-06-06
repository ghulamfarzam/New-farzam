package tek.dragons.week.nine.review;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Activity2 {
	//Create an application to collect score for math, physics, geometry, history in a map
	//take score from user input. 
	//then find the total score, find the grade and find the average. 
	
	public static void main(String[] args) {
			TreeMap<String, Integer> studentGrades = new TreeMap<>();
			studentGrades.put("Math", null);
			studentGrades.put("Physics", null);
			studentGrades.put("Geometry", null);
			studentGrades.put("History", null);
			studentGrades.put("Java", null);
			studentGrades.put("Biology", null);
			studentGrades.put("PE", null);

			Set<String> subjects = studentGrades.keySet();
			for (String subject : subjects) {
				System.out.println("Enter score for " + subject);
				int score = getScoreInput();
				studentGrades.put(subject, score);
			}

			double totalScores = 0;
			for (String subject : subjects) {
				totalScores += studentGrades.get(subject);
			}

			double average = totalScores / subjects.size();
			printGrade(average);

		}

		public static int getScoreInput() {
			int score = 0;
			boolean isCorrectScore = false;
			System.out.println("Enter Score ");
			while (isCorrectScore == false) {
				Scanner scanner = new Scanner(System.in);
				try {
					score = scanner.nextInt();
					if (score < 0 || score > 100) {
						System.out.println("Wrong score input try again");
						isCorrectScore = false;
					} else {
						isCorrectScore = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Wrong score input try again");
					isCorrectScore = false;
				}
			}
			return score;
		}

		private static void printGrade(double score) {
			String grade = "";
			if (score > 90 && score <= 100) {
				grade = "A";
			} else if (score > 80 && score <= 90) {
				grade = "B";
			} else if (score > 70 && score <= 80) {
				grade = "C";
			} else if (score > 60 && score <= 70) {
				grade = "D";
			} else {
				grade = "F";
			}

			System.out.println("Your grade is " + grade);
		}

	}