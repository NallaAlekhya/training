package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonAddress {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("stereotype-applicationcontext.xml");
		Address ad=(Address)ctx.getBean("add",Address.class);
		ad.setCity("vannepudi");
		ad.setD_no("3-55");
		ad.setState("AP");
		
		
		Person p=(Person)ctx.getBean("per",Person.class);
		p.setId(844342);
		p.setName("ganga");
		p.showDetails();
		
	}

}
