/* Purpose: To demonstrate how to use recursion
 * Version: March 12th, 2016
 * Author: Eric Osgood
 */

public class Recursion
{
    public static double recursion(int x)
    {
        if(x <= 17)
        {
            return -10;
        }
        else
        {
            return recursion(x - 12) + 2;
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print(recursion(35));
    }
}