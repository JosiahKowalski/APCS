/**
 * Tests ths CO2FootprintREF class with five CO2FootprintREF objects.
 *
 * @author Tushaar K.
 * @version 9/19/2016
 */

import java.util.ArrayList;

public class CO2FootprintTesterREF {

	public static void main(String[] args) {
		//declares and initializes a new array list
		ArrayList<CO2FootprintREF> CarbonFootprint = new ArrayList<CO2FootprintREF>();
		CarbonFootprint.add(new CO2FootprintREF(2132.0, 111.50, 0.11, 4, true, true, true, true, 5));
		CarbonFootprint.add(new CO2FootprintREF(2878.5, 202.93, 0.12, 6, false, false, false, true, 1));
		CarbonFootprint.add(new CO2FootprintREF(1504.4, 99.56, 0.10, 2, true, false, true, true, 8));
		CarbonFootprint.add(new CO2FootprintREF(4454.3, 319.39, 0.09, 7, false, true, true, true, 4));
		CarbonFootprint.add(new CO2FootprintREF(2232.2, 232.33, 0.11, 1, true, false, false, true, 3));

		//calculates the emissions data for each object int the arrayList
		for (CO2FootprintREF dataRecord : CarbonFootprint) {
			dataRecord.calcTonsCO2();
			dataRecord.convertTonsToPoundsCO2();
			dataRecord.calcElectricityCO2();
			dataRecord.calcGrossWasteEmission();
			dataRecord.calcWasteReduction();
			dataRecord.calcBulbReduction();
			dataRecord.calcCO2FootprintREF();
		}

		//displays results in a table
		System.out.println("|              Pounds of CO2            |        Pounds of CO2      |                 |");
		System.out.println("|              Emitted from             |        Reduced From       |    Pounds of    |");
		System.out.println("|    Gas     |  Electricity  |   Waste  |  Recycling  |  New Bulbs  |  CO2 Footprint  |");
		System.out.println("|------------|---------------|----------|-------------|-------------|-----------------|");

		for (CO2FootprintREF dataRecord : CarbonFootprint) {
			System.out.printf("|  %8.2f  |    %8.2f   |  %7.2f |   %7.2f   |   %5.2f    |   %11.2f   |%n", dataRecord.getMyCO2Gas(),
					dataRecord.getMyCO2Electricity(), dataRecord.getMyCO2Waste(), dataRecord.getMyReductionWaste(),
					dataRecord.getMyReductionBulbs(), dataRecord.getMyCO2FootprintREF());
		}
	}

}