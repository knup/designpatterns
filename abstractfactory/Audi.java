/**
 * This class implements an Audi class. 
 * It implements Car interface 
 * 
 * @author anupkhadka
 */
package designpatterns.abstractfactory;

public class Audi implements Car {

	@Override
	public void construct() {
		System.out.println("Constructing an Audi car!");
	}
}
