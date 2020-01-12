/**
 * Calculates the amount of carbon dioxide emitted for each gallon of gas consumed
 *
 * @author Josiah Kowalski
 * @version 1/6/20
 */
class CO2FootprintV1 {

	// private instance variables
	private double gals;
	private double tonsCO2;
	private double poundsCO2;

	/**
	 * Constructor for objects of type CO2FootprintV1.
	 * @param gals amount of gallons used
	 */
	CO2FootprintV1(double gals) {
		this.gals = gals;
		this.tonsCO2 = 0.0;
		this.poundsCO2 = 0.0;
	}

	/**
	 * Mutator method to calculate how many tons of CO2 are emitted for the gallons of gas used.
	 */
	public void calcTonsCO2() {
		this.tonsCO2 = .00878 * this.gals;
	}

	/**
	 * Mutator method to convert tons to pounds of CO2.
	 */
	public void convertTonsToPoundsCO2() {
		this.poundsCO2 = 2000 * this.tonsCO2;
	}

	/**
	 * Getter method to return the value of tons of CO2.
	 * @return tons of CO2
	 */
	public double getTonsCO2() {
		return this.tonsCO2;
	}

	/**
	 * Getter method to return value of pounds of CO2.
	 * @return pounds of CO2
	 */
	public double getPoundsCO2() {
		return this.poundsCO2;
	}
}