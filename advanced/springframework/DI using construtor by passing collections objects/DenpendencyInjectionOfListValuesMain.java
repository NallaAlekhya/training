package springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DenpendencyInjectionOfListValuesMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("listbean.xml");
		

		System.out.println("=================== Using List=============");
		DenpendencyInjectionOfListValues d=(DenpendencyInjectionOfListValues)ctx.getBean("obj");
		d.showData();
		
		System.out.println("=================== Using Map=============");
		DenpendencyInjectionUsingMap dm=(DenpendencyInjectionUsingMap)ctx.getBean("obj1");
		dm.show();
		

	}

}
