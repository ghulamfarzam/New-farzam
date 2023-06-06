package tek.dragons.week.eight.day_two_example;

public class Toyota extends Vehicle{
	
	//vehicle class have constructor with parameters 
	//we have to chain
	
	public Toyota() {
		super("Camry");
	}
	@Override //this override is because of abstractions. 
	public void running() {
		System.out.println("Toyota is very reliable");
	}
	
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
		
	}

}
