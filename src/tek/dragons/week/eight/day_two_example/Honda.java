package tek.dragons.week.eight.day_two_example;

public class Honda extends Vehicle{
	public Honda() {
		super("Accord");
	}
	public void running() {
		System.out.println("Honda is one the most exciting car brand");
	}
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}
}
