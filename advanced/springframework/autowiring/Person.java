package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("per")
public class Person{
	@Autowired // eventhought we not mentioned spring 5 will automatically detecting dependent object 
	public Person( Address address) {
		super();
		
		this.address = address;
	}
	private String name;
	private int id;
	//dependent obj
	private Address address;

	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void showDetails() {
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("address "+address);
	}


	
	
}
