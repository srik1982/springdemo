package learning.spring.ioc.di.xmlconfig.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Coach myCoach = appContext.getBean("myCoach", Coach.class);
//		
//		System.out.println(myCoach.dailyWorkoutAdvice());
//		System.out.println(myCoach.getDailyFortunes());
		
		
		Coach cc = appContext.getBean("baseballCoach", Coach.class);
		
		System.out.println(cc.getDailyFortunes());
		System.out.println(cc.dailyWorkoutAdvice());

	}

}
