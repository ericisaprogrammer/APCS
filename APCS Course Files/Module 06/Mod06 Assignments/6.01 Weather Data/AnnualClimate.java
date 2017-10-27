/* Author: Eric Osgood
 * Version: 1.0.0 (November 25th, 2015)
 * Purpose: Demonstrates how cool and handsome I am in programming.
 * Also shows I can use arrays or whatever...
 */

import java.util.Scanner;
public class AnnualClimate
{
    public static void main(String[] args)
    {
        //VARIABLE AND OBJECT DECLARATIONS
        double[][] temperature = {
            {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2},
            {58.4, 60.0, 64.7, 68.9, 47.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8},
            {64.9, 66.0, 69.9, 73.6, 78.8, 82.2, 83.0, 83.1, 82.1, 77.5, 71.7, 66.4},
            {54.3, 57.0, 62.5, 67.6, 74.3, 79.2, 80.9, 81.4, 77.8, 70.1, 62.8, 56.3},
            {53.1, 55.8, 61.6, 66.6, 73.4, 79.1, 81.6, 80.8, 77.8, 69.4, 61.7, 55.0},
            {70.3, 70.8, 73.8, 77.0, 80.7, 83.4, 84.5, 84.4, 83.4, 80.2, 76.3, 72.0},
            {68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9},
            {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0},
            {52.0, 54.9, 61.0, 66.9, 74.6, 80.6, 82.6, 82.2, 78.7, 69.5, 60.7, 54.1},
            {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7},
            {66.2, 67.2, 70.6, 73.8, 78.2, 81.2, 82.5, 82.8, 81.7, 78.1, 73.1, 68.3},
            {63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.7, 76.4, 70.5, 64.7}
            
        };
        double[][] precipitation = {
            {4.9, 2.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5},
            {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7},
            {2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6},
            {3.5, 3.4, 4.3, 2.9, 3.2, 6.8, 6.1, 6.6, 4.4, 2.5, 2.2, 2.6},
            {3.7, 3.2, 3.9, 3.1, 3.5, 5.4, 6.0, 6.9, 7.9, 3.9, 2.3, 2.6},
            {2.2, 1.5, 1.9, 2.1, 3.5, 4.6, 3.3, 5.4, 5.5, 4.3, 2.6, 2.1},
            {1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2},
            {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3},
            {5.3, 4.7, 6.4, 3.9, 4.4, 6.4, 8.0, 6.9, 5.8, 4.1, 4.5, 4.0},
            {5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1},
            {3.8, 2.6, 3.7, 3.6, 5.4, 7.6, 6.0, 6.7, 8.1, 5.5, 5.6, 3.1},
            {2.9, 2.5, 4.2, 2.9, 3.8, 6.0, 6.5, 6.0, 6.8, 5.0, 3.0, 2.2}
        };
        String[] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May ", "Jun.", "Jul.", "Aug." ,"Sep.", "Oct.", "Nov.", "Dec."};
        int selection = 0;
        double totalTemp = 0.0;
        double averageTemp = 0.0;
        double annualRain = 0.0;
        boolean cont = true;
        boolean metric = false;
        String location = "";
        String input = "";
        
        Scanner in = new Scanner(System.in);
        
        
        //INPUT GATHERING
        System.out.println("Select which city's information you would like to see");
        System.out.println("==========City=Selection==========");
        System.out.println("*\tApalachicola, FL\t [A]");
        System.out.println("*\tDaytona Beach, FL\t [B]");
        System.out.println("*\tFort Myers, FL\t\t [C]");
        System.out.println("*\tGainesville, FL\t\t [D]");
        System.out.println("*\tJacksonville, FL\t [E]");
        System.out.println("*\tKey West, FL\t\t [F]");
        System.out.println("*\tMiami, FL\t\t [G]");
        System.out.println("*\tOrlando, FL\t\t [H]");
        System.out.println("*\tPensacola, FL\t\t [I]");
        System.out.println("*\tTallahassee, FL\t\t [J]");
        System.out.println("*\tWest Palm Beach, FL\t [K]");
        System.out.println("*\tVero Beach, FL\t\t [L]");
        System.out.println("*\tExit\t\t\t [X]");
        System.out.println("==================================");
        System.out.print("Selection: ");
        
        input = in.next();       
        
            //Assigns the variables to the proper information set
        if(input.substring(0, 1).equalsIgnoreCase("A"))
        {
            selection = 0;
            location = "Apalachicola, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("B"))
        {
            selection = 1;
            location = "Daytona Beach, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("C"))
        {
            selection = 2;
            location = "Fort Myers, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("D"))
        {
            selection = 3;
            location = "Gainesville, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("E"))
        {
            selection = 4;
            location = "Jacksonville, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("F"))
        {
            selection = 5;
            location = "Key West, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("G"))
        {
            selection = 6;
            location = "Miami, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("H"))
        {
            selection = 7;
            location = "Orlando, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("I"))
        {
            selection = 8;
            location = "Pensacola, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("J"))
        {
            selection = 9;
            location = "Tallahassee, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("K"))
        {
            selection = 10;
            location = "West Palm Beach, Florida";
        }
        else if(input.substring(0, 1).equalsIgnoreCase("L"))
        {
            selection = 11;
            location = "Vero Beach, Florida";
        }
        else
        {
            cont = false;
        }
        
        
        //OUTPUT
        System.out.println();
        if(cont)
        {
            System.out.println("Enter the units the data should be displayed in (Metric/Imperial): ");
            input = in.next();
            
            if(input.substring(0, 1).equalsIgnoreCase("M"))
            {
                metric = true;
            }
            System.out.printf("%40s%n", "Climate Data");
            System.out.printf("%30s" + location + "%n", "Location: ");
            
                //Display for Units
            if(metric)
            {
                System.out.printf("%15s%20s%25s%n", "Month", "Temperature (C)", "Precipitation (cm)");
            }
            else
            {
                System.out.printf("%15s%20s%25s%n", "Month", "Temperature (F)", "Precipitation (in.)");
            }
            System.out.println("\t*****************************************************");
            for(int counter = 0; counter < precipitation[0].length; counter ++)
            {
                if(metric)
                {
                    totalTemp += ((temperature[selection][counter] - 32) / 1.8);
                    annualRain += (precipitation[selection][counter] * 2.54);
                    System.out.printf("%13s%15.1f%22.1f%n", month[counter], (((temperature[selection][counter] - 32) / 1.8)), (precipitation[selection][counter] * 2.54));

                }
                else
                {
                    totalTemp += temperature[selection][counter];
                    annualRain += precipitation[selection][counter];
                    System.out.printf("%13s%15.1f%22.1f%n", month[counter], temperature[selection][counter], precipitation[selection][counter]);

                }
            }
            averageTemp = totalTemp / 12;
            System.out.println("\t*****************************************************");
            System.out.printf("%24s%4.1f%17s%4.1f%n", "Average: ", averageTemp, "Annual: ",annualRain);
        }
        else
        {
            System.out.println("Well alright-y then.");
        }
        System.out.print("Goodbye!");
    }
}