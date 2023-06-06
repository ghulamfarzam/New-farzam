package tek.dragons.week.nine.day_three;

import java.util.Set;
import java.util.TreeMap;

public class FindKeyBaseOnVale {

	public static void main(String[] args) {
		
		
		TreeMap<String, Long> population = new TreeMap<>();
		
		population.put("USA", 38_500_000L);
		population.put("England", 45_000_000L);
		population.put("France", 250_000_000L);
		population.put("Germany", 61_000_000L);
		
		//find the countries with the population below 50M;
		
		Set<String> keys = population.keySet();
		for(String key : keys) {
			long pop = population.get(key);
			if(pop < 50_000_000) {
				System.out.println(key + " has less than 50M population ");
			}
		}
	}

}
