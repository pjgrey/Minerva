package ca.tvos.util;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseIteration<T> implements Iterable<T> {
	
	private final List<T> list; 
	
	public ReverseIteration(List<T> list){
		this.list = list;
	}

	/** <code>Iterator</code> over underlying <code>List</code> in reverse order. */
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			final ListIterator<T> it = list.listIterator(list.size());
			
			@Override
			public boolean hasNext() {
				return it.hasPrevious();
			}

			@Override
			public T next() {
				return it.previous();
			}};
	}

	
	
}