package tek.dragons.week.nine.day_one;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// list of Int values. 
		//how to create a list of int values 
		//Create a new instance of ArrayList Class. 
		//ArrayList is a generic Collection.
		//ArrayList only accept non-primitive as Generic Data Type
		//for all the primitive data type we can use the Wrapper Classes. 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//to get the length/size of an ArrayList we should use "size()" method. 
		System.out.println("Array List Size is " + numbers.size());
		
		//How to add numbers to this Array List? "add()" method.
		numbers.add(44);
		numbers.add(33);
		numbers.add(99);
		numbers.add(32);
		numbers.add(93);
		numbers.add(21);
		
		
		System.out.println("Size after adding is " + numbers.size());
		//how to get data for an element from the array list?
		//using get method and passing the index number.
		//if there is no index we will get exception. 
		
		int numberOfIndex = numbers.get(5);
		System.out.println("The number for this index is " + numberOfIndex);
		
		numbers.add(43);
		System.out.println("Size of the array is now " + numbers.size());
		
		
		
		}
			}


