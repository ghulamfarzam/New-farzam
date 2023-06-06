package tek.dragons.week.ten.day_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Activity2 {

	public static void main(String[] args) {
		// Create ArrayList of type String and add some names
		//sort the list from z to a
		
		LinkedList<String> names = new LinkedList<>();
		//names.add("Mohammad");
		//names.add("Ali");
		//names.add("Alex");
		//names.add("Masood");
		//names.add("John");
		//names.add("Samim");
		//names.add("Marzia");
		//names.add("Zia");
		
		Collections.addAll(names, "Mohammad", "Ali", "Masood", "John", "Samim", "Marzia", "Zia");
		
		
		//Collections.sort(names);
		//Collections.reverse(names);
		
		//simply using the following method to sort descending. 
		Collections.sort(names, Collections.reverseOrder());
		
		
		for(String name : names) {
			System.out.println(name);
			
			
		}
		
		

	}

}
