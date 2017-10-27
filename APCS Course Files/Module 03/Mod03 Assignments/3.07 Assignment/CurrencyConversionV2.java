/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * CSA/FLVS 2011
 * @author Maria Vieta Jacquard, Eric Osgood
 * @version 09/01/11, 09/05/2015, 09/21/2015
 */

import java.util.Scanner;
public class CurrencyConversionV2
{
    public static void main(String [] args)
    {
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 0;            // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here
        double yenExchangeRate = 0;             // local variable for exchange rate of US Dollars to Yen
        double yenSpent = 99939.75;             // local variable for Japenese Yen spent
        double dollarsSpentInJapan = 0.0;       // local variable for dollars spent in Japan
        
        double euroExchangeRate = 0;            // local variable for exchange rate of US Dollars to Euro
        double eurosSpent = 624.95;             // local variable for Euros spent
        double dollarsSpentInFrance = 0.0;      // local variable for dollars spent in France
        
        //Scanner Objects
        Scanner inExchange = new Scanner(System.in);
        
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Starting US dollars:           " + startingUsDollars);
        // convertion for Mexican pesos
        // code goes below here
        System.out.print("Please input the exchange rate \nfrom US Dollars to Mexican Pesos: ");
        pesoExchangeRate = inExchange.nextDouble();
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        remainingUsDollars = startingUsDollars - dollarsSpentInMexico;
        System.out.println("US dollars spent in Mexico:    " + dollarsSpentInMexico);
        System.out.println();

        // convertion for Japanese yen
        // code goes below here
        System.out.print("Please input the exchange rate \nfrom US Dollars to Japanese Yen: ");
        yenExchangeRate = inExchange.nextDouble();
        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        remainingUsDollars -= dollarsSpentInJapan;
        System.out.println("US dollars spent in Japan:     " + dollarsSpentInJapan);
        System.out.println();

        // convertion for Euros
        // code goes below here
        System.out.print("Please input the exchange rate \nfrom US Dollars to Euros: ");
        euroExchangeRate = inExchange.nextDouble();
        dollarsSpentInFrance = eurosSpent / euroExchangeRate;
        remainingUsDollars -= dollarsSpentInFrance;
        System.out.println("US dollars spent in France:    " + dollarsSpentInFrance);
        System.out.println();

        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;             //cost per item of first souvenir
        int budget1 = 50;              //budget for first item
        int totalItem1 = 0;            //how many items can be purchased
        double fundsRemaining1 = 0.0;  //how much of the budget is left
        
        totalItem1 = budget1 / costItem1;
        fundsRemaining1 = budget1 % costItem1;

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        //Calculations for Souvenir #2
        double costItem2 = 32.55;       //cost per item of second souvenir
        int budget2 = 713;              //budget for second item
        int totalItem2 = 0;            //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left
        
        totalItem2 = (int)(budget2 / 32.55);
        fundsRemaining2 = budget2 % costItem2;

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

