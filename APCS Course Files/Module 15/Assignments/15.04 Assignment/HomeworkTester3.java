/* Purpose: To demonstrate the use of a Comparable<T> interface
 * Date: April 25th, 2016
 * Author: Eric Osgood
 */
import java.util.ArrayList;
import java.util.Random;
public class HomeworkTester3
{
    public static void main(String[] args)
    {
        ArrayList<Homework3> homework = new ArrayList<Homework3>();
        homework.add(new MyMath3());
        homework.add(new MyEnglish3());
        homework.add(new MyScience3());
        homework.add(new MyJava3());
        
        for(Homework3 a : homework)
        {
            Random rand = new Random();
            a.createAssignment(rand.nextInt(17) + 3);
            System.out.println(a.toString());
        }
        
        for(int i = 0; i < homework.size(); i ++)
        {
            for(int j = i + 1; j < homework.size(); j ++)
            {
                if(homework.get(i).compareTo(homework.get(j)) == 0)
                {
                    System.out.println("The homework for " + homework.get(i).getTypeHomework() + " and " + homework.get(j).getTypeHomework() + " are the same number of pages.");
                }
            }
        }
    }
}