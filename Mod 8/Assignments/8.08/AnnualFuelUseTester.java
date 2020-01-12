/**
 * Tests the AnnualFuelUse class with 3 fill-ups
 *
 * @author Josiah Kowalski
 * @version 1/5/20
 */
public class AnnualFuelUseTester {

	public static void main(String[] args) {
		// local variables
		int distMin = Integer.MAX_VALUE;
		int distMax = Integer.MIN_VALUE;
		double minMPG = Double.MAX_VALUE;
		double maxMPG = Double.MIN_VALUE;
		double minPrice = Double.MAX_VALUE;
		double maxPrice = Double.MIN_VALUE;
		double gallonTotal = 0.0;
		double costTotal = 0.0;
		double mPGTotal = 0.0;
		int distTotal = 0;
		int distProjection = 0;
		double gallonProjection = 0.0;
		double mPGProjection = 0.0;
		double costProjection = 0.0;

		// sets array of fillUps
		AnnualFuelUse[] fillUps = {new AnnualFuelUse(1, 1, 138242, 138558, 10.2, 2.59),
				new AnnualFuelUse(2, 7, 138558, 138859, 10.5, 2.59),
				new AnnualFuelUse(3, 14, 138859, 139173, 10.1, 2.59)
		};

		// prints table header
		System.out.printf("%51s%n", "Gas Mileage Calculations");
		System.out.printf("%-7s%7s%14s%12s%11s%6s%10s%8s%7s%n", "Fill Up", "Days",  "Start Miles", "End Miles",
				"Distance", "MPG", "Gallons", "Price", "Cost");

		// prints and calculates table data
		
		for (AnnualFuelUse fillUp : fillUps) {
			fillUp.setMyDistance();
			fillUp.setMyMPG();
			fillUp.setMyCost();
			distMin = fillUp.findDistanceMin(distMin);
			distMax = fillUp.findDistanceMax(distMax);
			minMPG = fillUp.findMPGMin(minMPG);
			maxMPG = fillUp.findMPGMax(maxMPG);
			minPrice = fillUp.findPriceMin(minPrice);
			maxPrice = fillUp.findPriceMax(maxPrice);
			distTotal = fillUp.findDistanceTotal(distTotal);
			gallonTotal = fillUp.findGallonsTotal(gallonTotal);
			costTotal = fillUp.findCostTotal(costTotal);
			mPGTotal = fillUp.findMPGTotal(mPGTotal);
			distProjection = fillUp.findDistanceProjection(distTotal);
			gallonProjection = fillUp.findGallonsProjection(gallonTotal);
			mPGProjection = fillUp.findMPGProjection(mPGTotal);
			costProjection = fillUp.findCostProjection(costTotal);

			System.out.printf("%4d%9d%12d%13d%9d%11.1f%7.1f%9.2f%9.2f%n", fillUp.getMyFill(), fillUp.getMyDays(), 
				fillUp.getMyStartMiles(), fillUp.getMyEndMiles(), fillUp.getMyDistance(), 
				fillUp.getMyMPG(), fillUp.getMyGallons(), fillUp.getMyPrice(), fillUp.getMyCost());
		}

		// prints minimums and maximums
		System.out.println();
		System.out.printf("%8s%39d%11.1f%16.2f%n", "Minimum:", 
				distMin, minMPG, minPrice);
		System.out.printf("%8s%39d%11.1f%16.2f%n", "Maximum:", 
				distMax, maxMPG, maxPrice);

		//prints totals and projections
		System.out.printf("%7s%40d%18.1f%18.2f%n", "Totals:", distTotal,
				gallonTotal, costTotal);
		System.out.printf("%11s%37d%9.1f%8.1f%19.2f%n", "Projections:", 
				distProjection, mPGProjection, gallonProjection,
				costProjection);
	}
}