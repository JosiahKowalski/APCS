/**
 * Program to simulate a lottery
 * 
 * @author Josiah K.
 * @version 11/23/19
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        
        String lotteryNum = "";
        String userGuess = "";
        int digit = 0;
        
        //Generate a 3-digit "lottery" number composed of random numbers
        //Simulate a lottery by drawing one number at a time and 
        //concatenating it to the string
        //Identify the repeated steps and use a for loop structure
        for (int i = 1; i <= 3 ; i++)
        {
            double randomNumber = Math.random();
            digit = (int) (randomNumber * 10);
            lotteryNum += digit;
        }

        //Input: Ask user to guess 3 digit number
        System.out.println("Please enter a 3 digit number (115): ");
        userGuess = in.next();

        //Idenify the winning pairs
        String winningFirstPair = lotteryNum.substring(0, 2);
        String userFirstPair = userGuess.substring(0, 2);
        String winningSecondPair = lotteryNum.substring(1, 3);
        String userSecondPair = userGuess.substring(1, 3);
      
        //Compare the user's guess to the lottery number and report results
        if (lotteryNum.equals( userGuess ))
        {
            System.out.println("Winner: " + lotteryNum);
            System.out.println("Congratulations, both pairs matched!");
        }
        else if (winningFirstPair.equals(userFirstPair))
        {
            System.out.println("Winner: " + lotteryNum);
            System.out.println("Congratulations, You won the first pair!");
        }
        else if (winningSecondPair.equals(userSecondPair))
        {
            System.out.println("Winner: " + lotteryNum);
            System.out.println("Congratulations, You won the second pair!");
        }
        else 
        {
            System.out.println("Winner: " + lotteryNum);
            System.out.println("Sorry, No matches. Please try again!");
        }
        in.close();
        
    } //end main
}//end class Lottery