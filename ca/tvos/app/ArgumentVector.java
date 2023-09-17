/**
 * Copyright (c) 2023
 */
package ca.tvos.app;

import ca.tvos.util.StringUtil;

/**
 * 
 */
/*package*/ final class ArgumentVector implements ArgV {
	
	private final ArgSequence arg_seq;
	private final OptionHandler handler;

	/*package*/ ArgumentVector(String[] args, OptionHandler handler) {
		arg_seq = new ArgSequence(args);
		this.handler = handler;
	}

	@Override
	public boolean hasNext() {
		return arg_seq.hasNext();
	}

	@Override
	public String nextArg() {
		if( arg_seq.hasNext() ) {
			String arg = arg_seq.next();
			while( handler.processOption(arg, arg_seq)) {
				arg = arg_seq.next();
				if( arg == null )
					return StringUtil.EMPTY_STRING;
			}
			return arg;
		} 
		else
			return null;
	}

}
