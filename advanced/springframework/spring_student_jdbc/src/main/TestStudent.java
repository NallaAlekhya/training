package main;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import data.Student;

public class TestStudent {

	public static void main(String[] args) {
		//initializing ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("student-applicationcontext.xml");
		
		//get the reference obj for StudentDaoImpl
		StudentDaoImpl sdao=(StudentDaoImpl)ctx.getBean("dao");
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("********* CURD OPERATIONS MENU****************");
		System.out.println("1.insert");
		System.out.println("2.delete");
		System.out.println("3.update");
		System.out.println("4.listdown all records");
		System.out.println("5.exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
			case 1:	
				//Reading student details
				System.out.println("enter details for insertion operation");
				System.out.println("Enter student id:");
				int id=sc.nextInt();
				System.out.println("Enter student name:");
				String name=sc.next();
				System.out.println("Enter student age:");
				int age=sc.nextInt();
				
				//create student type object and assign value to it
				Student stu=new Student();
				stu.setId(id);
				stu.setName(name);
				stu.setAge(age);
				
				//calling create method to insert student object into table
				sdao.insertStudent(stu);
				break;
			case 2:
				//calling delete method to delete record from student table
				System.out.println("enter details for deletion operation");
				System.out.println("enter id u want delete:");
				sdao.delete(sc.nextInt());
				break;
			case 3:
				//calling update method to update values in the record
				System.out.println("enter details for update operation");
				Student s1=new Student();
				System.out.println("enter id :");
				s1.setId(sc.nextInt());
				System.out.println("enter age");
				s1.setAge(sc.nextInt());
				System.out.println("enter name");
				s1.setName(sc.next());
				sdao.update(s1);
				break;
			case 4:
				// extract all records from student table
				List<Student>list=sdao.getStudents();
				for(Student ele:list)
					System.out.println(ele.getId()+" "+ele.getName()+" "+ele.getAge());
				break;
			case 5:
					System.exit(0);
			default:
					System.out.println("wrong choice");
					break;
		}
		
		}
		
		
		
		
		
		
		/*//insertion using preparedstatement
		System.out.println("enter details for insertion operation");
		System.out.println("Enter student id:");
		int id=sc.nextInt();
		System.out.println("Enter student name:");
		String name=sc.next();
		System.out.println("Enter student age:");
		int age=sc.nextInt();
		
		//create student type object and assign value to it
		Student stu=new Student();
		stu.setId(id);
		stu.setName(name);
		stu.setAge(age);
		boolean result=sdao.insertStudentUsingPst(stu);
		if(result)
			System.out.println("insertion done ");
		else
			System.out.println("insertion fail");
		*/

	}
}
