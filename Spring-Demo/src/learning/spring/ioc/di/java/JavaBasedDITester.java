package learning.spring.ioc.di.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedDITester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SportConfig.class);
		
//		Coach c = appContext.getBean("swimCoach", Coach.class);
//		System.out.println(c.dailyWorkoutAdvice());
//		System.out.println(c.dailyFortuneAdvice());
		
		System.out.println();
		Coach cc = appContext.getBean("BCricketCoach", CricketCoach.class);
		System.out.println(cc.dailyWorkoutAdvice());
		System.out.println(cc.dailyFortuneAdvice());
		System.out.println(cc.hashCode());
//		System.out.println(cc.getCaptain());
//		System.out.println(cc.getHeadCoach());
//		System.out.println(cc.getViceCaptain());
		
		System.out.println();
		cc = appContext.getBean("baseballCoach", Coach.class);
		System.out.println(cc.dailyWorkoutAdvice());
		System.out.println(cc.dailyFortuneAdvice());
		System.out.println(cc.hashCode());
		
//		
		FortuneService gfs = appContext.getBean("gloomyFortuneService", FortuneService.class);
		System.out.println(gfs.todaysFortune());
		
		appContext.close();

	}

}
