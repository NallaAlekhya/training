package eventListener;

public class Hello {
 

public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

private String msg;
public void showMessage() {
	System.out.println("message from hello bean is :"+getMsg());
}
}
