/**
 * This class implements a Toyota class. 
 * It implements Car interface 
 * 
 * @author anupkhadka
 */

package designpatterns.abstractfactory;

public class Toyota implements Car {

	@Override
	public void construct() {
		System.out.println("Constructing a Toyota car!");
	}
}
