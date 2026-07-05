/**
 * Copyright (c) 2025
 */
package ca.tvos.base;

import java.io.*;
import java.nio.charset.StandardCharsets;

import ca.tvos.util.AutoFlushPrintWriter;

/**
 * 
 */
public class /*static*/ SysIO {
	
	private static BufferedReader init_reader(InputStream in) {
		try {
			return new BufferedReader( new InputStreamReader(in, System.getProperty("stdin.encoding")) );
		} catch (UnsupportedEncodingException e) {
			return new BufferedReader( new InputStreamReader(in, StandardCharsets.UTF_8) );
		}
	}
	
	private static AutoFlushPrintWriter init_writer(OutputStream out) {
		try {
			return new AutoFlushPrintWriter( new OutputStreamWriter(out, System.getProperty("stdout.encoding")));
		} catch (UnsupportedEncodingException e) {
			return new AutoFlushPrintWriter( new OutputStreamWriter(out, StandardCharsets.UTF_8));
		}
	}

	private static final BufferedReader cin = init_reader(StdIO.stdin); 
	private static final PrintWriter cout = init_writer(StdIO.stdout);
	private static final PrintWriter cerr = init_writer(StdIO.stderr);

	/** <code>java.io.BufferedReader</code> for standard input. */
	public static BufferedReader in() { return cin; }
	
	/** <code>java.io.PrintWriter</code> for standard output. */
	public static PrintWriter out() { return cout; }
	
	/** <code>java.io.PrintWriter</code> for standard error output. */
	public static PrintWriter err() { return cerr; }
	
	/** convenience method for <code>out().println()</code> */
	public static void println(String s) { cout.println(s); }

	// do not instantiate; static members only
	private SysIO() {}
	
}
