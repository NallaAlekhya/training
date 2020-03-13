package springExample;

public class Emp {
	private String name;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display() {
		System.out.println("name = "+getName()+" dept = "+getDept());
	}
}
