/**
 * Copyright (c) 2023
 */
package ca.tvos.app;

import java.util.Iterator;

/**
 * @author Peter J. Grey
 */
public interface ArgV extends Iterable<String> {

	/** Returns <code>true</code> if there are more arguments. */
	public boolean hasNext();

	/**
	 * Return the next argument. May return an empty <code>String</code> if last
	 * command line arguments have been processed as options. Returns
	 * <code>null</code> if command line arguments have been exhausted.
	 */
	public String nextArg();

	/**
	 * Return equivalent <code>Iterator</code>.
	 * 
	 */
	@Override
	public default Iterator<String> iterator() {
		return new ArgVIterator(this);
	}

}
