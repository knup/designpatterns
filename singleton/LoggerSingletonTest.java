/** 
 * LoggerSingletonTest.java 
 * This class tests Logger singleton class
 *
 * @author anupkhadka
 */

package designpatterns.singleton;

public class LoggerSingletonTest {
	
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		LoggerSingleton instance1 = LoggerSingleton.getInstance();
		instance1.addLog("First Log");
		LoggerSingleton instance2 = LoggerSingleton.getInstance(); //This is essentially the same logger
		instance2.addLog("Second Log");
		instance1.printLog(); //This should print both "First Log" and "Second Log"
	}
}
