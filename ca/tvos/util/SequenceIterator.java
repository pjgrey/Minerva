/**
 * 
 */
package ca.tvos.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iteraltor equivalent for a <code>Sequential<code>.
 */
/*package*/class SequenceIterator<E> implements Iterator<E> {

	private final Sequence<E> underlying;
	
	public SequenceIterator(Sequence<E> seq) {
		underlying = seq;
	}

	@Override
	public boolean hasNext() {
		return underlying.hasNext();
	}

	@Override
	public E next() {
		E e = underlying.next();
		if( e == null ) throw new NoSuchElementException();
		return e;
	}

}
