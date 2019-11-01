package learning.spring.ioc.di.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MadmanFortuneService implements FortuneService {

	@Override
	public String todaysFortune() {
		// TODO Auto-generated method stub
		return "Everything is an illusion. You and I are not real.";
	}

}
