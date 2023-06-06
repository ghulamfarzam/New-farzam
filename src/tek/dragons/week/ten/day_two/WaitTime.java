package tek.dragons.week.ten.day_two;

public enum WaitTime {
	
		//Enum is a Special class with constants variables (final variable). 
		//Enum can have parameters with using encapsulation concept. 
	SHORT_WAIT(500),
	LONG_WAIT(60000);
	
	private long timeout;
	
	WaitTime(long timeout){
		this.timeout = timeout;
		
	}
	public long getTimeout(){
		return this.timeout;
		
	}

}
