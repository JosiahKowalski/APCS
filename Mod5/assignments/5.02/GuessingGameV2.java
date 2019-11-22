/**
 * This program plays a guessing game with the user 
 * 
 * @author Josiah K.
 * @version 11/20/19
 */
import java.util.Scanner;
public class GuessingGameV2
{
    public static void main(String[] args) 
    {
    // define variables 
    Scanner in = new Scanner(System.in);
    double randomNum = Math.random();
    int randomNumFinal = 0;
    int guessNumber = 0;
    int lowRange = 0;
    int highRange = 0;
    int counter = 0;
    
    // acquiring proper range
    System.out.println("Computer Guessing Game!");
    System.out.println("\nEnter two natural numbers seperated by a space as your range (e.g. 20 50): ");
        lowRange = in.nextInt();
        highRange = in.nextInt();
        highRange += 1;
        randomNumFinal = (int) (((highRange - lowRange) * randomNum) + lowRange);

    // while loop for guessing
    while(guessNumber != randomNumFinal)
    {
        System.out.print("Enter your guess: ");
        guessNumber = in.nextInt();

        if(guessNumber < randomNumFinal)
        {
            System.out.println("Too low");
        }
        else if(guessNumber > randomNumFinal)
        {
            System.out.println("Too high");
        }
        else
        {
            System.out.println("You got it!");
        }
        counter ++; 
    }

    System.out.println("The number was: " + randomNumFinal);
    System.out.println("Number of guesses: " + counter);
    in.close(); 
    }

}
