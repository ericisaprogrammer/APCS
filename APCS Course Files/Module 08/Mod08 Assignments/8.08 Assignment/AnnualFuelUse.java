/* Author: Eric Osgood
 * Version: 1.0.0 (January 25th, 2016)
 * Purpose: Code for any AnnualFuelUse object, which contains information about car useage 
 */

public class AnnualFuelUse
{
    //Private Instances
    private int myStartMiles, myEndMiles, myFillUpDay;
    private double myGallonsUsed, myPricePerGallon;
    
    //Default Constructor
    AnnualFuelUse()
    {
    }
    
    //Constructor: 5 parameters
    AnnualFuelUse(int fillUpDay, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon)
    {
        myStartMiles = startMiles;
        myEndMiles = endMiles;
        myFillUpDay = fillUpDay;
        myGallonsUsed = gallonsUsed;
        myPricePerGallon = pricePerGallon;
    }
    
    //Method: Retrieves fillup day
    public int getFillUpDay()
    {
        return myFillUpDay;
    }
    
    //Method: Retrieves start miles
    public int getStartMiles()
    {
        return myStartMiles;
    }
    
    //Method: Retrieves the end miles
    public int getEndMiles()
    {
        return myEndMiles;
    }
    
    //Method: Retrieves the gallons used
    public double getGallonsUsed()
    {
        return myGallonsUsed;
    }
    
    //Method: Retrieves the price per gallon
    public double getPricePerGallon()
    {
        return myPricePerGallon;
    }
    
    //Method: Return distance travelled
    public int calcDistance()
    {
        return myEndMiles - myStartMiles;
    }
    
    //Method: Return MPG
    public double calcMilesPerGallon()
    {
        return calcDistance() / myGallonsUsed;
    }
    
    //Method: Return cost
    public double calcCost()
    {
        return myPricePerGallon * myGallonsUsed;
    }
}