/* Purpose: To understand merge sort
 * Author: Eric Osgood
 * Date: May 7th, 2016
 */
public class Movie4
{
    private String title, studio;
    private int year;
    
    Movie4(String title, int year, String studio)
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