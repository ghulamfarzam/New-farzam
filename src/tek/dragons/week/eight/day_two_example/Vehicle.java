package tek.dragons.week.eight.day_two_example;

//super-class
public abstract class Vehicle {
	
	//variable
	public String model;
	
	//constructor (Regular)
	public Vehicle(String model) {
		this.model = model;
	}
	
	
	//method (Regular)/concrete method. 
	public void printModel() {
		System.out.println("Vehicle Model " + model);
	}


	//Abstract class can have abstract methods. 
	//abstract method can not have method body. 
	//we have to use abstract keyword in method signature. 
	//all the subclasses are forced to implement the abstract method implementation. 
	
	
	//abstract method and it can not have body. 
	public abstract void running();
	
	public abstract void keylessStart(boolean isKeyless);
	//in this case all the subclass will have error because they do not have this abstract class unless we add it to the subclasses.  
	
	}
	