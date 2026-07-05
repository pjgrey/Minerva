/**
 * 
 */
package ca.tvos.app;

/**
 * Simple application framework.
 */
public abstract class Application implements Runnable {

	/** Default constructor does nothing */
	protected Application() {}
	
	/** Pass argument values to <code>Application</code> object and invoke its run 
	 * method.
	 * */
	public static void deploy(Application app, String [] commandLine) {
		app.passArgs(commandLine);
		app.run();
	}
	
	/** Pass argument values to this <code>Application</code>. 
	 * 
	 * @param command line values
	 * */ 
	public void passArgs(String [] args) { /*TEMPORARY*/ }
	

}
