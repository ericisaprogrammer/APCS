/* Purpose: To demonstrate how to override methods
 * Author: Eric Osgood
 * Date: March 24th, 2016
 */
public class Cube3 extends Box3
{
    private int x;
    Cube3(int side)
    {
        super(side, side, side);
        x = side;
    }
    
    public String toString()
    {
        return "Cube - " + x + " X " + x + " X " + x;
    }
}