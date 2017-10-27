/**
 * This program takes a user's weight and height to calculate their body mass index
 * 
 * Version: 1.0 (October 24th, 2015)
 * Author: Eric Osgood
 */
import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        //Variable declarations
        int age = 0;
        double weight = 0.0;
        int heightFeet = 0;
        int heightInches = 0;
        double height = 0.0;
        double BMI = 0.0;
        String name = "";
        String status = "";
        
        Scanner in = new Scanner(System.in);
        
        
        //Prompt for input
        System.out.print("Please enter your name (First Last): ");
        name = in.next() + " " + in.nextLine();
        
        System.out.print("Please enter your age: ");
        age = in.nextInt();
        
        System.out.print("Please enter your weight in pounds (e.g. 150): ");
        weight = in.nextInt();
        
        System.out.print("Please enter your height in feet and inches (e.g. 5 11)");
        heightFeet = in.nextInt();
        heightInches = in.nextInt();
        
        
        //Data Manipulations
        height = heightFeet * 12 + heightInches;
        weight *= .453592;                                                //Pounds to kilograms
        height *= .0254;                                                  //Inches to meters
        
        
        
        //Calculations and data manipulations
        BMI = weight / (height * height);                                 //BMI calculation
        
        //Initialization of rounding variables
        int integer = 0;
        double decimal = 0.0;
        double hundredths = 0.0;
        String decimalString = "";
        
        //Code to round the BMI to the nearest tenth
            integer = (int)BMI;                                               //Takes the part of BMI that isn't a decimal
            decimal = BMI - integer;                                          //Takes the decimal part of BMI
            decimalString = "" + decimal;                                     //Transfers decimal into a string
            decimalString = decimalString.substring(0, 4);                    //Cuts decimal to 0.00, instead of 0.000000000000...
            hundredths = Double.parseDouble(decimalString);                   //Transfers the cut decimal into a double variable
            decimal = Double.parseDouble(decimalString.substring(0, 3));      //Transfers the decimal to the tenths place into a double variable
            hundredths -= decimal;                                            //Isolates the hundredths number into a simgle variable
            decimal += hundredths;                                            //Replaces the cut hundredths number into the original decimal
        
            //Roubding operation
            if(hundredths >= .05)
                decimal += .1 - hundredths;
            else
                decimal -= hundredths;
            BMI = integer + decimal;                                          //Combines the integer and decimal parts into a single, rounded number
        
        
        //Code that rounds the weight to the nearest tenth
            integer = (int)weight;                                            //Takes the part of BMI that isn't a decimal
            decimal = weight - integer;                                       //Takes the decimal part of BMI
            decimalString = "" + decimal;                                     //Transfers decimal into a string
            decimalString = decimalString.substring(0, 4);                    //Cuts decimal to 0.00, instead of 0.000000000000...
            hundredths = Double.parseDouble(decimalString);                   //Transfers the cut decimal into a double variable
            decimal = Double.parseDouble(decimalString.substring(0, 3));      //Transfers the decimal to the tenths place into a double variable
            hundredths -= decimal;                                            //Isolates the hundredths number into a simgle variable
            decimal += hundredths;                                            //Replaces the cut hundredths number into the original decimal
        
            //Roubding operation
            if(hundredths >= .05)
                decimal += .1 - hundredths;
            else
                decimal -= hundredths;
            weight = integer + decimal;                                       //Combines the integer and decimal parts into a single, rounded number
        
        
        //Code that rounds the height to the nearest tenth
            integer = (int)height;                                            //Takes the part of BMI that isn't a decimal
            decimal = height - integer;                                       //Takes the decimal part of BMI
            decimalString = "" + decimal;                                     //Transfers decimal into a string
            decimalString = decimalString.substring(0, 4);                    //Cuts decimal to 0.00, instead of 0.000000000000...
            hundredths = Double.parseDouble(decimalString);                   //Transfers the cut decimal into a double variable
            decimal = Double.parseDouble(decimalString.substring(0, 3));      //Transfers the decimal to the tenths place into a double variable
            hundredths -= decimal;                                            //Isolates the hundredths number into a simgle variable
            decimal += hundredths;                                            //Replaces the cut hundredths number into the original decimal
        
            //Roubding operation
            if(hundredths >= .05)
                decimal += .1 - hundredths;
            else
                decimal -= hundredths;
            height = integer + decimal;                                       //Combines the integer and decimal parts into a single, rounded number
        
        //Determines if the person is a teenager
        boolean teen = age < 20;
        String condition = "";
        if(teen)
            condition = "NOTE: Because you are under 20 years old,\nyour Body Mass Index category might be skewed.";
        
        //Classifies the BMI
        if(BMI < 18.5)
            status = "Underweight";
        else if(BMI <= 24.9)
            status = "Normal";
        else if(BMI <= 29.9)
            status = "Overweight";
        else
            status = "Obese";
        
           
            
        //Output
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("===========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + height);
        System.out.println("Weight (kg): " + weight);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + status);
        System.out.println("\n" + condition);
    }
}