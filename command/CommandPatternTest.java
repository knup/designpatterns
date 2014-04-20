/**
 * CommandPatternTest.java
 * @author anupkhadka
 */

package designpatterns.command;

public class CommandPatternTest {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		CommandProcessor cmdProcessor = new CommandProcessor();
		cmdProcessor.execute("play");
		cmdProcessor.execute("pause");
	}
}
