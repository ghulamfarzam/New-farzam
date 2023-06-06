package tek.dragons.week.eight.day_two_example;

public class Benz extends Vehicle{
	//create a constructor chaining 
	
	public Benz() {
		super("AMG");
		
	}
	public void running() {
		System.out.println("Benz is running fast");
	}
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}

}
//when we have abstract method, every single subclasses are forced to implement. 