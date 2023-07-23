package ejemplo3;

public class Box<T> {
	
	public static final Box<?> EMPTY;
	
	static {
		EMPTY = new Box<>(true);
	}
	
	private T value;
	
	private boolean empty;
	
	private Box(boolean empty) {
		this.empty = empty;
	}
	
	public Box(T object) {
		this.value = object;
		if (this.value != null)
			empty = false;
		else
			empty = true;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public T getValue() {
		return value;
	}
	
	
	public void setObject(T object) {
		this.value = object;
		if (this.value != null)
			empty = false;
		else
			empty = true;
	}

}
