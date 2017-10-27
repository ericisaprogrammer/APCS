/* Purpose: To reinforce the topics learned in Module 16
 * Author: Eric Osgood
 * Date: April 27th, 2016
 */
import java.util.ArrayList;
public class TestStudent
{
    public static void printBook(ArrayList<Student> a)
    {
        System.out.printf("%-20s%6s%6s%6s%6s%6s%n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("--------------------------------------------------");
        for(Student b : a)
        {
            System.out.printf("%-20s%6d%6d%6d%6d%6d%n", b.getName() + ":", b.getQuiz(1), b.getQuiz(2), b.getQuiz(3), b.getQuiz(4), b.getQuiz(5));
        }
    }
    
    public static void replaceName(ArrayList<Student> a, String name, String newName)
    {
        for(Student b : a)
        {
            if(b.getName().equals(name))
            {
                b.setName(newName);
            }
        }
    }
    
    public static void replaceQuiz(ArrayList<Student> a, String name, int quiz, int quizScore)
    {
        for(Student b : a)
        {
            if(b.getName().equals(name))
            {
                b.setQuiz(quiz, quizScore);
            }
        }
    }
    
    public static void replaceStudent(ArrayList<Student> a, String name, Student newStudent)
    {
        int i = 0;
        for(Student b : a)
        {
            if(b.getName().equals(name))
            {
                a.set(i, newStudent);
            }
            i ++;
        }
    }
    
    public static void insertStudent(ArrayList<Student> a, String name, Student newStudent)
    {
        int i = getIndex(a, name);
        a.add(i, newStudent);
    }
    
    public static int getIndex(ArrayList<Student> a, String name)
    {
        for(int i = 0; i < a.size(); i ++)
        {
            if(a.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void deleteStudent(ArrayList<Student> a, String name)
    {
        int i = getIndex(a, name);
        a.remove(i);            
    }
    
    public static void main(String[] args)
    {
        ArrayList<Student> myClass = new ArrayList<Student>();
        
        myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
        myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
        
        System.out.println("Starting Gradebook:");
        System.out.println();
        printBook(myClass);
        
        System.out.println();
        System.out.println("Changing Betty's name to Betty Boop:");
        System.out.println();
        replaceName(myClass, "Betty Farm", "Betty Boop");
        printBook(myClass);
        
        System.out.println();
        System.out.println("Changing Jean's Q1 score to 80:");
        System.out.println();
        replaceQuiz(myClass, "Jean Smith", 1, 80);
        printBook(myClass);
        
        System.out.println();
        System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90:");
        System.out.println();
        replaceStudent(myClass, "Dilbert Gamma", new Student("Mike Kappa", 80, 80, 80, 90, 90));
        printBook(myClass);
        
        System.out.println();
        System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100 befor Betty:");
        System.out.println();
        insertStudent(myClass, "Betty Boop", new Student("Lily Mu", 85, 95, 70, 0, 100));
        printBook(myClass);
        
        System.out.println();
        System.out.println("Deleting Max Gerard:");
        System.out.println();
        deleteStudent(myClass, "Max Gerard");
        printBook(myClass);
    }
}