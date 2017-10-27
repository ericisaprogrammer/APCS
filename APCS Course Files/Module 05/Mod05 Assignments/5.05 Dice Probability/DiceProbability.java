/* Author: Eric Osgood
 * Purpose: Displays the likelyhood of a certain number coming up on a pair of dice
 * Version: 1.0.0 (November 21st, 2015)
 */
        //System.out.println("    2s\t\t\t    2.000000");
import java.util.Random;
import java.util.Scanner;
public class DiceProbability
{
    public static void main(String[] args)
    {
        //Variable Declarations
        int diceSum = 0;
        double rollProbability = 0.0;
        int rollPossibilities = 0;
        int sides = 11;
        int rolls = 0;
        int numDice = 2;
        String input = "";
        
        Scanner in = new Scanner(System.in);
        Random randomNumber = new Random();
        
        
        //Input Gathering               
        System.out.print("Enter the number of times two d-11s are rolled: ");
        rolls = in.nextInt();
        
        System.out.println();
        
        
        //Data Manipulations and Output
        System.out.println("    Sum of Dice\t\t\t Probability(%)");
        for(diceSum = numDice; diceSum <= numDice * sides; diceSum ++)
        {
            rollPossibilities = sides * sides;
            if(diceSum <= sides + 1)
            {
                rollProbability = 100 * ((double)(diceSum - 1) / rollPossibilities);
            }
            else
            {
                rollProbability = 100 * ((double)(2 * sides - diceSum + 1) / rollPossibilities);
            }
            System.out.print("\t" + diceSum + "s:");
            System.out.println("\t\t\t      " + rollProbability);
        }
        System.out.println("Type something and press enter to continue.");
        input = in.next();
        
        System.out.println("\n\nSimulation Results");
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        int roll5 = 0;
        int roll6 = 0;
        int roll7 = 0;
        int roll8 = 0;
        int roll9 = 0;
        int roll10 = 0;
        int roll11 = 0;
        int roll12 = 0;
        int roll13 = 0;
        int roll14 = 0;
        int roll15 = 0;
        int roll16 = 0;
        int roll17 = 0;
        int roll18 = 0;
        int roll19 = 0;
        int roll20 = 0;
        int roll21 = 0;
        int roll22 = 0;
        int rolled = 0;
        
        for(int counter = 1; counter <= rolls; counter ++)
        {
            rolled = randomNumber.nextInt(sides * sides) + 1;
            if(rolled == 1)
            {
                roll2 ++;
            }
            else if(rolled <= 3)
            {
                roll3 ++;
            }
            else if(rolled <= 6)
            {
                roll4 ++;
            }
            else if(rolled <= 10)
            {
                roll5 ++;
            }
            else if(rolled <= 15)
            {
                roll6 ++;
            }
            else if(rolled <= 21)
            {
                roll7 ++;
            }
            else if(rolled <= 28)
            {
                roll8 ++;
            }
            else if(rolled <= 36)
            {
                roll9 ++;
            }
            else if(rolled <= 45)
            {
                roll10 ++;
            }
            else if(rolled <= 55)
            {
                roll11 ++;
            }
            else if(rolled <= 66)
            {
                roll12 ++;
            }
            else if(rolled <= 76)
            {
                roll13 ++;
            }
            else if(rolled <= 85)
            {
                roll14 ++;
            }
            else if(rolled <= 93)
            {
                roll15 ++;
            }
            else if(rolled <= 100)
            {
                roll16 ++;
            }
            else if(rolled <= 106)
            {
                roll17 ++;
            }
            else if(rolled <= 111)
            {
                roll18 ++;
            }
            else if(rolled <= 115)
            {
                roll19 ++;
            }
            else if(rolled <= 118)
            {
                roll20 ++;
            }
            else if(rolled <= 120)
            {
                roll21 ++;
            }
            else if(rolled == 121)
            {
                roll22 ++;
            }
        }
        
        System.out.println("    Sum of Dice\t\t\t Times Rolled");
        System.out.println("\t2s:\t\t\t     " + roll2);
        System.out.println("\t3s:\t\t\t     " + roll3);
        System.out.println("\t4s:\t\t\t     " + roll4);
        System.out.println("\t5s:\t\t\t     " + roll5);
        System.out.println("\t6s:\t\t\t     " + roll6);
        System.out.println("\t7s:\t\t\t     " + roll7);
        System.out.println("\t8s:\t\t\t     " + roll8);
        System.out.println("\t9s:\t\t\t     " + roll9);
        System.out.println("\t10s:\t\t\t     " + roll10);
        System.out.println("\t11s:\t\t\t     " + roll11);
        System.out.println("\t12s:\t\t\t     " + roll12);
        System.out.println("\t13s:\t\t\t     " + roll13);
        System.out.println("\t14s:\t\t\t     " + roll14);
        System.out.println("\t15s:\t\t\t     " + roll15);
        System.out.println("\t16s:\t\t\t     " + roll16);
        System.out.println("\t17s:\t\t\t     " + roll17);
        System.out.println("\t18s:\t\t\t     " + roll18);
        System.out.println("\t19s:\t\t\t     " + roll19);
        System.out.println("\t20s:\t\t\t     " + roll20);
        System.out.println("\t21s:\t\t\t     " + roll21);
        System.out.println("\t22s:\t\t\t     " + roll22);
    }
}
