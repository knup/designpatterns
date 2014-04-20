/**
 * This class implements a Honda class. 
 * It implements Car interface 
 * 
 * @author anupkhadka
 */
package designpatterns.abstractfactory;

public class Honda implements Car {

	@Override
	public void construct() {
		System.out.println("Constructing a honda car!");
	}
}
