/*
 * 
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
        //VARIABLE AND OBJECT DECLARATIONS
        double averageHumid = 0.0;
        double averageTemp = 0.0;
        double averageHeat = 0.0;
        double heatIndexTemp = 0.0;
        int[] humidity = new int[12];
        double[] temperature = new double[12];
        double[] heatIndex = new double[12];
        String[] column = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Avg"};
        
        Scanner inFileTemp = new Scanner(new File("KeyWestTemp.txt"));
        Scanner inFileHumid = new Scanner(new File("KeyWestHumid.txt"));
        
        
        //DATA GATHERING
            //Assigns information in KeyWestHumid.txt to the array humidity
        while(inFileHumid.hasNext())
        {
            for(int counter = 0; counter < humidity.length; counter ++)
            {
                humidity[counter] = Integer.parseInt(inFileHumid.next());
            }
        }
        inFileHumid.close();
        
            //Assigns information in KeyWestTemp.txt to the array temperature
        while(inFileTemp.hasNext())
        {
            for(int counter = 0; counter < temperature.length; counter ++)
            {
                temperature[counter] = Double.parseDouble(inFileTemp.next());
            }
        }
        inFileTemp.close();
        
        
        //DATA MANIPULATIONS
        
        
        
        //OUTPUT
        System.out.println("Heat Index: Key West, Florida\n");
        System.out.printf("%12s", "");
            //Display for the columns
        for(String month : column)
        {
            System.out.printf("%6s", month);
        }
        System.out.println();
        System.out.println("******************************************************************************************");
        
            //Displays temperatures
        System.out.printf("%-12s", "Temp (F)");
        for(double temp : temperature)
        {
            System.out.printf("%6.1f", temp);
            averageTemp += temp;
        }
        averageTemp /= temperature.length;
        System.out.printf("%6.1f%n", averageTemp);
        
            //Displays humidity
        System.out.printf("%-12s", "Humidity (%)");
        for(double humid : humidity)
        {
            System.out.printf("%6.1f", humid);
            averageHumid += humid;
        }
        averageHumid /= humidity.length;
        System.out.printf("%6.1f%n", averageHumid);
        
            //Displays heat index
        System.out.printf("%-12s", "Heat Index");
        for(double heat : heatIndex)
        {
            System.out.printf("%6.1f", heat);
            averageHeat += heat;
        }
        averageHeat /= heatIndex.length;
        System.out.printf("%6.1f%n", averageHeat);
    }
}