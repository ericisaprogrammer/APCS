public class MyJava extends Homework
{
    MyJava()
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
}