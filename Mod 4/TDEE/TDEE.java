/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @Josiah K.
 * @11/19/19
 */
import java.util.Scanner;
import javax.activity.ActivityCompletedException;
import jdk.internal.dynalink.beans.StaticClass;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        try {
            
        // Input: Gather information from user
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Please enter your gender: (M/F): poop");
        String gender = in.next();

        // BMR Calculator
                //local variables
                    double kilogramsPerPound = 0.453592;
                    double centimetersPerInch = 2.54;
                    double weightKilograms;
                    double heightCentimeters;
                    double metabolicRate;
                    
                //user input
                    System.out.println( "Please enter your age: " );
                    String ageString = in.next();
                    int ageYears = Integer.parseInt(ageString);
                    System.out.println( "Please enter your height in feet and inches (#'#\"): " );
                    String heightString = in.next();
                
                //Finds feet and inches then converts to int
                    int pos = heightString.indexOf("'");
                    String heightFeetString = heightString.substring(0, pos);
                    int heightFeet = Integer.parseInt( heightFeetString );
                    
                    int heightInches = 0;
                    if (heightString.length() > pos+1)
                    {
                        String heightInchesString = heightString.substring(pos+1, heightString.indexOf("\""));
                        heightInches = Integer.parseInt( heightInchesString );
                    }
                    
                //user input
                    System.out.println( "Please enter your weight in pounds: " );
                    String weightString = in.next();
                    int weightPounds = Integer.parseInt( weightString );
                
                //unit conversion
                    int heightTotal = heightFeet * 12 + heightInches;
                    heightCentimeters = heightTotal * centimetersPerInch;
                    weightKilograms = weightPounds * kilogramsPerPound;
                
                //BMR calculation
                    
                    if(gender.equalsIgnoreCase("M"))
                    {
                    metabolicRate = 13.397 * (weightKilograms) + 4.799 * (heightCentimeters) - 5.577 * (ageYears) + 88.362;
                    }
                    else
                    { 
                        metabolicRate = 9.247 * (weightKilograms) + 3.098 * (heightCentimeters) - 4.330 * (ageYears) + 447.593;
                    }   
                //rounding the values
                    double metabolicRateRounded = Math.round(metabolicRate * 10d) / 10d;
                    double weightKilogramsRounded = Math.round(weightKilograms * 100d) / 100d;
                    double heightCentimetersRounded = Math.round(heightCentimeters *100d) / 100d;
            //End of BMR calculation

        
        // Activity Level Menu
        System.out.println();
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Extremely Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();

        // Processing:
        // Activity Factor
        double activityFactor = 0.0;

        if(choice.equalsIgnoreCase("A"))
        {
            activityFactor = (1.0); 
        } 
        else if(choice.equalsIgnoreCase("B"))
        {
            activityFactor = (1.3);
        }
        else if((choice.equalsIgnoreCase("C")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = (1.6);
        }
        else if((choice.equalsIgnoreCase("C")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = (1.5);
        }
        else if((choice.equalsIgnoreCase("D")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = (1.7);
        }
        else if((choice.equalsIgnoreCase("D")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = (1.6);
        }
        else if((choice.equalsIgnoreCase("E")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = (2.1);
        }
        else if((choice.equalsIgnoreCase("E")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = (1.9);
        }
        else if((choice.equalsIgnoreCase("F")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = (2.4);
        }
        else if((choice.equalsIgnoreCase("F")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = (2.2);
        }
        else 
        {
            System.out.println("You did not choose an option!");
        }

        // Calculate TDEE
        double tDEE = metabolicRateRounded * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\t\tGender: " + gender);
        System.out.println("Weight: " + weightKilogramsRounded + " kg \t\tHeight: " + heightCentimetersRounded + " cm");
        System.out.println("BMR: " + metabolicRateRounded + " calories " + "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");

    } catch(Exception e) {
    } finally {
        // close scanner variable
        in.close();
    }
    }
}

