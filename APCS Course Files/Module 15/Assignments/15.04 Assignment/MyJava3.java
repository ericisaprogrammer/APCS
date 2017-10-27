/* Purpose: To demonstrate the use of a Comparable<T> interface
 * Date: April 25th, 2016
 * Author: Eric Osgood
 */
public class MyJava3 extends Homework3
{
    MyJava3()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Java");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
    
    public int compareTo(Homework3 a)
    {
        return getPagesRead() - a.getPagesRead();
    }
}