package learning.spring.ioc.di.xmlconfig.coach;

public interface Coach {
	public String dailyWorkoutAdvice();
	public String getDailyFortunes();
	public void setFortuneService(FortuneService fs);
}
