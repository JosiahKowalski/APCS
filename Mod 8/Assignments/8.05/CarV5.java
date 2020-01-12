/**
 * Calculates the fuel economy of my car for one tank and the price
 *
 * @author Josiah Kowalski
 * @version 1/4/20
 */
public class CarV5 
{
    // private variables 
    private String myCarType;
    private int myStartMiles, myEndMiles;
    private double myGallonsUsed, myPricePerGallon;

    CarV5(String type, int sMiles, int eMiles, double gallons, double gallonPrice) {
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
    
    public static void main(String[] args) 
    {
		int startMiles1 = 138242, endMiles1 = 138558, dist1;    // 316 miles
		double gals1 = 10.2, pricePerGallon1 = 2.59, mPG1, gPM1, totalCost1;
		String carType1 = "Chevy Cobalt 2010";

		// new car1 object
		CarV5 car1 = new CarV5(carType1, startMiles1, endMiles1, gals1, pricePerGallon1);

		dist1 = car1.calcDistance();
        mPG1 = car1.calcMPG(dist1);
        gPM1 = car1.calcGPM(dist1);
        totalCost1 = car1.totalCost();

		System.out.printf("%72s%n", "Gas Mileage Calculations");
		System.out.printf("%13s%23s%13s%12s%11s%9s%8s%13s%13s%n", "Type of Car", "Start Miles", "End Miles", "Distance",
				"Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
		System.out.println("========================================================================================" +
				"=============================");
		System.out.printf("%13s%16d%14d%12d%11.1f%10.2f%9.2f%10.1f%14.3f%n",
				carType1, startMiles1, endMiles1, dist1, gals1, pricePerGallon1, totalCost1, mPG1, gPM1);
	}
}