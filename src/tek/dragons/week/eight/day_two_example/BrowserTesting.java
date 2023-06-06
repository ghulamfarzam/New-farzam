package tek.dragons.week.eight.day_two_example;

public class BrowserTesting {
	
	public static void main(String[] args) {
		//1. create object from Class referring to the class
		
		//Edge browser = new Edge();
		//browser.openBrowser();
		
		//2. Create object from interface referring to class. 
		
		//Browser browser = new Edge();
		//browser.openBrowser();
		
		String browserType = "chrome";
		
		Browser browser;
		//if(browserType.equalsIgnoreCase("edge")){
			
		switch(browserType) {
		case "edge": 
			browser = new Edge();
			break;
		case "chrome":
			browser = new Chrome();
			break;
		default:
			browser = new FireFox();
			break;
	}
		browser.openBrowser();
		browser.closeBrowser();
	}

}
