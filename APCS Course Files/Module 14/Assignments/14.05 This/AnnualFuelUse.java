/* Author: Eric Osgood
 * Version: 1.0.0 (January 25th, 2016), 1.0.1 (April 2nd, 2016)
 * Purpose: Code for any AnnualFuelUse object, which contains information about car useage
 * Demonstrates the usage of keyword: this
 */

public class AnnualFuelUse
{
    //Private Instances
    private int startMiles, endMiles, fillUpDay;
    private double gallonsUsed, pricePerGallon;
    
    //Default Constructor
    AnnualFuelUse()
    {
    }
    
    //Constructor: 5 parameters
    AnnualFuelUse(int fillUpDay, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon)
    {
        this.startMiles = startMiles;
        this.endMiles = endMiles;
        this.fillUpDay = fillUpDay;
        this.gallonsUsed = gallonsUsed;
        this.pricePerGallon = pricePerGallon;
    }
    
    //Method: Retrieves fillup day
    public int getFillUpDay()
    {
        return fillUpDay;
    }
    
    //Method: Retrieves start miles
    public int getStartMiles()
    {
        return startMiles;
    }
    
    //Method: Retrieves the end miles
    public int getEndMiles()
    {
        return endMiles;
    }
    
    //Method: Retrieves the gallons used
    public double getGallonsUsed()
    {
        return gallonsUsed;
    }
    
    //Method: Retrieves the price per gallon
    public double getPricePerGallon()
    {
        return pricePerGallon;
    }
    
    //Method: Return distance travelled
    public int calcDistance()
    {
        return endMiles - startMiles;
    }
    
    //Method: Return MPG
    public double calcMilesPerGallon()
    {
        return calcDistance() / gallonsUsed;
    }
    
    //Method: Return cost
    public double calcCost()
    {
        return pricePerGallon * gallonsUsed;
    }
}
