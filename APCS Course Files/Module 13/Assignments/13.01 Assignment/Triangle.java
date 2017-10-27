/* Purpose: To demonstrate the basic principals for inheritance
 * Author: Eric Osgood
 * Date: March 21st, 2016
 */
public class Triangle
{
    private double sideA, sideB, sideC;
    Triangle(double a, double b, double c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }
    
    
    public double getSideA()
    {
        return sideA;
    }
    
    public double getSideB()
    {
        return sideB;
    }
    
    public double getSideC()
    {
        return sideC;
    }
}