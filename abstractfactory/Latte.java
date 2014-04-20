/**
 * This class implements a Latte class. 
 * It implements Shape interface 
 * 
 * @author anupkhadka
 */

package designpatterns.abstractfactory;

public class Latte implements Coffee {

	@Override
	public void brew() {
		System.out.println("Drawing a cup of latte");
	}
}
