package springExample;

import java.util.Iterator;
import java.util.Map;

public class DenpendencyInjectionUsingMap {
	
	private Map<String,String>ans;
	
	public Map<String, String> getAns() {
		return ans;
	}
	public void setAns(Map<String, String> ans) {
		this.ans = ans;
	}
	public DenpendencyInjectionUsingMap(Map<String, String> ans) {
		super();
	
		this.ans = ans;
	}
	public void show() {
		Iterator it=ans.keySet().iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key +" is answered by "+ans.get(key));
		}
		
	}

}
