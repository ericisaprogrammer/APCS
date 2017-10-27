/**
 * This class creates CO2FromWaste objects with seven private instance variables.
 * It contains getter methods for each private instance, along with mutator methods
 * that calculate the gross CO2 emissions, CO2 reduction from recycling, and 
 * CO2 net emissions, all of which are in pounds. Private instance variables include
 * myPeople, myReduction, myEmissions, myPaper, myPlastic, myGlass, and myCans.
 * 
 * @author E. Osgood
 * @version 02/08/16
 */
public class CO2FromWaste
{
    //Declaration of private instance variables
    private int myPeople;
    private double myReduction, myEmissions;
    private boolean myPaper, myPlastic, myGlass, myCans;
    
    /**
     * Default constructor for the CO2FromWaste class
     */
    CO2FromWaste()
    {
    }
    
    /**
     * Mutator constructor for objects in the CO2FromWaste class. Calculates gross emissions
     * @param people number of people for calculations
     * @param paper whether or not they recycle paper
     * @param plastic whether or not they recycle plastic
     * @param glass whether or not they recycle glass
     * @param cans whether or not they recycle cans
     */
    CO2FromWaste(int people, boolean paper, boolean plastic, boolean glass, boolean cans)
    {
        myPeople = people;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;
        myEmissions = 1018 * people;
    }
    
    /**
     * Mutator method to return total CO2 reduction from recycling (no parameters)
     */
    public double calcReduction()
    {
        myReduction = 0.0;
        if(myPaper)
        {
            myReduction += 184 * myPeople;
        }
        if(myPlastic)
        {
            myReduction += 25.6 * myPeople;
        }
        if(myGlass)
        {
            myReduction += 46.6 * myPeople;
        }
        if(myCans)
        {
            myReduction += 165.8 * myPeople;
        }
        return myReduction;
    }
    
    /**
     * Mutator method to return net CO2 emissions (no parameters)
     */
    public double calcEmissions()
    {
        return myEmissions - calcReduction();
    }
    
    /**
     * Getter method to return gross CO2 emissions (no parameters)
     */
    public double getEmissions()
    {
        return myEmissions;
    }
    
    /**
     * Getter method to return the number of people (no parameters)
     */
    public int getPeople()
    {
        return myPeople;
    }
    
    /**
     * Getter method to return whether or not they recycle paper (no parameters)
     */
    public boolean getPaper()
    {
        return myPaper;
    }
    
    /**
     * Getter method to return whether or not they recycle plastic (no parameters)
     */
    public boolean getPlastic()
    {
        return myPlastic;
    }
    
    /**
     * Getter method to return whether or not they recycle glass (no parameters)
     */
    public boolean getGlass()
    {
        return myGlass;
    }
    
    /**
     * Getter method to return whether or not they recycle cans (no parameters)
     */
    public boolean getCans()
    {
        return myCans;
    }
}