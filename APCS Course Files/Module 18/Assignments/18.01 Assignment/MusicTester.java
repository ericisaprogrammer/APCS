/* Purpose: To understand how to use sequential searching
 * Author: Eric Osgood
 * Date: May 18th, 2016
 */
public class MusicTester
{
    public static void printMusic(Music[] a)
    {
        System.out.println("My Music:");
        for(Music b : a)
        {
            System.out.println(b);
        }
    }
    
    public static void searchTitle(Music[] a, String title)
    {
        System.out.println("Search - Title - " + title);
        int found = -1;
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i].getTitle().equalsIgnoreCase(title))
            {
                found = i;
                break;
            }
        }
        
        if(found == -1)
        {
            System.out.println("\"" + title + "\" is not in the library.");
        }
        else
        {
            System.out.println("We found \"" + title + "\" in the library:");
            System.out.println(a[found].toString());
        }
    }
    
    public static void searchYear(Music[] a, int year)
    {
        System.out.println("Search - Year - " + year);
        int found = 0;
        System.out.println("Found Results:");
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i].getYear() == year)
            {
                System.out.println(a[i].toString());
                found ++;
            }
        }
        
        if(found == 0)
        {
            System.out.println("There are no listings for " + year + ".");
        }
        else
        {
            System.out.println("There were " + found + " listings for " + year + ".");
        }
    }
    
    public static void searchSinger(Music[] a, String singer)
    {
        System.out.println("Search - Singer - " + singer);
        int found = 0;
        System.out.println("Found Results:");
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i].getSinger().equalsIgnoreCase(singer))
            {
                System.out.println(a[i].toString());
                found ++;
            }
        }
        
        if(found == 0)
        {
            System.out.println("There are no songs by " + singer + ".");
        }
        else
        {
            System.out.println("There were " + found + " listings by " + singer + ".");
        }
    }
    
    public static void main(String[] args)
    {
        Music[] myMusic = new Music[10];
        
        myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music("What If It's You", 1995, "Reba McEntire");
        myMusic[3] = new Music("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
        myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music("Let it Go", 2007, "Tim McGraw");
        myMusic[9] = new Music("White Flag", 2004, "Dido");
        
        printMusic(myMusic);
        System.out.println();
        
        searchTitle(myMusic, "Let Go");
        System.out.println();
        
        searchTitle(myMusic, "Uptown Funk");
        System.out.println();
        
        searchYear(myMusic, 2001);
        System.out.println();
        
        searchYear(myMusic, 2003);
        System.out.println();
        
        searchSinger(myMusic, "Avril Lavigne");
        System.out.println();
        
        searchSinger(myMusic, "Jesus Christ");
    }
}