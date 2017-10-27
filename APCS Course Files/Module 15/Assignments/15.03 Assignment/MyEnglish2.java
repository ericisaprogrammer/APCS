/* Purpose: To demonstrate the use of an interface
 * Date: April 20th, 2016
 * Author: Eric Osgood
 */
public class MyEnglish2 extends Homework2
{
    MyEnglish2()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("English");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
    
    public void doReading()
    {
        if(getPagesRead() - 1 <= 0)
        {
            setPagesRead(0);
        }
        else
        {
            setPagesRead(getPagesRead() - 1);
        }
    }
}