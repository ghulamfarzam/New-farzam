package tek.dragons.week.eight.day_one;

public class Polymorphism {
	//Polymorphism: a method or constructor have different forms. 
	//there are two kinds of polymorphism.
	//1. Overloading/Compile Time /Static
	//2. Overriding /runtime/ dynamic
	
	/* Overloading:  
	 * Happening in the same class only. 
	 * applies on methods and constructors. 
	 * overloading mean methods or constructors have same name but different parameters.
	 * How to apply overloading: 
	 * 1. we should have methods with same name that doing same task. 
	 * by changing the parameters data type. 
	 * changing the number of parameters.  
	 * 
	 * Note: 
	 * - changing method name is not overloading
	 * - changing parameter name is not affecting overloading
	 * - changing the method return type will not affect overloading. 
	 */
	
	
	/* Overriding:  
	 *  it is only happening with inheritance. 
	 *  a sub-class method can override super-class method. 
	 *  sub-class method should have exactly same method signature of super class method. 
	 *  in order to override super-class method, object instantiation should refer to sub-class. 
	 */
	public void doAdding(int first, int second) {
		int result = first + second;
		System.out.println(result);
	}
	public void doAdding(int number1, int number2, int number3) {
		int result = number1 + number2 + number3; 
		System.out.println(result);
	}
	public void doAdding(double first, double second) {
		double result = first + second;
		System.out.println(result);
	}
	public void doAdding (String first, String second) { //this is concatenation in this case we have to do type change.  
		//to do actual math we have to convert from String to double. 
		//parse/convert from String to double. using Wrapper Classes. 
		double firstParsed = Double.parseDouble(first); 
		double secondParsed = Double.parseDouble(second);
		double result = firstParsed + secondParsed; 
		System.out.println(result);
	}
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.doAdding(10, 20);
		obj.doAdding(10.50, 50.67);
		
		obj.doAdding("90.21", "89.23");
	}
	
	//in Java, primitive data type can not be object. 
	

}

