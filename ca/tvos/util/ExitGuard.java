/**
 * 
 */
package ca.tvos.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Instances of this class maintain a global reference count of 
 * exit requests.
 */
public class ExitGuard implements AutoCloseable {

	private static final AtomicInteger count = new AtomicInteger();
	
	private static void attachSingle() {
		count.incrementAndGet();		
	}
	
	private static void detachSingle() {
		if( count.decrementAndGet() == 0 ) {
			System.exit(0);
		}
	}
	
	
	private boolean is_closed = false;
	
	public ExitGuard() {
		attachSingle();
	}

	@Override
	public void close() {
		if( !is_closed ) {
			is_closed = true;
			detachSingle();
		}
		
	}

}
