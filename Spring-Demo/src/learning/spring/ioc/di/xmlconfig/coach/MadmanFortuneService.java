package learning.spring.ioc.di.xmlconfig.coach;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MadmanFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Everything is an illusion. You and I are not real.";
	}

}
