/* Purpose: To demonstrate the use of an interface
 * Date: April 20th, 2016
 * Author: Eric Osgood
 */
import java.util.ArrayList;
import java.util.Random;
public class TestHomework2
{
    public static void main(String[] args)
    {
        ArrayList<Homework2> homework = new ArrayList<Homework2>();
        homework.add(new MyMath2());
        homework.add(new MyEnglish2());
        homework.add(new MyScience2());
        homework.add(new MyJava2());
        
        for(Homework2 a : homework)
        {
            Random rand = new Random();
            a.createAssignment(rand.nextInt(17) + 3);
            System.out.println("Before Reading:");
            System.out.println(a.toString());
            System.out.println("After Reading:");
            a.doReading();
            System.out.println(a.toString());
        }
    }
}