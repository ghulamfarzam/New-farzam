package tek.dragons.week.eight.day_one;

public class TestRunner {
	
	public static void main(String[] args) {
		
		String type = "Chrome";
		Browser browser;
		
		if(type.equals("Chrome")) {
			browser = new Chrome();
		} else {
			browser = new Edge();
		}
		
		browser.openBrowser();
		browser.close();
		
		
		//if test needs to run with Chrome
		Browser chromeBrowser = new Chrome();
		chromeBrowser.openBrowser();
		
		//if test needs to run with Edge
		Browser edgeBrowser = new Edge();
		edgeBrowser.openBrowser();
		
	}

}
