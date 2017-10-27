/* Purpose: To understand selection sort
 * Author: Eric Osgood
 * Date: May 2nd, 2016
 */
public class Movie3
{
    private String title, studio;
    private int year;
    
    Movie3(String title, int year, String studio)
    {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getStudio()
    {
        return studio;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String toString()
    {
        return title + " (" + year + ") - " + studio;
    }
}