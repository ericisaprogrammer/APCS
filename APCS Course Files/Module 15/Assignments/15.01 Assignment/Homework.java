public abstract class Homework
{
    private int pagesRead;
    private String typeHomework;
    
    Homework()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    Homework(int pagesRead, String typeHomework)
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