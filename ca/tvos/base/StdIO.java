/**
 * Copyright (c) 2023
 */
package ca.tvos.base;

import java.io.InputStream;
import java.io.OutputStream;

/** Standard input and output.
 * 
 */
public class StdIO /*static*/ {

	/** Standard input. */
	public static final InputStream stdin = System.in;
	
	/** Standard output. */
	public static final OutputStream stdout = System.out;

	/** Standard error output. */
	public static final OutputStream stderr = System.err;

	// do not instantiate; static members only
	private StdIO() {}
}
