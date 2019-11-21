
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author B. Jordan 
 * @version 04/01/08
 */
import java.util.Scanner;
public class CoinFlipper
{
	public static void main(String[] args)
	{
		double heads = 0;
		double heads2 = 0;
		double heads3 = 0;
		double heads4 = 0;
		double heads5 = 0;
		double tails = 0;
		double tails2 = 0;
		double tails3 = 0;
		double tails4 = 0;
		double tails5 = 0;
		int counter = 1;
		int counter2 = 1;
		int counter3 = 1;
		int counter4 = 1;
		int counter5 = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How many flips: ");
	    int flips = in.nextInt();
	    
	    while(counter <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .24)
	        {
	            heads++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails++;
	            System.out.println("\t tails");
	           }
	        counter++;      
		}
		
		while(counter2 <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter2 + "\t" + randNum);
	        
	        if(randNum < .24)
	        {
	            heads2++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails2++;
	            System.out.println("\t tails");
	           }
	        counter2++;      
		}
		
		while(counter3 <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter3 + "\t" + randNum);
	        
	        if(randNum < .24)
	        {
	            heads3++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails3++;
	            System.out.println("\t tails");
	           }
	        counter3++;      
		}
		
		while(counter4 <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter4 + "\t" + randNum);
	        
	        if(randNum < .24)
	        {
	            heads4++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails4++;
	            System.out.println("\t tails");
	           }
	        counter4++;      
		}
		
		while(counter5 <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter5 + "\t" + randNum);
	        
	        if(randNum < .24)
	        {
	            heads5++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails5++;
	            System.out.println("\t tails");
	           }
	        counter5++;      
		}
		double averageheads = 0;
		averageheads = (heads + heads2 + heads3 + heads4 + heads5) / 5;
		double averagetails = 0;
		averagetails = (tails + tails2 + tails3 + tails4 + tails5) / 5;

	    System.out.println();
	    System.out.println("Number of heads = " + heads + "\t" + heads2 + "\t" + heads3 + "\t" + heads4 + "\t" + heads5);
	    System.out.println("Number of tails = " + tails+ "\t" + tails2 + "\t" + tails3 + "\t" + tails4 + "\t" + tails5);
		System.out.println("Average heads = " + averageheads);
		System.out.println("Average tails = " + averagetails);
	    in.close();
	    
	}
}
