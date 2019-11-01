package learning.spring.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonSpringContainer {

	private static CommonSpringContainer instance = null;
	private ApplicationContext appContext;
	
	private CommonSpringContainer() {
		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static CommonSpringContainer getInstance() {
		if(instance!=null) {
			return instance;
		}else {
			synchronized (CommonSpringContainer.class) {
				instance = new CommonSpringContainer();
			}
			return instance;
		}
	}
	
	public ApplicationContext getAppContext() {
		return appContext;
	}
	
	public static void initializeContainer() {
		getInstance();
	}

}
