package tek.dragons.week.ten.day_two;

public class SingletonClass {
	//Singleton is a technique to have only one instance of a class for entire execution. 
	//To achieve Singleton
	//we use 
	//1. Encapsulation
	//2. Static method
	//3. private constructor to avoid any other class creating new object. 
	//4. using selection and null check to return new or old object. 
	
	public String name;
	
	private static SingletonClass object;
	
	private SingletonClass() {} 
	
	public static SingletonClass getInstance() {
		if(object == null) {
			object =  new SingletonClass();
		}
		
		return object;
	}
	public void printName() {
		System.out.println(name);
	}

}
