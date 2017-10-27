/* Purpose: Demonstrates how default object constructors are made and used 
 * Author: Eric Osgood
 * Version: 1.0.0 (December 26th, 2015)
 */

public class CarV3
{
        //Default Constructor
    public CarV3()
    {  
    }
    
        //Calculates the distance travelled
    public int calcDistance(int sMiles, int eMiles)
    {
        return eMiles - sMiles;
    }
    
        //Calculates the miles per gallon
    public double calcMPG(int dist, double gals)
    {
        return dist / gals;
    }
    
        //Outputs the type of car, starting miles, ending miles, distance travelled, gallons of gas used, and MPG of the car
    public static void main(String[] args)
    {
        //VARIABLE AND OBJECT DECLARATIONS
        int startingMiles1 = 147623;
        int endingMiles1 = 147952;
        int milesDriven1 = 0;
        double milesPerGallon1 = 0.0;
        double gallons1 = 11.846;
        String carDetails1 = "03 Honda Civic";
        
        CarV3 car1 = new CarV3();
        
        //OUTPUT
        milesDriven1 = car1.calcDistance(startingMiles1, endingMiles1);
        milesPerGallon1 = car1.calcMPG(milesDriven1, gallons1);
        
        
        System.out.printf("%48s%n", "Gas Mileage Calculations");
        System.out.printf("%13s%14s%12s%11s%10s%12s%n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal");
        System.out.println("==========================================================================");
        System.out.printf("%12s%12d%12d%11d%10.1f%12.1f%n", carDetails1, startingMiles1, endingMiles1, milesDriven1, gallons1, milesPerGallon1);
    }
}