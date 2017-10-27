/* Purpose: Demonstrates how private instances are used
 * Author: Eric Osgood
 * Version: 1.0.0 (January 22nd, 2016)
 */

public class CarV5
{
    //Variables: Private Instances
    private int myStartMiles, myEndMiles;
    private double myGallonsUsed, myPricePerGallon;
    private String myCarType;
    
    //Constructor: Default
    CarV5()
    {    
    }
    
    //Constructor: 5 parameters
    CarV5(String carType, int endMiles, int startMiles, double gallonsUsed, double pricePerGallon)
    {
        myCarType = carType;
        myEndMiles = endMiles;
        myStartMiles = startMiles;
        myGallonsUsed = gallonsUsed;
        myPricePerGallon = pricePerGallon;
    }
    
    //Public Method: Calculate distance travelled
    public int calcDistance()
    {
        return myEndMiles - myStartMiles;
    }
    
    //Public Method: Calculate total cost for a trip
    public double calcCost()
    {
        return myGallonsUsed * myPricePerGallon;
    }
    
    //Public Method: Calculate MPG
    public double calcMilesPerGallon()
    {
        return calcDistance() / myGallonsUsed;
    }
    
    //Public Method: Calculate GPM
    public double calcGallonsPerMile()
    {
        return myGallonsUsed / calcDistance();
    }
    
    //Public Method: Output car type
    public String getCarType()
    {
        return myCarType;
    }
    
    //Public Method: Output end miles
    public int getEndMiles()
    {
        return myEndMiles;
    }
    
    //Public Method: Output start miles
    public int getStartMiles()
    {
        return myStartMiles;
    }
    
    //Public Method: Output gallons used
    public double getGallonsUsed()
    {
        return myGallonsUsed;
    }
    
    //Public Method: Output price per gallon
    public double getPricePerGallon()
    {
        return myPricePerGallon;
    }
    
    //Public Method: Main
    public static void main(String[] args)
    {
        //Variables
        int endMiles1, startMiles1;
        double gallonsUsed1, pricePerGallon1;
        String carType1;
        
        startMiles1 = 147623; endMiles1 = 147952;
        gallonsUsed1 = 11.846; pricePerGallon1 = 1.65;
        carType1 = "03 Honda Civic";
        
        CarV5 car1 = new CarV5(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
        
        //Final Output
        System.out.printf("%60s%n", "Gas Mileage Calculations");
        System.out.printf("%14s%13s%12s%11s%10s%8s%7s%12s%11s%n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("==================================================================================================");
        System.out.printf("%12s%13d%12d%11d%10.1f%8.2f%7.2f%12.1f%11.3f%n", car1.getCarType(), car1.getStartMiles(), car1.getEndMiles(), car1.calcDistance(), car1.getGallonsUsed(), car1.getPricePerGallon(), car1.calcCost(), car1.calcMilesPerGallon(), car1.calcGallonsPerMile());
    }
}