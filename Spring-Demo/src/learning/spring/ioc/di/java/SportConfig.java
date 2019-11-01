package learning.spring.ioc.di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("sports.properties")
public class SportConfig {

	@Bean
	public Coach BCricketCoach() {
		System.out.println("Bean creator called");
		return new CricketCoach();
	}
	
	@Bean 
	public Coach baseballCoach() {
		return new BaseballCoach();
	}
	
	@Bean 
	public FortuneService gloomyFortuneService() {
		return new FortuneService() {
			
			@Override
			public String todaysFortune() {
				// TODO Auto-generated method stub
				return "Your gloom is as deep as the sea";
			}
		};
	}
}
