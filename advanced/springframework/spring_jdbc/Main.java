package spring_jdbc;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String []args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring_jdbc_applicationcontext.xml");
	EmployeeDao empdao=(EmployeeDao)context.getBean("dao");
	Scanner sc=new Scanner(System.in);
	
	/* insert
	 Employee e=new Employee();
	e.setEmp_id("6568769");
	e.setEmp_name("bunny");
	e.setDept("java");
	e.setDesg("fullstack");
	e.setEmail("b@gmail.com");
	int res=empdao.insertEmployee(e);
	if(res==1)
		System.out.println(res+"Record inserted....");
	else
		System.out.println("Record not inserted....");
*/

	
/* delete
	System.out.println("enter empid:");
	String id=sc.next();
	 int res1=empdao.deleteEmployee(id);
	
	if(res1==1)
		System.out.println(res1+"Record deleted");
	else
		System.out.println("Record not deleted");
*/
	
	
	//update
	
	System.out.println("enter empid:");
	String id=sc.next();
	System.out.println("enter value u want to update:");
	String desg=sc.next();
	int res2=empdao.updateEmployee(id,desg);
	if(res2==1)
		System.out.println(res2+"Record updated");
	else
		System.out.println("Record not updated");
	}

}
