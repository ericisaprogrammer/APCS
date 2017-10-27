/* Author: Eric Osgood
 * Version: 1.0.0 (December 8th, 2015)
 * Purpose: Program takes in known values for the planets and outputs
 * their calculated gravitional acceleration to a .txt file
 */

import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
public class Gravity
{
    //Determines a planet's gravity
    public static double calculateGravity(double diameter, double G, double mass)
    {
        double radius = (diameter / 2) * 1000;
        double gravity = (G * mass) / Math.pow(radius, 2);
        return gravity;
    }
    
    public static void main(String[] args) throws IOException
    {
        //VARIABLE AND OBJECT DECLARATIONS
        double G = 6.67408e-11;
        double[] mass = {3.3e23, 4.859e24, 5.972e24, 6.4219e23, 1.9e27, 5.68e26, 8.683e25, 1.0247e26};
        double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double[] gravity = new double[8];
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        
        PrintWriter outFile = new PrintWriter(new File("gravity.txt"));
        
        
        //DATA MANIPULATION
        for(int counter = 0; counter < gravity.length; counter ++)
        {
            gravity[counter] = calculateGravity(diameter[counter], G, mass[counter]);
            outFile.println(gravity[counter]);
        }
        outFile.close();
        
        
        //OUTPUT
        System.out.printf("%47s%n", "Planetary Data");
        System.out.printf("%-17s%-23s%-18s%-20s%n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("--------------------------------------------------------------------------------");
        for(int counter = 0; counter < names.length; counter ++)
        {
            System.out.printf("%-20s%6.0f%22.2E%17.3f%n", names[counter], diameter[counter], mass[counter], gravity[counter]);
        }
    }
}