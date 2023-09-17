/**
 * Copyright (c) 2023
 */
package ca.tvos.base;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * 
 */
public class /*static*/ SysIO {
	
	private static final BufferedReader in_ = BuilderSysIO.createReader( StdIO.stdin );
	private static final PrintWriter out_ = BuilderSysIO.createWriter( StdIO.stdout	 );
	private static final PrintWriter err_ = BuilderSysIO.createWriter( StdIO.stderr );
	
	/** <code>java.io.BufferedReader</code> for standard input. */
	public static BufferedReader in() { return in_; }
	
	/** <code>java.io.PrintWriter</code> for standard output. */
	public static PrintWriter out() { return out_; }
	
	/** <code>java.io.PrintWriter</code> for standard error output. */
	public static PrintWriter err() { return err_; }
	
	public static void println(String s) { out_.println(s); }

	// do not instantiate; static members only
	private SysIO() {}
	
}
