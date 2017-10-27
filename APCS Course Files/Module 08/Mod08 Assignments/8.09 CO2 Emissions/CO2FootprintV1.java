/**
 * This class creates CO2 footprint objects with three private instance variables.
 * It contains a mutator constructor to calculate the yearly CO2 emissions of a car in pounds
 * and English tons. There are getter methods for each private instance variable.
 * Private instance variables include myGallonsPerYear, myPoundsPerYear, and myTonsPerYear.
 * 
 * @author E. Osgood
 * @version 01/28/16
 */
public class CO2FootprintV1
{
    //Declaration of private instance variables
    private double myGallonsPerYear;        //Yearly gasoline useage of a car
    private double myPoundsPerYear;         //Yearly CO2 emissions of a car (pounds)
    private double myTonsPerYear;           //Yearly CO2 emissions of a car (English tons)
    /**
     * Default constructor for the CO2FootprintV1 class
     */
    CO2FootprintV1()
    {
    }
    
    /**
     * Mutator constructor for objects in the CO2FootprintV1 class.
     * Calculates yearly CO2 emissions in pounds and English tons.
     * @param gallonsPerYear yearly gasoline usage of a car
     */
    CO2FootprintV1(double gallonsPerYear)
    {
        myGallonsPerYear = gallonsPerYear;
        myPoundsPerYear = gallonsPerYear * 8.78 * 10e-3;
        myTonsPerYear = myPoundsPerYear / 2000;
    }
    
    /**
     * Getter method to return the yearly gasoline usage of a car (no parameters)
     */
    public double getGallonsPerYear()
    {
        return myGallonsPerYear;
    }
    
    /**
     * Getter method to return the CO2 emissions of a car in pounds (no parameters)
     * @return the yearly CO2 emissions of a car (pounds)
     */
    public double getPoundEmissions()
    {
        return myPoundsPerYear;
    }
    
    /**
     * Getter method to return the CO2 emissions of a car in English tons (no parameters)
     * @return the yearly CO2 emissions of a car (English tons)
     */
    public double getTonEmissions()
    {
        return myTonsPerYear;
    }
}