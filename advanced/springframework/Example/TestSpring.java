package springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
		
		/* same classpath location
		 
		 ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 Hello h=(Hello)context.getBean("hello");
		 h.getMesg()
		 
		 */
		
		// used to load bean.xml in filesystem
		ApplicationContext context=new FileSystemXmlApplicationContext("D://bean.xml");
		//Hello.java
		Hello h=(Hello)context.getBean("hello");
		h.getMesg();
		
		//Emp.java
		Emp e=(Emp)context.getBean("emp");
		e.display();
	}

}
