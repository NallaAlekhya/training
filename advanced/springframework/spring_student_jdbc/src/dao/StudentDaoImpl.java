package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import data.Student;

public class StudentDaoImpl implements IStudentDAo{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertStudent(Student student) {
		String sql="insert into student values(?,?,?)";
		int res=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge());
		if(res==1)
			System.out.println(res+" Record inserted...");
		else
			System.out.println("Record not inserted....");
		
	}

	@Override
	public void getStudent(int id) {
		String sql="select * from student where id=?";
		
		
		
	}

	@Override
	public List<Student> getStudents() {
		String sql="select * from student";
		return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {
			public List<Student> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Student>  list=new ArrayList<Student>();
				while(rs.next()) {
					Student e=new Student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					list.add(e);
				}
				return list;
			}
			});
	}

	@Override
	public void delete(int id) {
		String sql="delete from student where id=?";
		int res=jdbcTemplate.update(sql,id);
		if(res==1)
			System.out.println(res+" Record deleted...");
		else
			System.out.println("Record not deleted....");
		
	}

	@Override
	public void update(Student student) {
		String sql="update student set age=?,name=? where id=?";
		int res=jdbcTemplate.update(sql,student.getAge(),student.getName(),student.getId());
		if(res==1)
			System.out.println(res+"Record updated....");
		else
			System.out.println(res+"Record not updated....");
			
	}

	@Override
	public boolean insertStudentUsingPst(Student student) {
		String sql="insert into student values (?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pst) throws SQLException, DataAccessException {
					pst.setInt(1, student.getId());
					pst.setString(2, student.getName());
					pst.setInt(3, student.getAge());
				return pst.execute();
			}});
	}

}
