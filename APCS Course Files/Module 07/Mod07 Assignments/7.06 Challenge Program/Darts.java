/* Author: Eric Osgood
 * Version: 1.0.0 (December 12th, 2015)
 * Purpose: Approximates pi using the Monte Carlo method of approximation
 */
import java.util.Random;
import java.util.Scanner;
public class Darts
{
    //Determines whether or not the dart hit the circle
    public static boolean missedShot(double x, double y)
    {
        boolean miss = false;
        if(Math.pow(x, 2) + Math.pow(y, 2) > 1)
        {
            miss = true;
        }
        return miss;
    }
    
    public static void main(String[] args)
    {
        //VARIABLE AND OBJECT DECLARATIONS
        int trials = 0;
        int darts = 0;
        int hits = 0;
        double approximation = 0.0;
        double average = 0.0;        
        double x = 0.0;
        double y = 0.0;
        boolean miss = false;
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        
        //INPUT GATHERING
        System.out.print("How many trials are there: ");
        trials = in.nextInt();
        System.out.print("How many throws per trial: ");
        darts = in.nextInt();
        
        
        //DATA MANIPULATION AND OUTPUT
        for(int counter = 1; counter <= trials; counter ++)
        {
            hits = 0;
            for(int counter2 = 1; counter2 <= darts; counter2 ++)
            {
                x = random.nextDouble();
                y = random.nextDouble();
                miss = missedShot(x, y);
                if(!miss)
                {
                    hits ++;
                }
            }
            approximation = (double)hits / darts * 4;
            System.out.println("Trial [" + counter + "]: " + approximation);
            average += approximation;
        }
        average /= trials;
        System.out.println("Average: " + average);
    }
}