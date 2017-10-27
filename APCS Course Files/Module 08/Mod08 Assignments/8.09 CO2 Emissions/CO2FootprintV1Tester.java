/**
 * This class tests the CO2FootprintV1 class.
 * 
 * A CO2 footprint object is created to hold four private instance variables.
 * 
 * Print commands are used to format the desired values by directly calling the
 * getGallonsPerYear(), getPoundEmissions(), and getTonEmissions() methods.
 * 
 * @author E. Osgood
 * @version 01/28/16
 */
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        //Declaration of variables
        double gallonsPerYear1 = 551.6;
        //Initialization of object
        CO2FootprintV1 footprint1 = new CO2FootprintV1(gallonsPerYear1);
        
        //Print results
        System.out.printf("%20s%n", "CO2 Emissions");
        System.out.printf("%-10s%-12s%-4s%n", "Gallons", "Pounds", "Tons");
        System.out.printf("%-9s%-11s%-8s%n", "of Gas", "from Gas", "from Gas");
        System.out.println("****************************");
        System.out.printf("%-11.1f%-11.2f%-6.3f", footprint1.getGallonsPerYear(), footprint1.getPoundEmissions(), footprint1.getTonEmissions());
    }
}