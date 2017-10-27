import java.util.ArrayList;
import java.util.Random;
public class TestHomework
{
    public static void main(String[] args)
    {
        ArrayList<Homework> homework = new ArrayList<Homework>();
        homework.add(new MyMath());
        homework.add(new MyEnglish());
        homework.add(new MyScience());
        homework.add(new MyJava());
        
        for(Homework a : homework)
        {
            Random rand = new Random();
            a.createAssignment(rand.nextInt(20));
            System.out.println(a.toString());
        }
    }
}