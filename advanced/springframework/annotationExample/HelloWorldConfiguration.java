package annotationExample;
import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfiguration {
		@Bean
		public HelloWorld returnBean()
		{
			return new HelloWorld();
		}
		
		@Bean
		public Student studentBean() {
			return new Student("ganga",844342);
		}
	}


