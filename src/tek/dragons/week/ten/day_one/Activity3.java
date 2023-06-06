package tek.dragons.week.ten.day_one;

import java.util.ArrayList;
import java.util.Collections;

public class Activity3 {

	public static void main(String[] args) {
		
		ArrayList<String> emails = new ArrayList<>();
		Collections.addAll(emails, "john@gmail.com", "alex@yahoo.com", "mohammad@tekschool.us", 
				"nyc@nycstudetns.net", "G@hotmail.com", "G@hotmail.com");
		
		//from the above print the email provider. gmail, yahoo, tekschool. 
		//first check for valid email address and should have @;
		
		for(String email : emails) {
			if(!email.isEmpty() && email.contains("@")) {
				int indexOfAt = email.lastIndexOf('@');
				int indexOfDot = email.lastIndexOf('.');
				
				//using substring and index numbers. 
				String provider = email.substring(indexOfAt + 1, indexOfDot);
				System.out.println(provider);
			} else {
				System.out.println("Not a valid email -> " + email);
			}
			
			
			
		
		}
		
		
	}

}
