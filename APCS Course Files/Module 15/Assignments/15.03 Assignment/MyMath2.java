/* Purpose: To demonstrate the use of an interface
 * Date: April 20th, 2016
 * Author: Eric Osgood
 */
public class MyMath2 extends Homework2
{
    MyMath2()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
    
    public void doReading()
    {
        if(getPagesRead() - 2 <= 0)
        {
            setPagesRead(0);
        }
        else
        {
            setPagesRead(getPagesRead() - 2);
        }
    }
}