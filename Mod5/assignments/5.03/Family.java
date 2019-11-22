/**
 * Determines the probability that a family with two children will consist of 
 * two boys, a boy and a girl, or two girls. 
 * 
 * @author Josiah K.
 * @version 11/21/19
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main( String [] args ) throws IOException
    {
        // local variables
        Scanner inFile = new Scanner( new File ( "test2.txt" ) );
        String token = "";
        int counter = 0;
        int BBCounter = 0;
        int BGCounter = 0;
        int GGCounter = 0;
        double BBPercent = 0.0;
        double BGPercent = 0.0;
        double GGPercent = 0.0;
        
        // while loop to process file
        while ( inFile.hasNextLine() )
        {
            token = inFile.nextLine();
            token = token.replace( " ", "" );
            if ( token.equals( "BB" ) )
            {
                BBCounter++;
            }
            else if ( token.equals( "BG" ) )
            {
                BGCounter++;
            }
            else if ( token.equals( "GB" ) )
            {
                BGCounter++;
            }
            else if ( token.equals( "GG" ) )
            {
                GGCounter++;
            }
            else 
            {
                System.out.println( "Invalid File Input!" );
            }
            counter++;
        }
        
        // percent calculations
        BBPercent = (int)((double) BBCounter / counter * 10000) / 100.0;
        BGPercent = (int)((double) BGCounter / counter * 10000) / 100.0;
        GGPercent = (int)((double) GGCounter / counter * 10000) / 100.0;
        
        // printed output
        System.out.println();
        System.out.println( "Sample Size: " + counter + " families" );
        System.out.println( "Two Boys: " + BBPercent + "%" );
        System.out.println( "One Boy One Girl: " + BGPercent + "%" );
        System.out.println( "Two Girls: " + GGPercent + "%" );
        
        // closing file
        inFile.close();
        
    }
}