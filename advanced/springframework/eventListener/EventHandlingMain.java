package eventListener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("event_handling-bean.xml");
		context.start();

		Hello h=(Hello)context.getBean("hello");
		h.showMessage();
		context.stop();
		context.close();
		context.refresh();
		//context
	}

}
