/* Purpose: To demonstrate the use of a Comparable<T> interface
 * Date: April 25th, 2016
 * Author: Eric Osgood
 */
public abstract class Homework3 implements Comparable<Homework3>
{
    private int pagesRead;
    private String typeHomework;
    
    Homework3()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    Homework3(int pagesRead, String typeHomework)
    {
        this.pagesRead = pagesRead;
        this.typeHomework = typeHomework;
    }
    
    public int getPagesRead()
    {
        return pagesRead;
    }
    
    public String getTypeHomework()
    {
        return typeHomework;
    }
    
    public void setPagesRead(int pagesRead)
    {
        this.pagesRead = pagesRead;
    }
    
    public void setTypeHomework(String typeHomework)
    {
        this.typeHomework = typeHomework;
    }
    
    public abstract void createAssignment(int p);
}