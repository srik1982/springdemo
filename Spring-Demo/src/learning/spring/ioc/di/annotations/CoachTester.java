package learning.spring.ioc.di.annotations;

import org.springframework.context.ApplicationContext;

import learning.spring.ioc.di.CommonSpringContainer;

public class CoachTester {

	public static void main(String[] args) {
		ApplicationContext appContext = CommonSpringContainer.getInstance().getAppContext();
		Coach c = appContext.getBean("cricketCoach", Coach.class);
		System.out.println(c.dailyFortuneAdvice());
		System.out.println(c.dailyWorkoutAdvice());
		

	}

}
