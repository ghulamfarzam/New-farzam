package tek.dragons.week.ten.day_two;

public class SingletonTesting {

	public static void main(String[] args) {
		
		SingletonClass obj1 = SingletonClass.getInstance();
		obj1.name = "John";
		obj1.printName();
		
		SingletonClass obj2 = SingletonClass.getInstance();
		obj2.name = "Alex";
		obj2.printName();
		
		System.out.println("-------------------------");
		obj1.printName();
		
		
		System.out.println("-------------------------");
		SingletonClass obj3 = SingletonClass.getInstance();
		obj3.name = "Mohammad";
		
		obj3.printName();
		obj2.printName();
		obj1.printName();
	}

}
