package learning.spring.ioc.di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String dailyWorkoutAdvice() {
		// TODO Auto-generated method stub
		return "Swim 100 meters as warmup";
	}

	@Override
	public String dailyFortuneAdvice() {
		// TODO Auto-generated method stub
		return fortuneService.todaysFortune();
	}

}
