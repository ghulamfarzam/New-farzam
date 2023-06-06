package tek.dragons.week.eight.day_two_example;

public class Ford extends Vehicle{
	public Ford() {
		super("Fussion");
		
	}
	
	public void running() {
		System.out.println("I have ford cars");
	}
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}

}
