package learning.spring.ioc.di.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MadmanFortuneService implements FortuneService {

	@Override
	public String todaysFortune() {
		// TODO Auto-generated method stub
		return "Everything is an illusion. You and I are not real.";
	}

}
