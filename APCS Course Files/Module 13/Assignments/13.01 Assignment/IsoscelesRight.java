/* Purpose: To demonstrate the basic principals for inheritance
 * Author: Eric Osgood
 * Date: March 21st, 2016
 */
public class IsoscelesRight extends Triangle
{
    IsoscelesRight(double sideLength)
    {
        super(sideLength, sideLength, Math.pow(.5, 2 * Math.pow(2, sideLength)));
    }
}