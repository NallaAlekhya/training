package DIWithSetterMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonsMain {

	public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("setter-persons-bean.xml");
			Persons p=(Persons)ctx.getBean("person");
			p.getDetails();
			p.getMap();

	}

}
