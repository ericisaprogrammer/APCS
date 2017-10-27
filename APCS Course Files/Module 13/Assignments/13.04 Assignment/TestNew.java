/* Purpose: To demonstrate how to override methods
 * Author: Eric Osgood
 * Date: March 24th, 2016
 */
public class TestNew
{
    public static void showEffectBoth(Box3 a, Box3 b)
    {
        if(a.equals(b))
        {
            System.out.println(a.toString() + " is the same as " + b.toString());
        }
        else if(a.equalsVolume(b))
        {
            System.out.println(a.toString() + " has the same volume as " + b.toString());
        }
        else
        {
            System.out.println(a.toString() + " is not the same as " + b.toString());
        }
    }
    
    public static void main(String[] args)
    {
        Rectangle3 rect1 = new Rectangle3(7, 10);
        Box3 box1 = new Box3(25, 5, 1);
        Box3 box2 = new Box3(5, 5, 5);
        Box3 box3 = new Box3(2, 3, 4);
        Cube3 cube1 = new Cube3(5);
        
        System.out.println(rect1.toString());
        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println(cube1.toString());
        
        showEffectBoth(box1, cube1);
        showEffectBoth(box2, cube1);
        showEffectBoth(box3, cube1);
    }
}