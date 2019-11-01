package learning.spring.ioc.di.xmlconfig.point;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TriangleTester {

	public static void main(String[] args) {
		ApplicationContext appContext = learning.spring.ioc.di.CommonSpringContainer.getInstance().getAppContext();
		
		Triangle t = appContext.getBean("triangle", Triangle.class);
		System.out.println(t.toString());
		
		((ClassPathXmlApplicationContext)appContext).close();

	}

}
