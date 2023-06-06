package tek.dragons.week.eight.day_two_example;

public class TestRunner {
	public static void main(String[] args) {
		
		//to run we have to create object and this (Vehicle) is from abstract but we can create from sub-class 
		//Vehicle vehicle = new Vehicle();
		
		Vehicle vehicle = new Lam();
		vehicle.running();
		vehicle.keylessStart(true);
		
		
	}

}
