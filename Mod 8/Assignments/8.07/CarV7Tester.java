/**
 * Prints the fuel economy of three cars for one tank and the price from 
 * a seperate class
 *
 * @author Josiah Kowalski
 * @version 1/4/20
 */
public class CarV7Tester
{
    public static void main(String[] args) 
    {
		int startMiles1 = 138859, endMiles1 = 139173, dist1;    // 316 miles
		double gals1 = 10.5, pricePerGallon1 = 2.59, mPG1, gPM1, totalCost1;
        String carType1 = "Chevy Cobalt 2010";
        
        int startMiles2 = 11293, endMiles2 = 11629, dist2;    // 336 miles
		double gals2 = 12.1, pricePerGallon2 = 3.19, mPG2, gPM2, totalCost2;
        String carType2 = "BMW 430i 2019";
        
        int startMiles3 = 9823, endMiles3 = 10146, dist3;    // 323 miles
		double gals3 = 9.3, pricePerGallon3 = 2.59, mPG3, gPM3, totalCost3;
		String carType3 = "Hyundai Accent 2020";

		
		// new car1, car2, car3 objects
		CarV7 car1 = new CarV7(carType1, startMiles1, endMiles1, gals1, pricePerGallon1);
		CarV7 car2 = new CarV7(carType2, startMiles2, endMiles2, gals2, pricePerGallon2);
		CarV7 car3 = new CarV7(carType3, startMiles3, endMiles3, gals3, pricePerGallon3);

        // call methods
		dist1 = car1.calcDistance();
        mPG1 = car1.calcMPG(dist1);
        gPM1 = car1.calcGPM(dist1);
        totalCost1 = car1.totalCost();

        dist2 = car2.calcDistance();
        mPG2 = car2.calcMPG(dist2);
        gPM2 = car2.calcGPM(dist2);
        totalCost2 = car2.totalCost();

        dist3 = car3.calcDistance();
        mPG3 = car3.calcMPG(dist3);
        gPM3 = car3.calcGPM(dist3);
        totalCost3 = car3.totalCost();

        // output
		System.out.printf("%72s%n", "Gas Mileage Calculations");
		System.out.printf("%13s%23s%13s%12s%11s%9s%8s%13s%13s%n", "Type of Car", "Start Miles", "End Miles", "Distance",
				"Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
		System.out.println("========================================================================================" +
				"=============================");
		System.out.printf("%13s%16d%14d%12d%11.1f%10.2f%9.2f%10.1f%14.3f%n",
                carType1, startMiles1, endMiles1, dist1, gals1, pricePerGallon1, totalCost1, mPG1, gPM1);
        System.out.printf("%13s%19d%14d%13d%11.1f%10.2f%9.2f%10.1f%14.3f%n",
                carType2, startMiles2, endMiles2, dist2, gals2, pricePerGallon2, totalCost2, mPG2, gPM2);
        System.out.printf("%13s%12d%15d%13d%11.1f%10.2f%9.2f%10.1f%14.3f%n",
				carType3, startMiles3, endMiles3, dist3, gals3, pricePerGallon3, totalCost3, mPG3, gPM3);
    }
}