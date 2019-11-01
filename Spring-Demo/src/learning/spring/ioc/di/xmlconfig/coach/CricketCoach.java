package learning.spring.ioc.di.xmlconfig.coach;

public class CricketCoach implements Coach {
	private String name;
	private FortuneService fs;
	private String emailAddress;
	
	@Override
	public String dailyWorkoutAdvice() {
		return "Bowl 1 hour a day";
	}

	@Override
	public String getDailyFortunes() {
		return fs.getFortune();
	}

	@Override
	public void setFortuneService(FortuneService fs) {
		this.fs = fs;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	

}
