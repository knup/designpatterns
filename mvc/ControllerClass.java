/**
 * ControllerClass.java
 * This class implements controller portion of MVC pattern
 * @author anupkhadka
 */

package designpatterns.mvc;

public class ControllerClass {
	private ViewClass view;
	private ModelClass model;

	public ControllerClass(ModelClass model, ViewClass view) {
		this.view = view;
		this.model = model;
	}

	public String getStr() {
		return model.getStr();
	}
	
	public void setStr(String str) {
		model.setStr(str);
	}

	public void redraw() {
		view.draw(getStr());
	}
}
