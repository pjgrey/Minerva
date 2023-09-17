/**
 * 
 */
package ca.tvos.util;

import java.util.Iterator;

/**
 * A sequence of elements.
 */
public interface Sequence<E> extends Iterable<E> {
	
	/** Returns <code>true</code> if there are more elements in the <code>Sequence</code>*/
	public boolean hasNext();
	
	/** Returns the next element, or <code>null</code> if there are no more elements. Note this is a different behaviour
	 * from <code>java.lang.Iterator</code> which throws an exception if there are no more elements
	 * */
	public E next();

	/** Returns a <code>java.lang.Iterator</code> equivalent to the remainder of this <code>Sequence</code>. */
	@Override
	public default Iterator<E> iterator() {
		return new SequenceIterator<E>(this);
	}

}
