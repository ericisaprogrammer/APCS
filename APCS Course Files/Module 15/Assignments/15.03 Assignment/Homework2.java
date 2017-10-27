/* Purpose: To demonstrate the use of an interface
 * Date: April 20th, 2016
 * Author: Eric Osgood
 */
public abstract class Homework2 implements Processing
{
    private int pagesRead;
    private String typeHomework;
    
    Homework2()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    Homework2(int pagesRead, String typeHomework)
    {
        this.pagesRead = pagesRead;
        this.typeHomework = typeHomework;
    }
    
    public int getPagesRead()
    {
        return pagesRead;
    }
    
    public void setPagesRead(int pagesRead)
    {
        this.pagesRead = pagesRead;
    }
    
    public String getTypeHomework()
    {
        return typeHomework;
    }
    
    public void setTypeHomework(String typeHomework)
    {
        this.typeHomework = typeHomework;
    }
    
    public abstract void createAssignment(int p);
}