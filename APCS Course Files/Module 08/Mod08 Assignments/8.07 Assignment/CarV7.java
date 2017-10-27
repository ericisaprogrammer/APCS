/* Author: Eric Osgood
 * Version: 1.3.0 (January 23rd, 2016)
 * Purpose: Demonstrates how OOP code can be separated into object code and output code and how to use multiple objects
 */
public class CarV7
{
    private int myStartMiles, myEndMiles;
    private double myGallonsUsed, myPricePerGallon;
    private String myCarType;
    
    //Constructor: Default
    CarV7()
    {
    }
    
    //Constructor: 5 Parameters
    CarV7(String carType, int endMiles, int startMiles, double gallonsUsed, double pricePerGallon)
    {
        myCarType = carType;
        myStartMiles = startMiles;
        myEndMiles = endMiles;
        myGallonsUsed = gallonsUsed;
        myPricePerGallon = pricePerGallon;
    }
    
    //Method: Return car type
    public String getCarType()
    {
        return myCarType;
    }
    
    //Method: Return starting miles
    public int getStartMiles()
    {
        return myStartMiles;
    }
    
    //Method: Return ending miles
    public int getEndMiles()
    {
        return myEndMiles;
    }
    
    //Method: Return gallons used
    public double getGallonsUsed()
    {
        return myGallonsUsed;
    }
    
    //Method: Return price per gallon
    public double getPricePerGallon()
    {
        return myPricePerGallon;
    }
    
    //Method: Calculate distance travelled
    public int calcDistance()
    {
        return myEndMiles - myStartMiles;
    }
    
    //Method: Calculate MPG
    public double calcMilesPerGallon()
    {
        return myGallonsUsed / myPricePerGallon;
    }
    
    //Method: Calculate GPM
    public double calcGallonsPerMile()
    {
        return myPricePerGallon / myGallonsUsed;
    }
    
    //Method: Calculate cost
    public double calcCost()
    {
        return myPricePerGallon * myGallonsUsed;
    }
}