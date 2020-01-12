/**
 * Calculates the fuel economy of three cars for one tank and the price
 *
 * @author Josiah Kowalski
 * @version 1/4/20
 */
public class CarV7 
{
    // private variables 
    private String myCarType;
    private int myStartMiles, myEndMiles;
    private double myGallonsUsed, myPricePerGallon;

    CarV7(String type, int sMiles, int eMiles, double gallons, double gallonPrice) {
		myCarType = type;
		myStartMiles = sMiles;
		myEndMiles = eMiles;
		myGallonsUsed = gallons;
		myPricePerGallon = gallonPrice;
	}

	// calculates the distance driven
    public int calcDistance() 
    {
		return myEndMiles - myStartMiles;
	}

	// calculates the miles per gallon
	public double calcMPG(int dist) {
		return dist / myGallonsUsed;
	}

	// calculates gallons per mile
	public double calcGPM(int dist) {
		return myGallonsUsed / dist;
	}

    // calculates total cost
	public double totalCost() {
		return myPricePerGallon * myGallonsUsed;
    }
}