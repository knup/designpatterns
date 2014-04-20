/**
 * This class implements a Cappuccino class. 
 * It implements Coffee interface 
 * 
 * @author anupkhadka
 */

package designpatterns.factory;

public class Cappuccino implements Coffee {

	@Override
	public void brew() {
		System.out.println("Brewing a cup of strong cappuccino");
	}
}
