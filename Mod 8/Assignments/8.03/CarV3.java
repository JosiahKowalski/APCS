/**
 * Calculates the fuel economy of my car for one tank
 *
 * @author Josiah Kowalski
 * @version 1/4/20
 */
public class CarV3 
{
	// default constructor
	CarV3() {
	}

	// calculates the distance driven
    public int calcDistance(int sMiles, int eMiles) 
    {
		return eMiles - sMiles;
	}

	// calculates the miles per gallon
    public double calcMPG(int dist, double gals) 
    {
		return dist / gals;
	}

    public static void main(String[] args) 
    {
		int startMiles1 = 138242, endMiles1 = 138558, dist1;    // 316 miles
		double gals1 = 10.2, mPG1;
		String carType1 = "Chevy Cobalt 2010";

		// new car1 object
		CarV3 car1 = new CarV3();

		dist1 = car1.calcDistance(startMiles1, endMiles1);
		mPG1 = car1.calcMPG(dist1, gals1);

		System.out.printf("%51s%n", "Gas Mileage Calculations");
		System.out.printf("%13s%23s%13s%12s%11s%13s%n", "Type of Car", "Start Miles", "End Miles", "Distance",
				"Gallons", "Miles/Gal");
		System.out.println("=======================================================================================");
		System.out.printf("%13s%17d%14d%11d%12.1f%12.1f%n", carType1, startMiles1, endMiles1, dist1, gals1, mPG1);
	}
}