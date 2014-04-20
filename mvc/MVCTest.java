/**
 * MVCTest.java
 * @author anupkhadka
 */

package designpatterns.mvc;

public class MVCTest {

	/**
	 * @args param
	 */
	public static void main(String [] args) {
		ModelClass model = new ModelClass();
		model.setStr("Default View");
		ViewClass view = new ViewClass();
		ControllerClass controller = 
			new ControllerClass(model, view); 

		//draw current view to screen
		controller.redraw();

		//update model
		controller.setStr("Changed View");
		//draw changed view
		controller.redraw();		
	}
}
