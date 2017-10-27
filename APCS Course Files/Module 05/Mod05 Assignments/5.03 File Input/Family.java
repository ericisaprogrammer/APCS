/* Author: Eric Osgood
 * Version: 1.0.0 (November 19th, 2015)
 * Purpose: To illustrate the usage of IO in Java
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        //Variable Declarations
        int counter = 0;
        int twoBoys = 0;
        int oneEach = 0;
        int twoGirls = 0;
        String token = "";
        
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        
        //File Analysis
        while(inFile.hasNext())
        {
            token = inFile.next();
            if(token.equals("BB"))
            {
                twoBoys ++;
            }
            if(token.equals("GB") || token.equals("BG"))
            {
                oneEach ++;
            }
            if(token.equals("GG"))
            {
                twoGirls ++;
            }
            counter ++;
        }
        inFile.close();
        
        //Output
        System.out.println("Sample Size: " + counter);
        System.out.println("Two Boys: " + twoBoys);
        System.out.println("One Boy One Girl: " + oneEach);
        System.out.println("Two Girls: " + twoGirls);
        System.out.println("Number of Boys: " + (twoBoys * 2 + oneEach));
        System.out.println("Number of Girls: " + (twoGirls * 2 + oneEach));
    }
}