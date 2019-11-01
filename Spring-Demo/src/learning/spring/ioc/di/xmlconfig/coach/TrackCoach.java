package learning.spring.ioc.di.xmlconfig.coach;

public class TrackCoach implements Coach {
	
	private FortuneService fs;
	public TrackCoach() {}
	public TrackCoach(FortuneService fs){
		this.fs = fs;
	}

	@Override
	public String dailyWorkoutAdvice() {
		return "Jog for 45 min. Sprint for 12 min";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

	@Override
	public void setFortuneService(FortuneService fs) {
		this.fs = fs;		
	}

}
