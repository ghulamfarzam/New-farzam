package tek.dragons.week.nine.day_two;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Rustam");
		names.add("Alex");
		names.add("John");
		names.add("Sora");
		names.add("Tamana");
		names.add("Husnia");
		
		System.out.println("The size of the TreeSet is " + names.size());
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("----------------------");
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(44);
		numbers.add(66);
		numbers.add(22);
		numbers.add(11);
		numbers.add(33);
		numbers.add(89);
		
		System.out.println("The size of TreeSet is " + numbers.size());
		
		for(int value : numbers) {
			System.out.println(value);
		}
	}

}
