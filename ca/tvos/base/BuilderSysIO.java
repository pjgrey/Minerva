/**
 * Copyright (c) 2023
 */
package ca.tvos.base;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import ca.tvos.util.AutoFlushPrintWriter;

/**
 * Class to create <code>java.io.Reader</code> and <code>java.io.Writer</code> for 
 * standard input and output.
 */
/*package*/ class /*static*/ BuilderSysIO {

	public static BufferedReader createReader(InputStream is) {
		return new BufferedReader(new InputStreamReader(is));
	}

	public static PrintWriter createWriter(OutputStream os) {
		return new AutoFlushPrintWriter(os);
	}

	// do not instantiate; static members only
	private BuilderSysIO() {}
	
}
