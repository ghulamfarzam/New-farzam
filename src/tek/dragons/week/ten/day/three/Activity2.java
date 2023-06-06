package tek.dragons.week.ten.day.three;

public class Activity2 {

	public static void main(String[] args) {
		String text = "Something123";
		
		//Remove any number in this String. 
		
		String remove = text.replaceAll("Something123", "Something");
		System.out.println(remove);
		

	}

}
