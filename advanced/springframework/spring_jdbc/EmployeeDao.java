package spring_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insertEmployee(Employee e) {
		
		//String sql="insert into employee values (' "+e.getEmp_id()+"','"+e.getEmp_name()+" ','"+e.getDept()+"','"+e.getDesg()+"','"+e.getEmail()+"')";
		//return jdbcTemplate.update(sql);
		String sql="insert into employee values (?,?,?,?,?)";
		return jdbcTemplate.update(sql,e.getEmp_id(),e.getEmp_name(),e.getDept(),e.getDesg(),e.getEmail());
	}
	public int updateEmployee(String empid,String desg) {
		String sql="update employee set desg=? where emp_id=?";
		return jdbcTemplate.update(sql,desg,empid);
	}
	public int deleteEmployee(String empid) {
		String sql="delete from employee where emp_id=?";
		return jdbcTemplate.update(sql,empid);
	}

}
