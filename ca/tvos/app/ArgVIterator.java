/**
 * 
 */
package ca.tvos.app;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Peter J. Grey
 */
/*package*/ class ArgVIterator implements Iterator<String> {

	private final ArgV underlying;
	
	/*package*/ ArgVIterator(ArgV argv) {
		underlying = argv;
	}

	@Override
	public boolean hasNext() {
		return underlying.hasNext();
	}

	@Override
	public String next() {
		String n = underlying.nextArg();
		if( n == null ) throw new NoSuchElementException();
		return n; 
	}

}
