/**
 * Calculates the x and y coordinates of the points on a circle
 *
 * @author Josiah Kowalski
 * @version 1/2/19
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PointsOnACircleV1 
{
    public static void main(String[] args)throws IOException
    {

        // local variables
        double radius = 1.0;
        double i = 0.1;   // increment
        double x1 = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;
        PrintWriter outFile = new PrintWriter(new File("PointsOnACircle.txt"));

        // table heading
        System.out.println("\tPoints on a Circle of Radius " + radius);
        System.out.printf("%6s%8s%13s%8s%n", "x1", "y1", "x1", "y2");
        System.out.println(" -------------------------------------");

        // table heading for text file
        outFile.println("\tPoints on a Circle of Radius " + radius);
        outFile.printf("%6s%8s%13s%8s%n", "x1", "y1", "x1", "y2");
        outFile.println(" -------------------------------------");

        // processing loop to find and print coordinates
        for (x1 = 1.00; x1 >= -1.00; x1 -= i) 
        {
            y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(x1, 2));
            y2 = 0 - Math.abs(y1);
            System.out.printf("%7.2f%8.2f%13.2f%8.2f%n", x1, y1, x1, y2);
            outFile.printf("%7.2f%8.2f%13.2f%8.2f%n", x1, y1, x1, y2); // print to text file
        }
        outFile.close();
    }
}