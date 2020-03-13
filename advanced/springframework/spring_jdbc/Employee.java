package spring_jdbc;
public class Employee {
	private String emp_id;
	private String emp_name;
	private String dept;
	private String desg;
	private String email;
	public Employee()
	{
	
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", dept=" + dept + ", desg=" + desg
				+ ", email=" + email + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

