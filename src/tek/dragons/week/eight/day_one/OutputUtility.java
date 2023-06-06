package tek.dragons.week.eight.day_one;

public class OutputUtility {
	public void print(String message) {
		System.out.println(message);
	}

	public void print(int number) {
		System.out.println(number);
	}

	public void print(boolean value) {
		System.out.println(value);
	}

	public void print(double number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		OutputUtility obj = new OutputUtility();
		obj.print("Sending String to print");
		obj.print(100);
		obj.print(true);
		obj.print(100.2);
	}

}
