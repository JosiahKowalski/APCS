/**
 * This program rolls 2 dice given the amount of sides on each die and the amount of times each pair
 * is rolled, then determines the percentage that each sum is rolled.
 *
 * @author Josiah K.
 * @version 11/23/19
 *
 * All the code for this project is provided. Your task is to rearrange it and put it in the correct order.
 * The final program should be indented properly and each section documented.
 *
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbabilityV_2
{
    public static void main(String[] args)
    {
    	//Declare and initialize variables and objects
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; //Number of times sum of dice matches the current sum
        int die1 = 0;
        double probability = 0.0;
        Random randNum = new Random();
        //Print the title of program
        System.out.println("\nCaculates the probability of rolling a certain number on a die");
        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("\nPlease enter the number of sides on a die: ");
        numSides = in.nextInt();
        System.out.print("Please enter the number of rolls: ");
        numRolls = in.nextInt();
        //Print heading for output table
        System.out.print("\n Side of dice \t Probability \n");

                //***************************************************************************************
                //Using nested loops, cycle through the possible sums of the dice.
                //Roll the dice the given number of times for each sum.
                //Count how many times the sum of the dice match the current sum being looked for.
                //***************************************************************************************
        //Loop to increment through the possible sums of the dice
        for( sum = 1; sum <= (numSides * 1); sum++ )
        {
            match = 0;
            
            //Loop to throw dice given number of times
            for( int roll  = 0; roll < numRolls; roll++ )
            {
                //Randomly generate values for two dice
                die1 = randNum.nextInt( numSides ) +1;

                //Check if the sum of dice is equal to the given sum
                if ( die1 == sum )
                {
                    match++;
                } // end if
            } //end for
            
            //After all throws, calculate percentage of throws that resulted in the given sum
            probability = (double)match / numRolls * 100;

            //Print results
            System.out.println("    " + sum + "\t\t" + probability );
        } //end for
        in.close();
    } //end main
}//end class DiceProbability
