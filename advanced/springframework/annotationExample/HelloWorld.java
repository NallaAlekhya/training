package annotationExample;

public class HelloWorld {
	private String mesg;

	public String getMesg() {
		return mesg;
	}

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}
	public void showMessage()
	{
		System.out.println(mesg);
	}

}
