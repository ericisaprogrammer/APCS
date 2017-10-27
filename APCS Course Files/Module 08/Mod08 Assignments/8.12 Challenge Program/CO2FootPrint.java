/**
 * This class creates CO2FootPrint objects with eight private instance variables.
 * It contains mutator methods that calculates yearly CO2 emissions from waste,
 * electricity, and gasoline, yearly CO2 emission reductions from recycling and
 * replacing lightbulbs, and calculates total CO2 emissions for the year, all of
 * which are in pounds. Private instance variables include myYearlyGas, myYearlyElectricity,
 * myBulbsReplaces, myPeople, myPaper, myPlastic, myGlass, and myCans.
 * 
 * @author E. Osgood
 * @version 02/24/16
 */
public class CO2FootPrint
{
    //Declaration of private instance variables
    private double myYearlyGas, myYearlyElectricity;
    private int myBulbsReplaced, myPeople;
    private boolean myPaper, myPlastic, myGlass, myCans;
    /**
     * Default constructor for the CO2FootPrint class
     */
    CO2FootPrint()
    {
    }
    
    
    /**
     * Mutator constructor for objects in the CO2FootPrint class.
     * @param gasoline gallons of gas used per year
     * @param electricity KWH used per year
     * @param people number of people
     * @param paper whether or not they recycle paper
     * @param plastic whether or not they recycle plastic
     * @param glass whether or not they recycle glass
     * @param cans whether or not they recycle cans
     * @param bulbs number of bulbs replaced with energy efficient ones
     */
    CO2FootPrint(double gasoline, double electricity, int people, boolean paper, boolean plastic, boolean glass, boolean cans, int bulbs)
    {
        myYearlyGas = gasoline;
        myYearlyElectricity = electricity;
        myPeople = people;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;
        myBulbsReplaced = bulbs;
    }
    
    /**
     * Mutator method to return total CO2 produced from waste (no parameters)
     */
    public double calcYearlyWaste()
    {
        return myPeople * 1018; //Amount of people in household * average waste production per person per year
    }
    
    /**
     * Mutator method to return total CO2 produced from electricity (no parameters)
     */
    public double calcYearlyElectricityWaste()
    {
        return myYearlyElectricity * 1.37; //Amount of electricity used * CO2 produced per KWH
    }
    
    /**
     * Mutator method to return total CO2 produced from gasoline (no parameters)
     */
    public double calcYearlyGasolineWaste()
    {
        return myYearlyGas * 19.4; //Amount of gasoline used * CO2 produced per gallon of gas
    }
    
    /**
     * Mutator method to return total CO2 reduction from recycling (no parameters)
     */
    public double calcRecyclingReduction()
    {
        double reduction = 0.0;
        if(myPaper)
        {
            reduction += 184 * myPeople;
        }
        if(myPlastic)
        {
            reduction += 25.6 * myPeople;
        }
        if(myGlass)
        {
            reduction += 46.6 * myPeople;
        }
        if(myCans)
        {
            reduction += 165.8 * myPeople;
        }
        return reduction;
    }
    
    /**
     * Mutator method to return total CO2 reduction from replacing light bulbs (no parameters)
     */
    public double calcBulbReduction()
    {
        return myBulbsReplaced * 1.37 * 73;
    }
    
    /**
     * Mutator method to return total CO2 produced per year
     */
    public double calcCO2Footprint()
    {
        return calcYearlyGasolineWaste() + calcYearlyElectricityWaste() + calcYearlyWaste() - calcRecyclingReduction() - calcBulbReduction();
    }
}