package tek.dragons.week.eight.day_one;

public class Item {
	private String name;
	
	//constructor is used to create object of the class.
	//Constructor Overloading
	public Item() {
		this.name = "";
	}
	public Item(String name) {
		this.name = name; 
	}
	
	//for two or more constructor we should create parameter. 
	
	public void adding(int first, int second) {
		int result = first + second;
		System.out.println(result);
	}
	//public int adding(int first, int second) {
	//	int result = first + second;
	//	System.out.println(result);
	//	return result;
		
		//here we didn't change the parameters but only added returning back. 
		//return type doesn't affect overloading. 
	}


