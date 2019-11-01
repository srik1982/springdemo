package learning.spring.ioc.di.annotations;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	
	@Autowired
	@Qualifier("gloomyFortuneService")	
	private FortuneService fortuneService;
	
	@Override
	public String dailyWorkoutAdvice() {
		
		return "Bowl 1 hour a day";
	}

	@Override
	public String dailyFortuneAdvice() {
		// TODO Auto-generated method stub
		return fortuneService.todaysFortune();
	}

}
