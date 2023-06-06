package tek.dragons.week.ten.day_two;

public class TestingEnum {

	public static void main(String[] args) {
		
		System.out.println(WaitTime.SHORT_WAIT.getTimeout());
		Thread.sleep(WaitTime.SHORT_WAIT.getTimeout());
		
		
		StatusCode code = 
		
		
		switch(code) {
		case APPROVED:
			System.out.println("Approved");
			break;
		case DENIED:
			System.out.println("Denied");
			break;
		case SUBMITTED:
			System.out.println("Submitted");
			break;
		case REJECTED:
			System.out.println("Rejected");
		}
		
		
		
		
		
	//	System.out.println(StatusCode.APPROVED);
	//	System.out.println(StatusCode.DENIED); 
	}

}
