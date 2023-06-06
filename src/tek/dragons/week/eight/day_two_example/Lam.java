package tek.dragons.week.eight.day_two_example;

public class Lam extends Vehicle {
	public Lam() {
		super("Lamborgini");
		
	}
	
	public void running() {
		System.out.println("Lamborghini is the most exciting and luxurious car brand and my dream car is Lamborghini Urus");
	}
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}
}
