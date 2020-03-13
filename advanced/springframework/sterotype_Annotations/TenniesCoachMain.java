package sterotype_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TenniesCoachMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("stereotype-applicationcontext.xml");
		TenniesCoach t=(TenniesCoach)ctx.getBean(TenniesCoach.class);
		t.showMessge();
		
		
		FootBallCoach f=(FootBallCoach)ctx.getBean(FootBallCoach.class);
		System.out.println(f.getDetails());
	}

}
