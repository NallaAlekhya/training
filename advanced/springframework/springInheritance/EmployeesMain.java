package springInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeesMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("inheritance-bean.xml");
		EmployeesDerived e=(EmployeesDerived)ctx.getBean("derived");
		System.out.println(e);

	}

}
