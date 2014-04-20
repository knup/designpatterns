/**
 * PlayCommand.java
 * @author anupkhadka
 */

package designpatterns.command;

public class PlayCommand implements Command {
	private String name;
	
	public PlayCommand() {
		name = new String("play");
	}

	public String getName() {
		return name;
	}	
	
	public void execute() {
		System.out.println("Status: Play");
	}	
}
