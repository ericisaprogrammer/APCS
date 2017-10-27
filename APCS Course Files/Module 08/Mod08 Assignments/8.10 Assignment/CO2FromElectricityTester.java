/**
 * This class tests the CO2FromElectricity class.
 * 
 * A CO2FromElectricity object is created to hold three private instance variables.
 * 
 * Print commands are used to format the desired values by directly calling the
 * calcAverageElectricity(), calcAveragePricePerKWH(), and calcEmissions() methods.
 * 
 * @author E. Osgood
 * @version 02/02/16
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
    public static void main(String[] args)
    {
        //Declaration of variables
        ArrayList<Double> electricityBills1 = new ArrayList<Double>();
        ArrayList<Double> pricePerKWH1 = new ArrayList<Double>();
        double emissionsFactor1 = 1.37;
        //Initialization of object
        CO2FromElectricity emissions1 = new CO2FromElectricity(electricityBills1, pricePerKWH1, emissionsFactor1);
        
        //Assignment of values into the ArrayLists
        electricityBills1.add(52.93); electricityBills1.add(58.99); electricityBills1.add(50.42); electricityBills1.add(56.89); electricityBills1.add(57.83); electricityBills1.add(57.64);
        electricityBills1.add(56.77); electricityBills1.add(51.78); electricityBills1.add(50.33); electricityBills1.add(62.25); electricityBills1.add(53.21); electricityBills1.add(49.57);

        pricePerKWH1.add(.0899193); pricePerKWH1.add(.0891037); pricePerKWH1.add(.0946033); pricePerKWH1.add(.0918305); pricePerKWH1.add(.1003031); pricePerKWH1.add(.0866493);
        pricePerKWH1.add(.0901657); pricePerKWH1.add(.0818452); pricePerKWH1.add(.0895753); pricePerKWH1.add(.0812398); pricePerKWH1.add(.0899193); pricePerKWH1.add(.0929193);
        
        //Print results
        System.out.printf("Average Monthly Electricity Bill: %2.2f%n", emissions1.calcAverageElectricityBill());
        System.out.printf("Average Monthly Electricity Price: %1.2f%n", emissions1.calcAveragePricePerKWH());
        System.out.printf("Annual CO2 Emissions from Electricity Usage: %5.1f pounds%n", emissions1.calcEmissions());
    }
}