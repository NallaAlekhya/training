package eventListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.web.context.support.RequestHandledEvent;

public class RequestEvent implements ApplicationListener<RequestHandledEvent> {

	@Override
	public void onApplicationEvent(RequestHandledEvent arg0) {
		System.out.println("ioc container received RequestHandledEvent");
		
	}

}
