package tek.dragons.week.eight.day_two;

public class Recap {
	// Polymorphism
	//Overloading -> constructor or method is same class. 
	//with same name and different parameters.
	//by changing the parameters data type. 
	//by changing the number of parameters.
	
	
	//Override
	//Override happening during the runtime (Execution time). 
	//Override only apply when inheritance 
	//a sub-class can override a method is super-class. 
	//a final or static method can not be override 
	//but can be overload because it is in the same class. 

	public void print(String message) {
		System.out.println(message);
	}

	public void print(double number) {
		System.out.println(number);
	}

	public void print(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		Recap obj = new Recap();
		obj.print("Some message");
		obj.print(100);
		obj.print(2);
	}

}
