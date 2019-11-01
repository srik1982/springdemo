package learning.spring.ioc.di.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class HappyFortuneService implements FortuneService {

	@Override
	public String todaysFortune() {
		return "Today is your lucky day. You shall win a lottery.";
	}

}
