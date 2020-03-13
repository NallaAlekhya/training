//1.primitives
package DIWithSetterMethods;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Persons {
	private String name;
	private int id;
	//dependent obj
	private Address address;
	//collection 
	private List<String>list;
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
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	private Map<Integer,String>map;
	
	public void getDetails() {
		System.out.println(id+":"+name);
		System.out.println("address:"+address);
		Iterator it=list.iterator();
		System.out.println("list of Technologies are");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**********using map collection**********");
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()) {
			int key=(int)itr.next();
			System.out.println(key+":"+map.get(key));
		}
	}
	
}
