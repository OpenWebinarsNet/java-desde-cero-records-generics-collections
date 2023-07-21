package colecciones;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortedList<E extends Comparable<E>> extends AbstractList<E> {
	
	
	private final ArrayList<E> internalList;
	
	public SortedList() {
		this.internalList = new ArrayList<>();
	}
	
	public SortedList(Collection<? extends E> collection) {
		this.internalList = new ArrayList<>(collection);
		Collections.sort(this.internalList);
	}

	@Override
	public int size() {
		return this.internalList.size();
	}
	
	
	@Override
	public boolean isEmpty() {
		return this.internalList.isEmpty();
	}

	@Override
	public boolean add(E e) {
		int index = Collections.binarySearch(this.internalList, e);
		if (index < 0) {
			index = -(index + 1);
		}
		this.internalList.add(index, e);
		return true;
	}
	

	@Override
	public E remove(int index) {
		return this.internalList.remove(index);
	}

	@Override
	public void clear() {
		this.internalList.clear();
	}


	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean modified = false;
		for (E e : c) {
			modified = modified || add(e);
			// modified |= add(e);
		}
		return modified;
	}

	@Override
	public E get(int index) {
		return this.internalList.get(index);
	}

}
