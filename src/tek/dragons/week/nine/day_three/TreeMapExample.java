package tek.dragons.week.nine.day_three;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> countries = new TreeMap<>();
		
		countries.put(10, "USA");
		countries.put(14, "France");
		countries.put(8, "England");
		countries.put(20, "Germany");
		
		
		
		for(int key : countries.keySet()) {
			System.out.println(key + " : " + countries.get(key));
		}
		//Remove from the Map;
		countries.remove(10);
		
		//clear() will clear out map. 
		countries.clear();
		
	}

}
