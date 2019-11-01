package learning.spring.ioc.di.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GloomyFortuneService implements FortuneService {

	@Override
	public String todaysFortune() {
		// TODO Auto-generated method stub
		return "You fatso. you will get diabetes if you keep eating like this.";
	}

}
