/**
 * 
 */
package ca.tvos.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 */
public class ExitGuard implements AutoCloseable {
	
	private static AtomicInteger count = new AtomicInteger();
	
//	private static AtomicInteger t_count = new AtomicInteger();
	
//	private static void trace(int c) {
//		SysIO.println("[" + t_count.incrementAndGet() + "] ExitGuard (" + c + ")" );
//	}

	public ExitGuard() {
//		final int c = 
				count.incrementAndGet();
//		trace(c);		
	}
	
	@Override
	public void close() {
		final int curr = count.decrementAndGet();
//		trace(curr);
		if( curr == 0 )
			System.exit(0);		
	}

}
