package annotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		HelloWorld h=(HelloWorld)ctx.getBean(HelloWorld.class);
		h.setMesg("welocome to annotations");
		h.showMessage();
		
		//student bean
		Student s=(Student)ctx.getBean(Student.class);
		//s.setId(844342);
		//s.setName("gangabhavni");
		System.out.println(s);
		
	}

}
