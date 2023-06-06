package tek.dragons.week.eight.day_one;

public class TestingOverriding {

	public static void main(String[] args) {
		//creating object from sub-class referring to sub-class.
		//no overriding
		
	//	Toyota toyotaObject = new Toyota();
	//	toyotaObject.running();
		
		//Override: we should create object of super-class referring to sub-class. 
		Vehicle vehicleObject = new Toyota();
		vehicleObject.running();
		
		Vehicle vehicleObjFromFord = new Ford();
		vehicleObjFromFord.running();
		
		//Creating object of super-class referring to Sub-Class. 
		Vehicle vehicle = new Vehicle();
		vehicle.running();
		
		Vehicle vehicleBenz = new Benz();
		vehicleBenz.running();
		
		Vehicle vehicleHonda = new Honda();
		vehicleHonda.running();
		
		Vehicle vehicleLincoln = new Lincoln();
		vehicleLincoln.running();

	}

}
