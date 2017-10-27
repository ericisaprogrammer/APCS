/**
 * This class tests the CO2FootPrint class.
 * 
 * A CO2FootPrint ArrayList is created to hold 5 CO2FootPrint objects, each of which holds
 * 5 private instance variables.
 * 
 * Print commands are used to format the desired values by directly calling the
 * calcYearlyGasolineWaste(), calcYearlyElectricityWaste(), calcYearlyWaste(), calcRecyclingReduction(),
 * calcBulbReduction(), and calcCO2Footprint() methods.
 * 
 * @author E. Osgood 
 * @version 2/24/16
 */
import java.util.ArrayList;
public class CO2FootPrintTester
{
    public static void main(String[] args)
    {
        ArrayList<CO2FootPrint> yearlyCO2FootPrint = new ArrayList<CO2FootPrint>();
        
        yearlyCO2FootPrint.add(new CO2FootPrint(674, 11547, 2, true, false, false, true, 0));
        yearlyCO2FootPrint.add(new CO2FootPrint(1087, 12504, 3, true, true, false, false, 2));
        yearlyCO2FootPrint.add(new CO2FootPrint(760, 9800, 1, false, false, false, false, 5));
        yearlyCO2FootPrint.add(new CO2FootPrint(987, 14500, 4, true, true, true, true, 0));
        yearlyCO2FootPrint.add(new CO2FootPrint(853, 11250, 2, true, true, false, true, 10));
        
        System.out.printf("%25s%28s%n", "Pounds of CO2", "Pounds of CO2");
        System.out.printf("%26s%27s%15s%n", "Produced From:", "Reduced From:", "Total");
        System.out.printf("%6s%17s%10s%13s%12s%15s%n", "Gas", "Electricity", "Waste", "Recycling", "New Bulbs", "CO2 Footprint");
        System.out.printf("=========================================================================%n");
        for(int i = 0; i < yearlyCO2FootPrint.size(); i ++)
        {
            System.out.printf("%9.2f%13.2f%12.2f%11.2f%11.1f%14.2f%n", yearlyCO2FootPrint.get(i).calcYearlyGasolineWaste(), yearlyCO2FootPrint.get(i).calcYearlyElectricityWaste(), yearlyCO2FootPrint.get(i).calcYearlyWaste(), yearlyCO2FootPrint.get(i).calcRecyclingReduction(), yearlyCO2FootPrint.get(i).calcBulbReduction(), yearlyCO2FootPrint.get(i).calcCO2Footprint());
        }
    }
}