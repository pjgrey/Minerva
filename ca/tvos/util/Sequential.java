/**
 * 
 */
package ca.tvos.util;

import java.util.Iterator;

/**
 * Sequential differs from Iterator in that next() returns null if elements have been exhausted 
 * instead of throwing an exception.
 */
public interface Sequential<E> {
	
	public E next();
	public boolean hasNext();
	
	public /*default*/ Iterator<? extends E> asIterator();

}
