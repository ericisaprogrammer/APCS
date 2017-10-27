/* Purpose: To understand how to use sequential searching
 * Author: Eric Osgood
 * Date: May 18th, 2016
 */
public class Music
{
    private String title, singer;
    private int year;
    
    Music(String title, int year, String singer)
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