package genericos;

import java.util.Arrays;

public class VectorOrdenado<T extends Comparable<T>> extends Vector<T> {
	
	private void sort() {
		Arrays.sort(array, 0, size);
	}

	@Override
	public void add(T element) {
		super.add(element);
		sort();
	}

	@Override
	public void remove(int pos) {
		super.remove(pos);
		sort();
	}
	

}
