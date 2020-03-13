package dao;

import java.util.List;

import data.Student;

public interface IStudentDAo {
	//used to create a record in student table
	public void insertStudent(Student student);
	
	//used to list down a record from the student table corresponding to passed student id
	public void getStudent(int id);
	
	//used to list down all records in student table
	public List<Student>getStudents();
	
	//used to delete record from student table corresponding passed student id
	public void delete(int id);
	
	//used to update record in student table
	public void update(Student student);
	
	//insert record into student table using preparedstatementcallback  interface
	public boolean insertStudentUsingPst(Student student);
}
