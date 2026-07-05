/**
 * Copyright (c) 2025
 */
package ca.tvos.app;

import ca.tvos.util.StringUtil;

/**
 * Sequence of command line arguments to process.
 * 
 * @author Peter J. Grey
 */
public class ArgSequence {

	private String[] arg_arr;
	private int pos = 0;

	/* package */ ArgSequence() {
		clear();
	}

	/**
	 * Add new elements to the end of the current sequence
	 * 
	 * @param newArgs Elements to add
	 */
	public synchronized void append(String... newArgs) {
		arg_arr = StringUtil.concat(arg_arr, pos, arg_arr.length - pos, newArgs);
		pos = 0;
	}

	/**
	 * Add new elements to the beginning of the current sequence
	 * 
	 * @param newArgs Elements to add
	 */
	public synchronized void prepend(String[] newArgs) {
		arg_arr = StringUtil.concat(newArgs, arg_arr, pos, arg_arr.length - pos);
		pos = 0;
	}

	/** Next command line element. 
	 * 
	 * @return Next element
	 * */
	public synchronized String next() {
		if (pos < arg_arr.length)
			return arg_arr[pos++];
		else
			return null;
	}

	/* package */ synchronized String peek() {
		if (pos < arg_arr.length)
			return arg_arr[pos];
		else
			return null;
	}

	/** Delete all elements in the sequence. */
	public synchronized void clear() {
		arg_arr = StringUtil.EMPTY_STRING_ARRAY;
		pos = 0;
	}

}
