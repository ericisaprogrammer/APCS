/* Purpose: To reinforce the topics learned in Module 16
 * Author: Eric Osgood
 * Date: April 27th, 2016
 */
public class Student
{
    private String name;
    private int qz1, qz2, qz3, qz4, qz5;
    
    Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getQuiz(int a)
    {
        if(a == 1)
        {
            return qz1;
        }
        if(a == 2)
        {
            return qz2;
        }
        if(a == 3)
        {
            return qz3;
        }
        if(a == 4)
        {
            return qz4;
        }
        if(a == 5)
        {
            return qz5;
        }
        return -1;
    }
    
    public void setQuiz(int quiz, int score)
    {
        if(quiz == 1)
        {
            qz1 = score;
        }
        if(quiz == 2)
        {
            qz2 = score;
        }
        if(quiz == 3)
        {
            qz3 = score;
        }
        if(quiz == 4)
        {
            qz4 = score;
        }
        if(quiz == 5)
        {
            qz5 = score;
        }
    }
    
    public String toString()
    {
        return name + " - " + qz1 + ", " + qz2 + ", " + qz3 + ", " + qz4 + ", " + qz5;
    }
}
