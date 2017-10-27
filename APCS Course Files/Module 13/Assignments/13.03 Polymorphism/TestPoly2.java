/* Purpose: To understand the basic principals of Polymorphism
 * Author: Eric Osgood
 * Date: March 24th, 2016
 */
import java.util.ArrayList;
public class TestPoly2
{
    public static void showCenter(Circle2 c)
    {
        System.out.println("For " + c + " the " + c.center() + ".");
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        
        circles.add(new Oval2(7, 6, 2, 1));
        circles.add(new Circle2(-2, -6, 1));
        circles.add(new Circle2(-10, 2, 13));
        circles.add(new Oval2(3, 7, 5, 6));
        circles.add(new OvalCylinder2(16, 8, 3, 2, 4));
        circles.add(new Cylinder2(2, 1, 9, 2));
        circles.add(new Cylinder2(-1, -7, 5, 3));
        circles.add(new Oval2(4, 4, 2, 3));
        circles.add(new OvalCylinder2(5, 2, 4, 1, 11));
        circles.add(new Circle2(1, 1, 20));
        
        for(Circle2 oval : circles)
        {
            showCenter(oval);
        }
    }
}