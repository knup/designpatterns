/**
 * CommandProcessor.java
 * @author anupkhadka
 */

package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {
	private List<Command> commandList = new ArrayList<Command>();

	public CommandProcessor() {
		commandList.add(new PlayCommand());
		commandList.add(new PauseCommand());
	}

	public void execute(String cmdStr) {
		for (Command c : commandList) {
			if (c.getName().equalsIgnoreCase(cmdStr)) {
				c.execute();
				break;
			}	
		}	
	}
}
