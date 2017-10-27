/* Purpose: To understand selection sort
 * Author: Eric Osgood
 * Date: May 2nd, 2016
 */
public class Movie3Tester
{
    public static void printMovies(Movie3[] a)
    {
        for(Movie3 b : a)
        {
            System.out.println(b.toString());
        }
    }
    
    public static Movie3[] sortTitles(Movie3[] a, int order)
    {
        if(order == 1)
        {
            for(int i = a.length; i > 0; i --)
            {
                Movie3 max = a[0];
                int pos = 0;
                for(int k = 0; k < i; k ++)
                {
                    if(max.getTitle().compareTo(a[k].getTitle()) < 0)
                    {
                        max = a[k];
                        pos = k;
                    }
                }
                Movie3 hold = a[i - 1];
                a[i - 1] = max;
                a[pos] = hold;
            }
        }
        else if(order == 2)
        {
            for(int i = a.length; i > 0; i --)
            {
                Movie3 max = a[0];
                int pos = 0;
                for(int k = 0; k < i; k ++)
                {
                    if(max.getTitle().compareTo(a[k].getTitle()) > 0)
                    {
                        max = a[k];
                        pos = k;
                    }
                }
                Movie3 hold = a[i - 1];
                a[i - 1] = max;
                a[pos] = hold;
            }
        }
        return a;
    }
    
    public static Movie3[] sortYears(Movie3[] a, int order)
    {
        if(order == 1)
        {
            for(int i = a.length; i > 0; i --)
            {
                Movie3 max = a[0];
                int pos = 0;
                for(int k = 0; k < i; k ++)
                {
                    if(max.getYear() < a[k].getYear())
                    {
                        max = a[k];
                        pos = k;
                    }
                }
                Movie3 hold = a[i - 1];
                a[i - 1] = max;
                a[pos] = hold;
            }
        }
        else if(order == 2)
        {
            for(int i = a.length; i > 0; i --)
            {
                Movie3 max = a[0];
                int pos = 0;
                for(int k = 0; k < i; k ++)
                {
                    if(max.getYear() > a[k].getYear())
                    {
                        max = a[k];
                        pos = k;
                    }
                }
                Movie3 hold = a[i - 1];
                a[i - 1] = max;
                a[pos] = hold;
            }
        }
        return a;
    }
    
    public static Movie3[] sortStudios(Movie3[] a, int order)
    {
        if(order == 1)
        {
            for(int i = a.length; i > 0; i --)
            {
                Movie3 max = a[0];
                int pos = 0;
                for(int k = 0; k < i; k ++)
                {
                    if(max.getStudio().compareTo(a[k].getStudio()) < 0)
                    {
                        max = a[k];
                        pos = k;
                    }
                }
                Movie3 hold = a[i - 1];
                a[i - 1] = max;
                a[pos] = hold;
            }
        }
        else if(order == 2)
        {
            for(int i = a.length; i > 0; i --)
            {
                Movie3 max = a[0];
                int pos = 0;
                for(int k = 0; k < i; k ++)
                {
                    if(max.getStudio().compareTo(a[k].getStudio()) > 0)
                    {
                        max = a[k];
                        pos = k;
                    }
                }
                Movie3 hold = a[i - 1];
                a[i - 1] = max;
                a[pos] = hold;
            }
        }
        return a;
    }
    
    public static void main(String[] args)
    {
        Movie3[] myMovies = new Movie3[10];
        myMovies[0] = new Movie3("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie3("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie3("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie3("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie3("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie3("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie3("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie3("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie3("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Original Order:");
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted By Title (Ascending)");
        myMovies = sortTitles(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted By Title (Descending)");
        myMovies = sortTitles(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted By Year (Ascending)");
        myMovies = sortYears(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted By Year (Descending)");
        myMovies = sortYears(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted By Studio (Ascending)");
        myMovies = sortStudios(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted By Studio (Descending)");
        myMovies = sortStudios(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
    }
}