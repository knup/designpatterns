/**
 * PauseCommand.java
 * @author anupkhadka
 */

package designpatterns.command;

public class PauseCommand implements Command {
	private String name;
	
	public PauseCommand() {
		name = new String("pause");
	}

	public String getName() {
		return name;
	}
	
	public void execute() {
		System.out.println("Status: Pause");
	}	
}
