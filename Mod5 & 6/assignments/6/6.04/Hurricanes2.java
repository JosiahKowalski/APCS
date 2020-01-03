/**
 * Calculates the average, maximum, and minimum category, pressure, and wind speed of all the Atlantic Hurricanes
 * which have occurred from 1980 to 2006.
 *
 * @author Josiah Kowalski
 * @version 12/29/19
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Hurricanes2
{
   // public class Hurricane{     ALL THE COMMENTED OUT CODE IS ME TRYING TO MAKE IT BETTER BUT FAILING
   //     public int year;        so theres no need to pay attention to it... sorry if it clutters it
   //     public String month;
   //     public int pressure;
   //     public int windSpeed;
   //     public String name;
   //     public int category;
   // }


    public static void main(String[] args)throws IOException
    {
        //List<Hurricane> hurricanes = new ArrayList<Hurricane>();

        // declare and initialize variables
		int arrayLength = 59;        // change this if adding more entries

        int[] year = new int[arrayLength];
        int[] pressure = new int[arrayLength];
        int[] windSpeed = new int[arrayLength];
        int[] category = new int[arrayLength];
        String[] month = new String[arrayLength];
        String[] name = new String[arrayLength];
        int f0 = 0;         // tropical strom
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int f5 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCat = 0;
        int minCat = 0;
        int maxSpeed = 0;
        int minSpeed = 0;
        int maxPres = 0;
        int minPres = 0;
        int sum = 0;
        int averageCat = 0;
        int averageSpeed = 0;
        int averagePres = 0;

        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);
        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));

        // INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            //Hurricane hurricane = new Hurricane();
            //hurricane.year = inFile.nextInt();
            //hurricane.month = inFile.next();
            //hurricane.pressure = inFile.nextInt();
            //hurricane.windSpeed = inFile.nextInt();
            //hurricane.name = inFile.next();
            //hurricanes.add(hurricane);

            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windSpeed[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();


        // PROCESSING - calculate and convert values

        // convert windspeed from knots to MPH

        //for(Hurricane hurricane : hurricanes) {
        //    hurricane.windSpeed = (int)(hurricane.windSpeed * 1.151);
        //}

        for (int i = 0; i < windSpeed.length; i++) 
        {
            windSpeed[i] = (int)(windSpeed[i] * 1.151);
        }

        //for(Hurricane hurricane : hurricanes) 
        //{
        //    if (hurricane.windSpeed >= 74 && hurricane.windSpeed <= 95) 
        //    {
        //        hurricane.category = 1;
        //    }
        //    else if (hurricane.windSpeed >= 96 && hurricane.windSpeed <= 110) 
        //    {
        //        hurricane.category = 2;
        //    }
        //    else if (hurricane.windSpeed >= 111 && hurricane.windSpeed <= 129) 
        //    {
        //        hurricane.category = 3;
        //    }
        //    else if (hurricane.windSpeed >= 130 && hurricane.windSpeed <= 156) 
        //    {
        //        hurricane.category = 4;
        //    }
        //    else if (hurricane.windSpeed >= 157) 
        //    {
        //        hurricane.category = 5;
        //    }
        //    else 
        //    {
        //        hurricane.category = 0;  // used in case source file has a storm with wind speeds under the threshold
        //    }                     // needed to be a hurricane, will be mentioned as a tropical storm
        //}

        // determine category
        for (int i = 0; i < windSpeed.length; i++) 
        {
            if (windSpeed[i] >= 74 && windSpeed[i] <= 95) 
            {
                category[i] = 1;
            }
            else if (windSpeed[i] >= 96 && windSpeed[i] <= 110) 
            {
                category[i] = 2;
            }
            else if (windSpeed[i] >= 111 && windSpeed[i] <= 129) 
            {
                category[i] = 3;
            }
            else if (windSpeed[i] >= 130 && windSpeed[i] <= 156) 
            {
                category[i] = 4;
            }
            else if (windSpeed[i] >= 157) 
            {
                category[i] = 5;
            }
            else 
            {
                category[i] = 0;  // used in case source file has a storm with wind speeds under the threshold
            }                     // needed to be a hurricane, will be mentioned as a tropical storm
        }

        // count number of each category
        for (int hurricane : category) 
        {                                     // hurricane temporary variable will appear throughout the code,
            if (hurricane == 1)               // it represents each index of an array
            {                                       
                f1++;
            }
            else if (hurricane == 2) 
            {
                f2++;
            }
            else if (hurricane == 3) 
            {
                f3++;
            }
            else if (hurricane == 4) 
            {
                f4++;
            }
            else if (hurricane == 5) 
            {
                f5++;
            }
            else 
            {
                f0++;
            }
        }

        // Find min, max and average for category, windspeed and pressure
        for (int hurricane : category) 
        {
            if (hurricane > max) 
            {
                max = hurricane;
            }
        }
        maxCat = max;
        max = Integer.MIN_VALUE;
        for (int hurricane : category) 
        {
            if (hurricane < min) 
            {
                min = hurricane;
            }
        }
        minCat = min;
        min = Integer.MAX_VALUE;

        for (int hurricane : windSpeed) 
        {
            if (hurricane > max) 
            {
                max = hurricane;
            }
        }
        maxSpeed = max;
        max = Integer.MIN_VALUE;
        for (int hurricane : windSpeed) 
        {
            if (hurricane < min) 
            {
                min = hurricane;
            }
        }
        minSpeed = min;
        min = Integer.MAX_VALUE;

        for (int hurricane : pressure) 
        {
            if (hurricane > max) 
            {
                max = hurricane;
            }
        }
        maxPres = max;
        max = Integer.MIN_VALUE;
        for (int hurricane : pressure) 
        {
            if (hurricane < min) 
            {
                min = hurricane;
            }
        }
        minPres = min;
        min = Integer.MAX_VALUE;

        for (int hurricane : category) 
        {
            sum += hurricane;
        }
        averageCat = (int) (sum / category.length);
        sum = 0;

        for (int hurricane : windSpeed)
        {
            sum += hurricane;
        }
        averageSpeed = (int) (sum / windSpeed.length);
        sum = 0;

        for (int hurricane : pressure) 
        {
            sum += hurricane;
        }
        averagePres = (int) (sum / pressure.length);
        sum = 0;

        // Output - print table using printf to format the columns

        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");

        for (int i = 0; i < year.length; i++) 
        {
           System.out.printf("%4d%12s%11d%16d%18d%n", year[i], name[i], category[i], pressure[i], windSpeed[i]);
        }
        System.out.println("=====================================================================");

        System.out.printf("%7s%20d%16d%18d%n", "Average", averageCat, averagePres, averageSpeed);
        System.out.printf("%7s%20d%16d%18d%n", "Maximum", maxCat, maxPres, maxSpeed);
        System.out.printf("%7s%20d%16d%18d%n", "Minimum", minCat, minPres, minSpeed);
        System.out.println("=====================================================================");

        if (f0 > 0) 
        {
            System.out.println("Number of Tropical Storms: " + f0);   // if the source file has a storm under the threshold
        }                                                             // then it will be mentioned as a tropical storm
        if (f1 > 0) 
        {
            System.out.println("Number of Category 1: " + f1);
        }
        if (f2 > 0)
        {
            System.out.println("Number of Category 2: " + f2);
        }
        if (f3 > 0)
        {
            System.out.println("Number of Category 3: " + f3);
        }
        if (f4 > 0)
        {
            System.out.println("Number of Category 4: " + f4);
        }
        if (f5 > 0)
        {
            System.out.println("Number of Category 5: " + f5);
        }
        // Output - write table to a .txt file
        outFile.println("                      Hurricanes 1980 - 2006");
        outFile.println();
        outFile.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        outFile.println("=====================================================================");

        for (int i = 0; i < year.length; i++) 
        {
            outFile.printf("%4d%12s%11d%16d%18d%n", year[i], name[i], category[i], pressure[i], windSpeed[i]);
        }
        outFile.println("=====================================================================");

        outFile.printf("%7s%20d%16d%18d%n", "Average", averageCat, averagePres, averageSpeed);
        outFile.printf("%7s%20d%16d%18d%n", "Maximum", maxCat, maxPres, maxSpeed);
        outFile.printf("%7s%20d%16d%18d%n", "Minimum", minCat, minPres, minSpeed);
        outFile.println("=====================================================================");

        if (f0 > 0) 
        {
            outFile.println("Number of Tropical Storms: " + f0);   // if the source file has a storm under the threshold
        }                                                             // then it will be mentioned as a tropical storm
        if (f1 > 0) 
        {
            outFile.println("Number of Category 1: " + f1);
        }
        if (f2 > 0)
        {
            outFile.println("Number of Category 2: " + f2);
        }
        if (f3 > 0)
        {
            outFile.println("Number of Category 3: " + f3);
        }
        if (f4 > 0)
        {
            outFile.println("Number of Category 4: " + f4);
        }
        if (f5 > 0)
        {
            outFile.println("Number of Category 5: " + f5);
        }
        outFile.close();

    } // end main()
} // end Hurricanes2
