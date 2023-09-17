/**
 * 
 */
package ca.tvos.app;

import java.util.Iterator;

/**
 * 
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
		return underlying.nextArg();
	}

}
