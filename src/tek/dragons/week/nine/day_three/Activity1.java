package tek.dragons.week.nine.day_three;

import java.util.Set;
import java.util.TreeMap;

public class Activity1 {

	public static void main(String[] args) {
		// String text = "Hello World";
		// find how many times each letter is repeated in above String.

		String text = "Hello Dragons Today is Thursday";

		// we need a map.

		TreeMap<Character, Integer> alphabetCounterMap = new TreeMap<>();

		// Convert the String to char[]
		char[] characters = text.toCharArray();

		for (char eachChar : characters) {
			Integer count = alphabetCounterMap.get(eachChar);
			if (count == null) {
				alphabetCounterMap.put(eachChar, 1);
			} else {
				alphabetCounterMap.put(eachChar, count + 1);
			}

		}

		for (char key : alphabetCounterMap.keySet()) {
			System.out.println(key + " -> " + alphabetCounterMap.get(key));
		}
	}

}
