/* Author: Eric Osgood
 * Simulates the opening of objects to get a prize (like those mountain dew giveaways they have every year)
 * Version: 1.0.0 (November 23rd, 2015)
 */

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
        //Variable and Object Declarations
        int trials = 0;
        int random = 0;
        int totalBottles = 0;
        int odds = 0;
        double averageBottles = 0.0;
        boolean noPrize = true;
        String input = "";
        
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("data.txt"));
        Scanner inFile = new Scanner(new File("data.txt"));
        Scanner inFile2 = new Scanner(new File("data.txt"));
        Random randomNumber = new Random();
        
        //Data Manipulations and Simulation
        System.out.print("Enter the number of trials: ");
        trials = in.nextInt();
        System.out.print("Enter the odds of winning a prize (out of one, so 1 out of 5 would be just 5): ");
        odds = in.nextInt();
        
        for(int counter = 1; counter <= trials; counter ++)
        {
            int bottles = 0;
            noPrize = true;
            while(noPrize)
            {
                random = randomNumber.nextInt(odds) + 1;
                if(random == 1)
                {
                    noPrize = false;
                }
                bottles ++;
            }
            outFile.println(bottles);
        }
        outFile.close();
        
        while(inFile.hasNext())
        {
            String token = inFile.next();
            totalBottles += Integer.parseInt(token);
        }
        inFile.close();
        averageBottles = (double)totalBottles / trials;
        
        System.out.println("Would you like to see the results for each individual trial? (Y/N) ");
        input = in.next();
        
        if(input.substring(0, 1).equalsIgnoreCase("Y"))
        {
            int counter = 1;
            while(inFile2.hasNext())
            {
                String token = inFile2.next();
                System.out.println("Trial " + counter + ": " + token + " bottles");
                counter ++;
            }
        }
        inFile2.close();
        
        //Output
        System.out.println();
        System.out.println("=====SIMULATION RESULTS=====");
        System.out.println();
        System.out.println("Total Bottles Opened");
        System.out.println("\t" + totalBottles);
        System.out.println("Total Prizes Won");
        System.out.println("\t" + trials);
        System.out.println("Average Bottles Per Prize");
        System.out.println("\t" + averageBottles);
        
    }
}