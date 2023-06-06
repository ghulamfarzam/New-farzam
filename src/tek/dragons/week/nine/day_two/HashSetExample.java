package tek.dragons.week.nine.day_two;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// How to create a new HashSet Instance. 
		
		HashSet<String> cities = new HashSet<>(); 
		
		//How to add values to HashSet;
		
		cities.add("Los Angles");
		cities.add("London");
		cities.add("Alexandria");
		cities.add("Falls Church");
		cities.add("London");
		
		//if there is duplication only one is printed and duplicates will be ignored and override by the first one. 
		
		//how to find the size of HashSet
		
		System.out.println("Hash Set size is " + cities.size());
		
		//How to get value for the HashSet. 
		//the only way is to Loop through the Elements using "For Each" loop. 
		
		for (String city : cities) {
			System.out.println(city);
		}
		//how to remove from HashSet
		
		cities.remove("Los Angles");
		for (String city : cities) {
			System.out.println(city);

	}
	}

}
