/* Purpose: To demonstrate how to utilize binary search
 * Author: Eric Osgood
 * Date: May 22nd, 2016 
 */
public class Music2
{
    private String title, singer;
    private int year;
    
    Music2(String title, int year, String singer)
    {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getSinger()
    {
        return singer;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String toString()
    {
        return title + ", " + year + ", " + singer;
    }
}