/* Purpose: To demonstrate proper useage of Assertions and Exceptions
 * Author: Eric Osgood
 * Date: June 6th, 2016
 */
public class CandyMachine
{
    //Precondition: payment > 0
    public static void sellProduct(Dispenser disp, CashRegister register, int payment)
    {
        if(payment <= 0)
        {
            throw new RuntimeException("Cannot receive a negative/zero input.");
        }
        if(payment < disp.getCost())
        {
            System.out.println("You do not have enough money: You are" + (payment - disp.getCost()) + " cent(s) short.");
        }
        else if(payment > disp.getCost())
        {
            disp.makeSale();
            register.acceptAmount(disp.getCost());
            System.out.println("Your candy and change (" + (payment - disp.getCost()) + " cent(s)) are dispensed below. Enjoy!");
        }
        else
        {
            disp.makeSale();
            register.acceptAmount(disp.getCost());
            System.out.println("Your candy is dispensed below. Enjoy!");
        }
    }
    
    public static void main(String[] args)
    {
        //int testCost = 0; int testNumberOfItems = 1;       // ---> Tests cost RuntimeException
        //int testCost = 1; int testNumberOfItems = 0;       // ---> Tests number of items RuntimeException
        int testCost = 50; int testNumberOfItems = 100;    // ---> Used to test RuntimeExceptions outside the Dispenser class
        Dispenser machine = new Dispenser(testNumberOfItems, testCost);
        
        //int testCashOnHand = 0; int testCash = 1; int testPayment = 1;     // ---> Tests cash on hand RuntimeException
        //int testCashOnHand = 1; int testCash = 0; int testPayment = 1;     // ---> Tests accessor RuntimeException
        //int testCashOnHand = 1; int testCash = 1; int testPayment = 0;     // ---> Tests payment RuntimeException
        int testCashOnHand = 499; int testCash = 499; int testPayment = 1; // ---> Used to test RuntimeExceptions outside the CashRegister class
        CashRegister register = new CashRegister(testCashOnHand);
        register.setCash(testCash);
        register.acceptAmount(testPayment);
        
        //int payment = 0;              // ---> Tests payment RuntimeException
        //int payment = testCost;       // ---> Tests proper if statement function
        int payment = testCost + 25;  // ---> Tests proper if statement function
        sellProduct(machine, register, payment);
    }
}