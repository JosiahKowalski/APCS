/**
 * This program determines the average amount of bottles needed to win a prize with a 1 in 5 
 * chance of winning. Asks the user to input the amount of trials that should run.
 *
 * @author Josiah K.
 * @version 11/24/19
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrize {

    public static void main(String[] args) throws IOException {

        //initialize local variables and objects
        PrintWriter outFile = new PrintWriter(new File("WinningCaps.txt"));
        Scanner in = new Scanner(System.in);
        System.out.println("\nDetermines the average amount of bottles needed to win a prize\nwith a 1 in 5 chance based on a given amount of trials");
        System.out.print("\nPlease enter the number of trials: ");
        int trials = in.nextInt();
        int totalBottles = 0;
        int winningCaps = 0;
        Random randomNumList = new Random();
        int randomNum;
        int totalBottlesFile = 0;
        int sum = 0;
        int average;


        //for loop to write data to the file
        for (int i = 1; i <= trials; i++) 
        {
            totalBottles = 0;
            winningCaps = 0;
            for (int winners = 0; winners >= winningCaps;) 
            {
                randomNum = randomNumList.nextInt(5);
                randomNum += 1;
                if (randomNum == 1) 
                {
                    winningCaps++;
                    totalBottles++;
                }
                else 
                {
                    totalBottles++;
                }
            }
            outFile.println(totalBottles);
        }

        //closes output stream
        outFile.close();

        //reads "WinningCaps.txt" and calculates average
        Scanner inFile = new Scanner(new File("WinningCaps.txt"));
        while (inFile.hasNextInt()) 
        {
            totalBottlesFile = inFile.nextInt();
            sum += totalBottlesFile;
        }
        average = sum/trials;
        System.out.println("Average number of bottles needed for prize: " + average);

        //closes input stream
        inFile.close();
        in.close();
    }
}
