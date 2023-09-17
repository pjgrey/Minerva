/**
 * Copyright (c) 2023
 */
package ca.tvos.app;

/**
 * A handler for processing elements in a command line <code>String</code>
 * sequence.
 */
public interface OptionHandler {

	/**
	 * If
	 * <code>arg<code> should be interpreted as a command line option, returns <code>true</code>,
	 * and
	 * <code>seq<code> will be left in a state suitable for processing the next element. If <code>arg<code> is an operand, returns <code>false</code>.
	 * 
	 * Default implementation returns <code>false</code>.
	 */
	public default boolean processOption(String arg, ArgSequence seq) {
		return false;
	}

}
