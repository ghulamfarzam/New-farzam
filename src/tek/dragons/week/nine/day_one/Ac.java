package tek.dragons.week.nine.day_one;

public class Ac {
	public static void main(String[] args) {
		// Create an array that storing 5 numbers and try to assign any number
		// and print the numbers 1 by 1;
		int[] numbers = { 11, 44, 33, 55, 22, 88, 99, 77 };
		System.out.println("Length of the array " + numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
