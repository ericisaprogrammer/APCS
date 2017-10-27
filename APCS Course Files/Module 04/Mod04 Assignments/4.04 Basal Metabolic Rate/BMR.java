/**
 * Author: Eric Osgood
 * Version: 1.0 (10/22/2015)
 * 
 * Purpose: Program takes your age, height, gender, weight and outputs your
 * Basal Metabolic Rate.
 */
import java.util.Scanner;
public class BMR{
    public static void main(String[] args){
        //Variable Declarations
        String inputString = "";
        char charGender = 'a';
        int age = 0;
        double height = 0.0;
        double weight = 0.0;
        String name = "";
        double BMR = 0.0;
        
        Scanner in = new Scanner(System.in);

        
        
        //Input Gathering
        System.out.print("Enter your name: ");
        name = in.next();
        
        System.out.print("Gender (M/F): ");
        inputString = in.next();
        charGender = inputString.charAt(0);
        
        System.out.print("Enter your age: ");
        age = in.nextInt();
        
        System.out.print("Height in inches: ");
        height = in.nextDouble();
        
        System.out.print("Weight in pounds: ");
        weight = in.nextDouble();
        
        
        
        //Manipulations
        boolean male = charGender == 'M';
        weight *= .453592;
        height *= 2.54;
        
        if(male){
            BMR = (13.397 * weight) + (4.799 * height) - (5.677 * age) + 88.362;
        }
        else{
            BMR = (9.247 * weight) + (3.098 * height) - (4.33 * age) + 447.593;
        }
        
        //Displays doubles to the first decimal
        int integer = (int)BMR;
        String decimal = "" + (BMR - integer);
        BMR = integer + Double.parseDouble(decimal.substring(0, 3));
        
        integer = (int)weight;
        decimal = "" + (weight - integer);
        weight = integer + Double.parseDouble(decimal.substring(0, 3));
        
        integer = (int)height;
        decimal = "" + (height - integer);
        height = integer + Double.parseDouble(decimal.substring(0, 3));
        
        
        
        //Output
        System.out.println("\n\n");
        System.out.println("Calculate Your Basal Metabolism\n");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + charGender);
        System.out.println("Age: " + age);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Height (cm): " + height);
        System.out.print("Basal Metabolic Rate: " + BMR + " calories per day");
    }
}