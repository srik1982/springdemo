package learning.spring.ioc.di.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HappyFortuneService implements FortuneService {

	@Override
	public String todaysFortune() {
		return "Today is your lucky day. You shall win a lottery.";
	}

}
