/*Purpose: Takes your age and heart rate information and outputs your target zone for exercise. Also outputs if you are working within your range.
 * Author: Eric Osgood
 * Version: October 19th, 2015
 * 
 */

import java.util.Scanner;
public class TargetZone{
    public static void main(String[] args){
        //Variable Declarations
        Scanner in = new Scanner(System.in);
        String input = "";
        String yes = "is NOT";
        int age = 0;
        int heartRateReserve = 0;
        int restingHeartRate = 0;
        int exerciseHeartRate = 0;
        int maximumHeartRate = 0;
        double upperHeartRate = 0;
        double lowerHeartRate = 0;
        //Title
        System.out.println("Determine Your Target Heart Rate Zone for Cardiovascular Exercise (50% - 85%)");
        System.out.println();
        
        
        //Inputs
        System.out.print("Enter your age: ");
        input = in.next();
        age = Integer.parseInt(input);
        
        System.out.print("Enter your resting heart rate: ");
        input = in.next();
        restingHeartRate = Integer.parseInt(input);
        
        System.out.print("Enter your heart rate after exercising: ");
        input = in.next();
        exerciseHeartRate = Integer.parseInt(input);
        
        
        //Calculations and Output
        maximumHeartRate = 220 - age;
        heartRateReserve = maximumHeartRate - restingHeartRate;
        upperHeartRate = (heartRateReserve * .85) + restingHeartRate;
        lowerHeartRate = (heartRateReserve * .5) + restingHeartRate;
        
        System.out.println("Your heart rate target zone is between " + (int)lowerHeartRate + " and " + (int)upperHeartRate + ".");
        boolean isBetween = exerciseHeartRate <= upperHeartRate;
        if(isBetween)
            isBetween = exerciseHeartRate >= lowerHeartRate;
            if(isBetween)
            yes = "is";
        System.out.print("After just exercising, your heart rate " + yes + " within your target zone.");
    }    
}