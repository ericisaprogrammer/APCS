/*
 * 
 */

import java.util.Scanner;
public class TDEE {
    public static void main(String[] args) {
        //Variable Declarations
        double BMR = 0.0;
        int activityLevel = 0;
        double activityFactor = 0.0;
        double TDEE = 0.0;
        String gender = "";
        String name = "";
        String input = "";
        String invalidChoice = "";
        
        Scanner in = new Scanner(System.in);
        
        
        //Input gathering
        System.out.print("Please enter your name: ");
        name = in.next();
        name += in.nextLine();
        
        System.out.print("Please enter your BMR: ");
        input = in.next();
        BMR = Double.parseDouble(input);
        
        System.out.print("Please enter your gender (M/F): ");
        input = in.next();
        gender = input.substring(0, 1);
        System.out.println();
        
        
        //Menu Selection
        System.out.println("Select Your Activity Level");
        System.out.println("[0] Resting (Sleeping, Reclining)");
        System.out.println("[1] Sedentary (Minimal Movement)");
        System.out.println("[2] Light (Sitting, Standing)");
        System.out.println("[3] Moderate (Light Manual Labor, Dancing, Cycling)");
        System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[5] Extremely Active (Full-Time Athlete, Heavy Manual Labor)");
        
        System.out.println();
        System.out.print("Enter the number corresponding to your activity level: ");
        input = in.next();
        input = input.substring(0, 1);
        activityLevel = Integer.parseInt(input);

        
        //Data Manipulations
        boolean valid = gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m");
        if (!valid)
        {
            invalidChoice += "You have selected an unknown gender. The calculations shown assume that you are male.";
            gender = "m";
        }
        
        valid = (activityLevel == 0 || activityLevel == 1 || activityLevel == 2 || activityLevel == 3 || activityLevel == 4 || activityLevel == 5);
        if (!valid)
        {
            invalidChoice += "\nYou have selected an unknown activity level. The calculations shown assume that you are sedentary.";
            activityLevel = 1;
        }
        
        if (gender.equalsIgnoreCase("m"))
        {
            if (activityLevel == 0)
            {
                activityFactor = 1;
                TDEE = BMR;
            }
            if (activityLevel == 1)
            {
                activityFactor = 1.3;
                TDEE = BMR * 1.3;
            }
            if (activityLevel == 2)
            {
                activityFactor = 1.6;
                TDEE = BMR * 1.6;
            }
            if (activityLevel == 3)
            {
                activityFactor = 1.7;
                TDEE = BMR * 1.7;
            }
            if (activityLevel == 4)
            {
                activityFactor = 2.1;
                TDEE = BMR * 2.1;
            }
            if (activityLevel == 5)
            {
                activityFactor = 2.4;
                TDEE = BMR * 2.4;
            }
        }
        if (gender.equalsIgnoreCase("f"))
        {
            if (activityLevel == 0)
            {
                activityFactor = 1;
                TDEE = BMR;
            }
            if (activityLevel == 1)
            {
                activityFactor = 1.3;
                TDEE = BMR * 1.3;
            }
            if (activityLevel == 2)
            {
                activityFactor = 1.5;
                TDEE = BMR * 1.5;
            }
            if (activityLevel == 3)
            {
                activityFactor = 1.6;
                TDEE = BMR * 1.6;
            }
            if (activityLevel == 4)
            {
                activityFactor = 1.9;
                TDEE = BMR * 1.9;
            }
            if (activityLevel == 5)
            {
                activityFactor = 2.2;
                TDEE = BMR * 2.2;
            }
        }
        gender = gender.toUpperCase();
        
        //Output
        System.out.println();
        System.out.println(invalidChoice);
        System.out.println();
        System.out.println("Name: " + name + "     Gender: " + gender);
        System.out.println("BMR: " + BMR + " calories      Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
        
    }
}