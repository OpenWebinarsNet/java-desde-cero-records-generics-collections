package ejemplo2;

public class Box {
	
	public static final Box EMPTY;
	
	static {
		EMPTY = new Box(true);
	}
	
	private Object value;
	
	private boolean empty;
	
	private Box(boolean empty) {
		this.empty = empty;
	}
	
	public Box(Object object) {
		this.value = object;
		if (this.value != null)
			empty = false;
		else
			empty = true;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public Object getValue() {
		return value;
	}
	
	
	public void setObject(Object object) {
		this.value = object;
		if (this.value != null)
			empty = false;
		else
			empty = true;
	}

}
