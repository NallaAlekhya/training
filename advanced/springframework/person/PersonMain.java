package springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("person-bean.xml");
		Person p=(Person)context.getBean("p");
		p.showData();
	}

}
