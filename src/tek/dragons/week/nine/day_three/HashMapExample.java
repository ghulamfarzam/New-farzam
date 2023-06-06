package tek.dragons.week.nine.day_three;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// how to create a HashMap?
		//it is generic and you have define the value.
		//we have to define two data type, the first for Keys and the second for Values
		
		//HashMap<Key, Value> names = new HashMap<>();
		
		HashMap<Integer, String> names = new HashMap<>();
		
		//How to insert data to the map? put(); method and take key and value as arguments. 
		
		names.put(1234, "John");
		names.put(2345, "Alex");
		names.put(3456, "Mohammad");
		names.put(4567, "John");
		
		//If the key is duplicate, the new value will be override with the old value. 
		names.put(3456, "Erica");
		
		//how to retrieve data from map? get(); method and it take key as argument. 
		
		String name = names.get(2345);
		System.out.println(name);

		//how to retrieve all the values from the map? we have get steps to retrieve the values. 
		//1. get the KeySet(); method will return set<> of Keys.  
		//loop through each key
		//using the key and get() method retrieve value. 
		
		Set<Integer> keys = names.keySet();
		System.out.println("The size of values is " + keys.size());
		
		for(int key : keys) {
			String value = names.get(key);
			System.out.println(value);
		}
		
		
		
	}

}
