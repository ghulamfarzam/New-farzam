package tek.dragons.week.nine.day_three;

import java.util.HashMap;
import java.util.Set;

public class HashMapActivity {

	public static void main(String[] args) {
		// Create a hashmap of type <String, String>
		//put some countries as key, and their capical as value;
		//then print all the countries with their capital. 
		
		HashMap<String, String> countries = new HashMap<>();
		countries.put("USA", "Washington D.C");
		countries.put("UK", "London");
		countries.put("France", "Paris");
		countries.put("Italy", "Rome");
		
		String country = countries.get("USA");
		System.out.println(country);
		
		Set<String> keys = countries.keySet();
		System.out.println("The size of HashMap is " + countries.size());
		
		for(String key : keys) {
			System.out.print(key + ": ");
			System.out.println(countries.get(key));
			
		}
		
		
		
	}

}
