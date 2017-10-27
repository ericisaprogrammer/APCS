/**
 * This class tests the CO2FromWaste class.
 * 
 * A CO2FromWaste ArrayList is created to hold 5 CO2FromWaste objects, each of which holds
 * 5 private instance variables.
 * 
 * Print commands are used to format the desired values by directly calling the
 * getPeople(), getPaper(), getPlastic(), getGlass(), getCans(), getEmissions(), calcReduction(),
 * and calcEmissions() methods.
 * 
 * @author E. Osgood 
 * @version 2/8/16
 */
import java.util.ArrayList;
public class CO2FromWasteTester
{
    public static void main(String[] args)
    {
        CO2FromWaste group1 = new CO2FromWaste(3, false, false, false, true);
        CO2FromWaste group2 = new CO2FromWaste(2, true, true, true, true);
        CO2FromWaste group3 = new CO2FromWaste(3, true, false, true, true);
        CO2FromWaste group4 = new CO2FromWaste(5, true, false, false, false);
        CO2FromWaste group5 = new CO2FromWaste(1, true, true, true, true);
        
        ArrayList<CO2FromWaste> emissions = new ArrayList<CO2FromWaste>(5);
        emissions.add(group1);
        emissions.add(group2);
        emissions.add(group3);
        emissions.add(group4);
        emissions.add(group5);
        
        System.out.println("|       |        |                                  |          Pounds of CO2          |");
        System.out.println("|       |        |    Household Waste Recycled      |  Total   |           |   Net    |");
        System.out.printf("| %-6s| %-7s| %-6s| %-8s| %-7s|  %-5s| %-9s| %-10s| %8s |%n", "Index", "People", "Paper", "Plastic", "Glass", "Cans", "Emission", "Reduction", "Emission");
        System.out.println("|-------|--------|-------|---------|--------|-------|----------|-----------|----------|");
        for(int i = 0; i < emissions.size(); i ++)
        {
            System.out.printf("| %3d   |%4d    |%6s |%7s  |%6s  |%6s |%9.2f |%9.2f  |%9.2f |%n", i, emissions.get(i).getPeople(), emissions.get(i).getPaper(), emissions.get(i).getPlastic(), emissions.get(i).getGlass(), emissions.get(i).getCans(), emissions.get(i).getEmissions(), emissions.get(i).calcReduction(), emissions.get(i).calcEmissions());
        }
        System.out.println("|-------|--------|-------|---------|--------|-------|----------|-----------|----------|");
    }
}
