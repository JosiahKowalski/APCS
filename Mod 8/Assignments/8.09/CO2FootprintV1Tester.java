/**
 * Tests the CO2FootprintV1 Class
 *
 * @author Josiah Kowalski
 * @version 1/6/20
 */
public class CO2FootprintV1Tester {

	public static void main(String[] args) {

		// local variables and objects
		double gals = 800.0;
		CO2FootprintV1 emissions = new CO2FootprintV1(gals);

		// calculate values
		emissions.calcTonsCO2();
		emissions.convertTonsToPoundsCO2();

		// print results
		System.out.printf("%32s%n", "CO2 Emissions");
		System.out.printf("%16s%17s%16s%n", "Gallons of Gas", "Pounds from Gas", "Tons from Gas");
		System.out.println("**************************************************");
		System.out.printf("%12.1f%18.2f%16.3f%n", gals, emissions.getPoundsCO2(), emissions.getTonsCO2());
	}
}