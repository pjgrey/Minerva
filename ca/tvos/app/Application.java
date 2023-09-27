/**
 * Copyright (c) 2023
 */
package ca.tvos.app;

import ca.tvos.util.StringUtil;

/**
 * Simple application framework class with command line argument handling.
 * 
 * @author Peter J. Grey
 */
public abstract class Application implements Runnable {

	private String[] arg_arr = StringUtil.EMPTY_STRING_ARRAY;

	/**
	 * Invokes the given <code>Application</code> object with the command line
	 * provided by <code>args</code>.
	 */

	public static void deploy(Application app, String[] args) {
		app.passArgs(args);
		app.run();
	}

	/**
	 * Pass command line arguments to the <code>Application</code>. If arguments
	 * have already been added the new values are added to the end.
	 */
	public final synchronized void passArgs(String[] args) {
		arg_arr = StringUtil.concat(arg_arr, args);
	}

	private synchronized String[] get_args() {
		String[] r = arg_arr;
		arg_arr = StringUtil.EMPTY_STRING_ARRAY;
		return r;
	}

	protected final ArgV argV(OptionHandler handler) {
		if (handler == null)
			handler = new OptionHandler() {
			};
		return new ArgumentVector(get_args(), handler);
	}

}
