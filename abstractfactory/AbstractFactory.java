/**
 * Abstract Factory class
 *
 * @author anupkhadka
 */

package designpatterns.abstractfactory;

public abstract class AbstractFactory {
	abstract Car getCar(String carType);
	abstract Coffee getCoffee(String coffeeType);
}
