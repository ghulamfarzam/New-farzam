package tek.dragons.week.nine.day_one;

import java.util.ArrayList;

public class Activity2 {
	// create an ArrayList of type double
	// add some value
	// print size
	// print elements one by one

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Double> numbers = new ArrayList<Double>();

		numbers.add(44.3);
		numbers.add(33.2);
		numbers.add(22.3);
		numbers.add(11.2);
		numbers.add(99.3);
		numbers.add(23.2);
		
		
		int size = numbers.size();
		
		
		//Get first elemeent in ArrayList
		double firstElement = numbers.get(0);
		
		//Get last element in ArrayList;
		double lastElement = numbers.get(numbers.size() - 1);
		System.out.println("The first elemetn is " + firstElement);
		System.out.println("The last element is " + lastElement);
		
		
		System.out.println("Size of the Array is " + numbers.size());
		
		//Array List works with indexes. 
		for(int i = 0; i<numbers.size(); i++) {
			double number = numbers.get(i);
			System.out.println(number);
			//Thread.sleep(1000);
		}
		
		//another option to loop through the ArrayList? 
		//Recommended option while using Collections. 
		//for each (Enhance Loop); 
		for(double number : numbers) {
			System.out.println(number);
			
		}
	}

}
