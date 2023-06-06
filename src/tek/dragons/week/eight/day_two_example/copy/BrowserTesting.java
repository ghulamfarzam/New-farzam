package tek.dragons.week.eight.day_two_example.copy;

public class BrowserTesting {
	
	public static void main(String[] args) {
		String type = "safari";
		
		Browser browser;
		
		if(type.equals("chrome")) {
			browser = new Chrome();
		}else if (type.equals("safari")) {
			browser = new Safari();
		}else {
			browser = new Edge();
		}
		browser.launchBrowsing();
		
	}

}


		
		
