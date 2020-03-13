package autowiring;


import java.util.*;

import org.springframework.stereotype.Component;
@Component("add")
public class Address {
	private String city;
	private String d_no;
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getD_no() {
		return d_no;
	}
	public void setD_no(String d_no) {
		this.d_no = d_no;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "city=" + city + ", d_no=" + d_no + ", state=" + state;
	}

	
}

