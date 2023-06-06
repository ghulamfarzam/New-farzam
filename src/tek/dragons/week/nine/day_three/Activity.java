package tek.dragons.week.nine.day_three;

import java.util.HashMap;
import java.util.Set;
public class Activity {

	public static void main(String[] args) {
		
		HashMap<String, Integer> students = new HashMap<>();
		
		students.put("Ahmad", 90);
		students.put("Ali", 88);
		students.put("Lina", 22);
		students.put("Merry", 44);
		students.put("Liam", 34);
		students.put("John", 50);
		students.put("Alex", 48);
		
		Set<String> keyMap = students.keySet();
		
		for(String key : keyMap) {
			int grade = students.get(key);
			if(grade >= 50) {
				System.out.println(key + " passed the class with " + grade + "%");
			} else {
				System.out.println(key + " failed the class with " + grade + "%");
			}
			
		}
		
		

	}

}
