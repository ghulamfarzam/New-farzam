package tek.dragons.week.nine.day_two;

import java.util.ArrayList;
import java.util.HashSet;

public class Activity2 {

	public static void main(String[] args) {
		// Create ArrayList of type String
		//Add some countries. 
		
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("England");
		countries.add("France");
		countries.add("Italy");
		countries.add("Switzerland");
		countries.add("Austria");
		countries.add("Canada");
		countries.add("England");
		countries.add("England");
		countries.add("England");
		countries.add("England");
		
		System.out.println("the Size of the ArrayList is " + countries.size());
		
		for (String i : countries) {
			System.out.println(i);
			
		}
		System.out.println("------------------------");
		//Part 2: make a unique countries from that ArrayList. 
		
		HashSet<String> uniqueCountries = new HashSet<>();
		for (String country : countries) {
			System.out.println(country);
			uniqueCountries.add(country);
		}
		
		System.out.println("-------------------------");
		for(String country : uniqueCountries) {
			System.out.println(country);
		}
		//solution 2; to use HashSet constructor that accept another collection. 
		
		HashSet<String> unique = new HashSet<>(countries);
		
		System.out.println("---------------------");
		for(String country : unique) {
			System.out.println(country);
		}
	}

}
