/* Author: Eric Osgood
 * Version: 1.0.0 (December 8th, 2015)
 * Purpose: Takes a weight from the user and outputs different
 * weights based on the gravity of different planets
 * 
 * Note: This program requires a file that is written by the Gravity class.
 * It is recommended that you run that class before running this one.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class WeightOnPlanets
{
    //Takes in a weight(lbs or kg) and a planets gravity and outputs their weight on the planet
    public static double calculateWeight(double weight, boolean metric, double gravity)
    {
        double newWeight = 0.0;
        if(metric)
        {
            newWeight = weight * gravity;
        }
        else
        {
            newWeight = weight * 0.453592 * gravity;
        }
        return newWeight;
    }
    
    //Outputs everything
    public static void output(double[] gravity, boolean metric, double[] weightOnPlanets, String[] names)
    {
        System.out.println("\n\n");
        System.out.printf("%31s%n", "Your Weight on the Planets");
        System.out.printf("%-14s%5s%15s%n", "Planet", "Gravity", "Weight (kg)");
        System.out.println("------------------------------------");
        for(int counter = 0; counter < gravity.length; counter ++)
        {
            System.out.printf("%-15s%5.2f%15.2f%n", names[counter], gravity[counter], weightOnPlanets[counter]);
        }
    }
    
    //Reads gravity from a file
    public static double[] getGravity(double[] gravity) throws IOException
    {
        Scanner inFile = new Scanner(new File("gravity.txt"));
        for(int counter = 0; counter < gravity.length; counter ++)
        {
            gravity[counter] = inFile.nextDouble();
        }
        inFile.close();
        
        for(int counter = 0; counter < gravity.length; counter ++)
        {
                //Assigns gravity in relation to Earth
            if(counter != 2)
            {
                gravity[counter] /= gravity[2];
            }
            
            if(counter == gravity.length - 1)
            {
                gravity[2] /= gravity[2];
            }
        }
        return gravity;
    }
    
    //Calculates weight on each planet
    public static double[] weightOnPlanets(double[] weightOnPlanets, boolean metric, double[] gravity, double weight)
    {
        for(int counter = 0; counter < weightOnPlanets.length; counter ++)
        {
            weightOnPlanets[counter] = calculateWeight(weight, metric, gravity[counter]);
        }
        return weightOnPlanets;
    }
    
    public static void main(String[] args) throws IOException
    {
        //VARIABLE AND OBJECT DECLARATIONS
        boolean metric = false;
        double[] gravity = new double[8];
        double[] weightOnPlanets = new double[8];
        double weight = 0.0;
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        String input = "";
        
        
        Scanner in = new Scanner(System.in);
        
        
        //INPUT AND DATA MANIPULATIONS
        System.out.print("Please enter your weight on Earth: ");
        weight = in.nextDouble();
        System.out.print("Is your weight in kilograms [Y/N]: ");
        input = in.next();
        
            //Since metric is already false, I don't need an else statement here
        if(input.substring(0,1).equalsIgnoreCase("Y"))
        {
            metric = true;
        }
        
        gravity = getGravity(gravity);
        weightOnPlanets = weightOnPlanets(weightOnPlanets, metric, gravity, weight);
        output(gravity, metric, weightOnPlanets, names);
    }
}