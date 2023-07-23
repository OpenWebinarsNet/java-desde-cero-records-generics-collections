package genericos;

import java.util.Arrays;

public class Pila<T> extends Vector<T> {
	
	public Pila() {
		super();
	}
	
	public Pila(int capacity) {
		super(capacity);
	}
	
	public void push(T elem) {
		super.add(elem);
	}
	
	public T pop() {
		if (size == 0)
			return null;
		T result = super.get(size-1);
		remove(size-1);
		return result;
	}
	
	public T peek() {
		if (size == 0)
			return null;
		return get(size-1);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		return "Pila [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}
	
	
	

}
