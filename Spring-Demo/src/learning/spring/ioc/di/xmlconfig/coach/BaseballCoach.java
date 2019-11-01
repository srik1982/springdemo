package learning.spring.ioc.di.xmlconfig.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseballCoach implements Coach {
	private FortuneService fs;
	public BaseballCoach(FortuneService fs){
		this.fs = fs;
	}
	
	@Override
	public String dailyWorkoutAdvice() {
		return "Practice batting for 1 hour";
	}
	

	public BaseballCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

	@Override
	@Autowired	
	public void setFortuneService(@Qualifier("madmanFortuneService") FortuneService fs) {
		this.fs = fs;
		
	}
	
	

}
