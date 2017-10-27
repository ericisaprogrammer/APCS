/* Purpose: To demonstrate the basic principals for inheritance
 * Author: Eric Osgood
 * Date: March 21st, 2016
 */
public class CubeTester
{
    public static void main(String[] args)
    {
        Box box1 = new Box(1, 2, 3);
        Cube cube1 = new Cube(4);
        
        System.out.printf("Box Dimensions: %1d X %1d X %1d%10s%1d%n%n", box1.getLength(), box1.getWidth(), box1.getHeight(), "Volume: ", box1.calcVolume());
        System.out.printf("Cube Dimensions: %1d X %1d X %1d%10s%1d", cube1.getLength(), cube1.getWidth(), cube1.getHeight(), "Volume: ", cube1.calcVolume());
    }
}