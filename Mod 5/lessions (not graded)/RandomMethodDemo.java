import java.util.Scanner;

public class RandomMethodDemo
{
 public static void main(String [] args)
 {
 Scanner in = new Scanner (System.in);
 int chosenNumber = in.nextInt();
 double randomNumber;
 int counter = 0;

 while(counter <= chosenNumber)
 {
 randomNumber = Math.random();
 System.out.println(randomNumber);
 counter ++;
 }
 }
} 