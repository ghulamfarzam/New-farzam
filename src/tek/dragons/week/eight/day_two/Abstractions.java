package tek.dragons.week.eight.day_two;

public class Abstractions {
	//abstractions
	//a mechanism to restrict creating object from a class. 
	//Abstract is only used in Inheritance. 
	//1) Abstract classes/Partial abstraction
	//- to make a Class abstract we have to use abstract in class signature. 
	//- an abstract class can have regular variable and methods. 
	//- in abstract class we have abstract methods.  
	
	//Abstract class can have abstract methods. 
	//Abstract method can not have method body. 
	//we have to use abstract keyword in method signature. 
	//all the sub-class is forced to implement the abstract methods implementation. 
	//we have chain with super keyword. 
	
	//2) interface/Fully Abstraction
	//-similar to class but fully abstract.
	//-methods are abstract by default (no need to use abstract keyword). 
	//we can NOT create object from an interfaces. 
	//a class can use interface by using implements keyword. 
	//only constant variables allowed
	//any class that implements to interface have to provide their logic for all the method
	//in interface. 
	
	/*
	 * Difference between Abstract Class and Interface? 
	 * 1. abstract class is partial abstraction vs interface is fully abstract. 
	 * 2. abstract class only use in inheritance with extends keywords. Interface should 
	 * use with implements keyword.
	 * 3. abstract class can have regular methods and abstract methods. 
	 * interface only method signature.
	 * 4. only constants variable in interface. 
	 * 5. a sub-class can extends to only 1 abstract super-class. but a class can implement 
	 * to multiple interface.
	 * 6. a sub-class can inherit to abstract or non-abstract class and at the same time 
	 * implement interfaces.  
	 */
	
	
	
	

}
