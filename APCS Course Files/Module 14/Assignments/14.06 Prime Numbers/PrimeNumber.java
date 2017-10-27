/* Purpose: A general practice for the topics learned in this module
 * Authoer: Eric Osgood
 * Date: April 2nd, 2016
 */
public class PrimeNumber
{
    //Class variables and instances declarations
    public static int primes = 0;
    private int upperLimit = 0;
    
    //Default constructor
    PrimeNumber()
    {
        
    }
    
    //Method to display all primes between 1 and designated upper limit
    public void getPrimes()
    {
        for(int i = 1; i <= upperLimit; i ++)
        {
            boolean prime = true;
            for(int j = 2; j <= i / 2; j ++)
            {
                if(i % j == 0)
                {
                    prime = false;
                    j += i / 2;
                }
            }
            if(prime)
            {
                System.out.println(i);
                primes ++;
            }
        }
    }
    
    //Assigns a value to the class variable upperLimit
    public void setLimit(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }
}