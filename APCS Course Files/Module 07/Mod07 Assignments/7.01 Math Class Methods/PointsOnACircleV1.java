/* Author: Eric Osgood
 * Version: 1.0.0 (November 27th, 2015)
 * Purpose: Explore the many uses of the Math methods
 */
import java.util.Scanner;
public class PointsOnACircleV1
{
    public static void main(String[] args)
    {
        //VARIABLE AND OBJECT DECLARATIONS
        double radius = 1;
        double incrementation = 0.1;
        double x = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;
        
        Scanner in= new Scanner(System.in);
        
        
        //INPUT GATHERING
        System.out.print("Please enter the radius of the circle: ");
        radius = in.nextDouble();
        
        System.out.print("Please enter the incrementation of x that you \nwould like to use (For instance, .01, .001, or .1): ");
        incrementation = in.nextDouble();
        
        
        //DATA MANIPULATIONS AND OUTPUT
            //"Clears" the screen
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf("%37s%3.1f%n", "Points on a Circle with Radius: ", radius);
        System.out.printf("%6s%2s%6s%2s%10s%6s%2s%6s%n", "x1", "", "y1", "", "", "x1", "", "y2");
        System.out.println("------------------------------------------");
        for(x = radius; x >= -radius; x -= incrementation)
        {
            y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
            y2 = -Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
                //Safeguard that prevents the printing of any -0.00s to the screen
            if(y2 >= -.001 && y2 <= 0)
            {
                y2 = 0;
            }
            System.out.printf("%8.3f%8.3f%10s%8.3f%8.3f%n", x, y1, "", x, y2);
        }        
    }
}