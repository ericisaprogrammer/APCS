/**
 * This class creates CO2 electricity objects with two private instance ArrayLists
 * and one private instance variable. It contains getter methods for each private
 * instance, along with mutator methods that calculate the average electricity bill cost,
 * average price per KWH, and total CO2 emissions in pounds. Private instance ArrayLists
 * include myElectricityBills and myPricePerKWH. Private instance variables include 
 * myEmissionsFactor.
 * 
 * @author E. Osgood
 * @version 02/02/16
 */
import java.util.ArrayList;
public class CO2FromElectricity
{
    //Declaration of private instance variables
    private ArrayList<Double> myElectricityBills = new ArrayList<Double>();
    private ArrayList<Double> myPricePerKWH = new ArrayList<Double>();
    private double myEmissionsFactor;
    
    /**
     * Default constructor for the CO2FromElectricity class
     */
    CO2FromElectricity()
    {
    }
    
    /**
     * Constructor for objects in the CO2FromElectricity class
     * @param electricityBills cost of electricity during the months
     * @param pricePerKWH cost of KWH during the months
     * @param emissionsFactor emissions factor that is being used
     */
    CO2FromElectricity(ArrayList<Double> electricityBills, ArrayList<Double> pricePerKWH, double emissionsFactor)
    {
        myElectricityBills = electricityBills;
        myPricePerKWH = pricePerKWH;
        myEmissionsFactor = emissionsFactor;
    }
    
    /**
     * Getter method to return the electricity bills (no parameters) 
     */
    public ArrayList<Double> getElectricityBills()
    {
        return myElectricityBills;
    }
    
    /**
     * Getter method to return the prices per KWH (no parameters)
     */
    public ArrayList<Double> getPricePerKWH()
    {
        return myPricePerKWH;
    }
    
    /**
     * Getter method to return the emissions factor (no parameters)
     */
    public double getEmissionsFactor()
    {
        return myEmissionsFactor;
    }
    
    /**
     * Mutator method to calculate the average electricity bill (no parameters)
     */
    public double calcAverageElectricityBill()
    {
        double i = 0.0;
        for(double bill : myElectricityBills)
        {
            i += bill;
        }
        return i /= myElectricityBills.size();
    }
    
    /**
     * Mutator method to calculate the average price per KWH (no parameters)
     */
    public double calcAveragePricePerKWH()
    {
        double i = 0.0;
        for(double price : myPricePerKWH)
        {
            i += price;
        }
        return i /= myPricePerKWH.size();
    }
    
    /**
     * Mutator method to calculate CO2 emissions in pounds (no parameters)
     */
    public double calcEmissions()
    {
        return calcAverageElectricityBill() / calcAveragePricePerKWH() * getEmissionsFactor() * myElectricityBills.size();
    }
}