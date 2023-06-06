package tek.dragons.week.nine.day_one;

import java.util.ArrayList;

public class Activity3 {
	//Create and Array of type String;
	//add some cities of the array
	//print only those cities starting with letter A
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Vegas");
		cities.add("Adelide");
		cities.add("Argos");
		cities.add("London");
		cities.add("Abejan");
		
		
		//how to find out the arrayList have some values?
		boolean isArrayEmpty = cities.isEmpty();
		if(cities.isEmpty()) {
			System.out.println("this Array is empty");
		}else {
			System.out.println("this array have some data");
		}
		
		//how to remove an element in index.
		//reomove() method takes an index number and will remove the element from the ArrayList. 
		//this operation will shift left the index numbers. 
		cities.remove(1);
		
		System.out.println("Array size is " + cities.size());
		for(String city : cities) {
			if(city.startsWith("A")){
				System.out.println(city);
				
		}
		
		}
	}
	}
	
	

