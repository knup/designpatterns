/**
 * EuroPowerSource.java
 * Class representing European Power Source that generates
 * power using 220 volts
 *
 * @author anupkhadka 
 */

package designpatterns.adapter;

public class EuroPowerSource {
	
	private static final int VOLTAGE = 220;

	public int generatePower() {
		return VOLTAGE;
	}
}
