// DI using constructor with collection objects list and map
package springExample;

import java.util.Iterator;
import java.util.List;

public class DenpendencyInjectionOfListValues {
	private int qid;
	public DenpendencyInjectionOfListValues(int qid, String ques, List<String> list) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.list = list;
	}
	private String ques;
	private List<String>list;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void showData() {
		System.out.println(qid+"." +ques);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
