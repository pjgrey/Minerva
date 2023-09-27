/**
 * Copyright (c) 2023
 */
package ca.tvos.app;

import ca.tvos.util.Sequence;
import ca.tvos.util.StringUtil;

/**
 * 
 * @author Peter J. Grey
 */
public final class ArgSequence implements Sequence<String> {

	private String[] arg_arr;
	private int pos = 0;

	/* package */ ArgSequence(String[] initArgs) {
		arg_arr = initArgs;
	}

	public void prepend(String[] newArgs) {
		arg_arr = StringUtil.concat(newArgs, arg_arr, pos, arg_arr.length - pos);
		pos = 0;
	}

	@Override
	public boolean hasNext() {
		return pos < arg_arr.length;
	}

	@Override
	public String next() {
		if (pos < arg_arr.length)
			return arg_arr[pos++];
		else
			return null;
	}

}
