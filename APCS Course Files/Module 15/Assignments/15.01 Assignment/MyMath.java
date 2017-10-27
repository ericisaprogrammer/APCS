public class MyMath extends Homework
{
    MyMath()
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
}