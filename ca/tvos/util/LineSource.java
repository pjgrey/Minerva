/**
 * 
 */
package ca.tvos.util;

import java.io.IOException;

/**
 * 
 */
public interface LineSource {
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public String readLine() throws IOException;

}
