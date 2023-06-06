package tek.dragons.week.nine.day_two;

import java.util.TreeSet;

public class Activity3 {

	public static void main(String[] args) {
		// Create a TreeSet of type String
		//Add some cities in that TreeSet
		//print the cities. 
		
		TreeSet<String> cities = new TreeSet<>();
		cities.add("Kabul");
		cities.add("New York");
		cities.add("London");
		cities.add("Herat");
		cities.add("Los Angles");
		cities.add("Paris");
		cities.add("Austin");
		cities.add("Birmingham");
		
		System.out.println("The size of the TreeSet is " + cities.size());
		
		for(String city : cities) {
			System.out.println(city);
		}
	}

}
