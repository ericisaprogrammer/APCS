/* Purpose: To demonstrate a use of recursion
 * Author: Eric Osgood
 * Date: March 17th, 2016
 */
import java.util.Scanner;
public class FibonacciNumbers
{
    public static double fibonacci(double position, double x, double y)
    {
        if(position == 0)
        {
            return y;
        }
        else if(position < 0)
        {
            return 1;
        }
        else
        {
            return fibonacci((int)(position - 1), y, y + x);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        
        System.out.print("Enter the position you wish to see (type Q to quit): ");
        input = in.next();
        while(!input.equalsIgnoreCase("Q"))
        {
            if(Double.parseDouble(input) < 3)
            {
                input = "1";
            }
            System.out.printf("%1.0f%n", fibonacci(Double.parseDouble(input) - 2, 1, 1));
            System.out.print("Enter the position you wish to see (type Q to quit): ");
            input = in.next();
        }
    }
}