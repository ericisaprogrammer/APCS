/* Purpose: To demonstrate proper useage of Assertions and Exceptions
 * Author: Eric Osgood
 * Date: June 6th, 2016
 */
public class CashRegister
{
    private int cashOnHand;
    
    CashRegister()
    {
        cashOnHand = 500;
    }
    
    //Precondition: cashOnHand > 0
    CashRegister(int cashOnHand)
    {
        if(cashOnHand <= 0)
        {
            throw new RuntimeException("Cannot have negative/no money.");
        }
        this.cashOnHand = cashOnHand;
    }
    
    //Precondition: cash > 0
    public void setCash(int cash)
    {
        if(cash <= 0)
        {
            throw new RuntimeException("Cannot set money to be negative/none.");
        }
        cashOnHand = cash;
    }
    
    //Precondition: payment > 0
    public void acceptAmount(int payment)
    {
        if(payment <= 0)
        {
            throw new RuntimeException("Cannot have a negative/zero payment.");
        }
        cashOnHand += payment;
    }
}