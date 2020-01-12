/**
 * @Purpose Tests ths CO2Footprint class with five CO2Footprint objects.
 *
 * @author Josiah Kowalski
 * @version 1/7/20
 */

import java.util.ArrayList;

public class CO2FootprintTester {

	public static void main(String[] args) {
		// declares and initializes a new array list
		ArrayList<CO2Footprint> CarbonFootprint = new ArrayList<CO2Footprint>();
		CarbonFootprint.add(new CO2Footprint(1, 1024.3, 243.50, 0.12, 4, false, false, false, false, 4));
		CarbonFootprint.add(new CO2Footprint(2, 2100.5, 208.89, 0.11, 5, false, true, false, true, 1));
		CarbonFootprint.add(new CO2Footprint(3, 1430.4, 97.49, 0.09, 2, true, false, true, false, 10));
		CarbonFootprint.add(new CO2Footprint(4, 4454.3, 314.17, 0.10, 6, false, true, true, true, 6));
		CarbonFootprint.add(new CO2Footprint(5, 3429.2, 236.78, 0.12, 1, true, false, false, true, 3));

		// calculates the emissions data for each object int the arrayList
		for (CO2Footprint dataRecord : CarbonFootprint) {
			dataRecord.calcTonsCO2();
			dataRecord.convertTonsToPoundsCO2();
			dataRecord.calcElectricityCO2();
			dataRecord.calcGrossWasteEmission();
			dataRecord.calcWasteReduction();
			dataRecord.calcBulbReduction();
			dataRecord.calcCO2Footprint();
        }
        // declare i to keep track of entry #, entry 3 has one character more than the rest 
        // instead of this method I first tried to base the if statement on the length of the return but I couldn't figure out how with the method
        int i = 0;     
        // displays results in a table
		System.out.println("|Entry|              Pounds of CO2            |        Pounds of CO2      |                 |");
		System.out.println("|  #  |              Emitted from             |        Reduced From       |   CO2 Poundage  |");
		System.out.println("|     |    Gas     |  Electricity  |   Waste  |  Recycling  |  New Bulbs  |    Footprint    |");
		System.out.println("|-----|------------|---------------|----------|-------------|-------------|-----------------|");

		for (CO2Footprint dataRecord : CarbonFootprint) {
            if (i > 1 && i <= 2) {
                System.out.printf("|  %1.0f  |  %8.2f  |    %8.2f   |  %7.2f |   %7.2f   |   %5.2f   |   %11.2f   |%n", 
                    dataRecord.getMyIndex(), dataRecord.getMyCO2Gas(), dataRecord.getMyCO2Electricity(), dataRecord.getMyCO2Waste(), 
                    dataRecord.getMyReductionWaste(), dataRecord.getMyReductionBulbs(), dataRecord.getMyCO2Footprint());
            }
            else {
            System.out.printf("|  %1.0f  |  %8.2f  |    %8.2f   |  %7.2f |   %7.2f   |   %5.2f    |   %11.2f   |%n", 
                    dataRecord.getMyIndex(), dataRecord.getMyCO2Gas(), dataRecord.getMyCO2Electricity(), dataRecord.getMyCO2Waste(), 
                    dataRecord.getMyReductionWaste(), dataRecord.getMyReductionBulbs(), dataRecord.getMyCO2Footprint());
                
            }
            i++;
        }
	}
}