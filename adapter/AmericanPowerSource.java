/**
 * AmericanPowerSource.java
 * Class representing American Power Source that generates
 * power using 110 volts
 *
 * @author anupkhadka 
 */

package designpatterns.adapter;

public class AmericanPowerSource {

	private static final int VOLTAGE = 110;

	public int generatePower() {
		return VOLTAGE;
	}
}
