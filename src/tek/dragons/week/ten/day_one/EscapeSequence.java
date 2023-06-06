package tek.dragons.week.ten.day_one;

public class EscapeSequence {

	public static void main(String[] args) {
		// someone said "We love Java" in a meeting. 
		
		String text = "Someone said \"we love Java\" in a meeting"; 
		String sentence = "Today was find. tempreature was rising";
		
		String[] name = sentence.split("\\.");
		System.out.println(name[0]);
		System.out.println(name[1].trim());
		
		System.out.println("info \t at the tab line");
		System.out.println("info \n at the tab line");

	}

}
