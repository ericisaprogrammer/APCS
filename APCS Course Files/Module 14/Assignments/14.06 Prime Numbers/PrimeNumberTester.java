/* Purpose: A general practice for the topics learned in this module
 * Authoer: Eric Osgood
 * Date: April 2nd, 2016
 */
import java.util.Scanner;
public class PrimeNumberTester
{
    public static void main(String[] args)
    {
        //Variable and object declaration
        int upperLimit = 0;
        
        Scanner in = new Scanner(System.in);
        PrimeNumber prime = new PrimeNumber();
        
        //Input gathering
        System.out.print("Please enter prime upper limit: ");
        upperLimit = in.nextInt();
        
        //Output
        prime.setLimit(upperLimit);
        prime.getPrimes();
        
        System.out.println("There are " + PrimeNumber.primes + " prime numbers between 1 and " + upperLimit + ".");
    }
}