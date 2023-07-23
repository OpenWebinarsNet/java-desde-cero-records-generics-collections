package ejemplo1;

public class A {
	
	private String s;

	public A(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [s=" + s + "]";
	}
	
	

}
