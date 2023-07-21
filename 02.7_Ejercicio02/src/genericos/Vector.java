package genericos;

import java.util.Arrays;

public class Vector<T> {
	private T[] array;
	private int size;

	public Vector() {
		this(10);
	}

	public Vector(int capacity) {
		if (capacity < 0) {
			capacity = 10;
		}
		array = (T[]) new Object[capacity];
		size = 0;
	}

	public void add(T element) {
		if (size == array.length) {
			increase();
		}
		array[size] = element;
		size++;
	}

	public void remove(int pos) {
		if (pos >= 0 && pos < size) {
			for (int i = pos; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			array[size - 1] = null;
			size--;
		}
	}

	public T get(int pos) {
		if (pos >= 0 && pos < size) {
			return array[pos];
		}
		
		return null;
	}
	
	public int size() {
		return size;
	}

	private void increase() {
		int newCapacity = array.length * 2;
		array = Arrays.copyOf(array, newCapacity);
	}
}
