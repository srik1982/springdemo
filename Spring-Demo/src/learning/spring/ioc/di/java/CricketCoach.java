package learning.spring.ioc.di.java;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class CricketCoach implements Coach {
	
	@Value("${india.captain}")
	private String captain;
	@Value("${india.coach}")
	private String headCoach;
	@Value("${india.vc}")
	private String viceCaptain;
	
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

	public String getCaptain() {
		return captain;
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public String getViceCaptain() {
		return viceCaptain;
	}

}
