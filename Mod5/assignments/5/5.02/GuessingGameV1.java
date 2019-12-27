/**
 * This program plays a guessing game with the user 
 * 
 * @author Josiah K.
 * @version 11/20/19
 */
import java.util.Scanner;
public class GuessingGameV1
{
    public static void main(String[] args) 
    {
    // define variables 
    Scanner in = new Scanner(System.in);
    double randomNum = Math.random();
    int randomNumFinal = 0;
    int guessNumber = 0;
    int counter = 0;
    
    // acquiring proper range
    randomNum += 0.01;
    randomNumFinal = (int)(randomNum * 100);
    System.out.println("\nGuess a number between 1 and 100\n");

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
