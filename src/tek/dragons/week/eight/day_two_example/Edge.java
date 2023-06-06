package tek.dragons.week.eight.day_two_example;

public class Edge implements Browser{

	@Override
	public void openBrowser() {
		System.out.println("Opening in Edge Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Edge Browser");
	}

}
