
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author B. Jordan 
 * @version 04/01/08
 */
import java.util.Scanner;
public class PopulationSim
{
	public static void main(String[] args)
	{
		double male = 0;
		double male2 = 0;
		double male3 = 0;
		double male4 = 0;
		double male5 = 0;
		double female = 0;
		double female2 = 0;
		double female3 = 0;
		double female4 = 0;
		double female5 = 0;
		int counter = 1;
		int counter2 = 1;
		int counter3 = 1;
		int counter4 = 1;
		int counter5 = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("What is the population ");
	    int population = in.nextInt();
	    
	    while(counter <= population)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .484)
	        {
	            male++;
	            System.out.println("\t male");
	        }
	        else
	        {
	            female++;
	            System.out.println("\t female");
	           }
	        counter++;      
		}
		
		while(counter2 <= population)
	    {
	        randNum = Math.random();
	        System.out.print(counter2 + "\t" + randNum);
	        
	        if(randNum < .484)
	        {
	            male2++;
	            System.out.println("\t male");
	        }
	        else
	        {
	            female2++;
	            System.out.println("\t female");
	           }
	        counter2++;      
		}
		
		while(counter3 <= population)
	    {
	        randNum = Math.random();
	        System.out.print(counter3 + "\t" + randNum);
	        
	        if(randNum < .484)
	        {
	            male3++;
	            System.out.println("\t male");
	        }
	        else
	        {
	            female3++;
	            System.out.println("\t female");
	           }
	        counter3++;      
		}
		
		while(counter4 <= population)
	    {
	        randNum = Math.random();
	        System.out.print(counter4 + "\t" + randNum);
	        
	        if(randNum < .484)
	        {
	            male4++;
	            System.out.println("\t male");
	        }
	        else
	        {
	            female4++;
	            System.out.println("\t female");
	           }
	        counter4++;      
		}
		
		while(counter5 <= population)
	    {
	        randNum = Math.random();
	        System.out.print(counter5 + "\t" + randNum);
	        
	        if(randNum < .484)
	        {
	            male5++;
	            System.out.println("\t male");
	        }
	        else
	        {
	            female5++;
	            System.out.println("\t female");
	           }
	        counter5++;      
		}
		double averageMale = 0;
		averageMale = (male + male2 + male3 + male4 + male5) / 5;
		double averageFemale = 0;
		averageFemale = (female + female2 + female3 + female4 + female5) / 5;

	    System.out.println();
	    System.out.println("Number of males = " + male + "\t" + male2 + "\t" + male3 + "\t" + male4 + "\t" + male5);
	    System.out.println("Number of females = " + female+ "\t" + female2 + "\t" + female3 + "\t" + female4 + "\t" + female5);
		System.out.println("Average males = " + averageMale);
		System.out.println("Average females = " + averageFemale);
	    in.close();
	    
	}
}
