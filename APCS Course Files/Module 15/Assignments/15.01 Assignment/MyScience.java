public class MyScience extends Homework
{
    MyScience()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}