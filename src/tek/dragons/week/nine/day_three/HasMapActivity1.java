package tek.dragons.week.nine.day_three;

import java.util.HashMap;
import java.util.Set;

public class HasMapActivity1 {

	public static void main(String[] args) {
		// Create a HashMap <String, Integer>
		//put some student name as key, their grade as value
		//if the grade is more than 50 print Student is passed.
		//otherwise Student is failed.
		
		HashMap<String, Integer> students = new HashMap<>();
		students.put("Ahmad", 55);
		students.put("Ali", 45);
		students.put("Mohammad", 49);
		students.put("John", 59);
		students.put("Alex", 50);
		students.put("Samim", 100);
		students.put("Sana", 44);
		
		
		Set<String> mapKeys = students.keySet();
		for(String key : mapKeys) {
			int grade = students.get(key);
			if(grade >= 50) {
				System.out.println(key + " passed the class with " + grade + "%");
			} else {
				System.out.println(key + " failed the class with " + grade + "%");
				
			}
		}
		
		
		

	}

}
