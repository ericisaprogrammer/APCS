/* Purpose: To understand insertion sort
 * Author: Eric Osgood
 * Date: May 2nd, 2016
 */
public class TestMovie2
{
    public static void printMovies(Movie2[] a)
    {
        for(Movie2 b : a)
        {
            System.out.println(b.toString());
        }
    }
    
    public static Movie2[] sortTitles(Movie2[]a, int order)
    {
        Movie2[] dest = new Movie2[a.length];
        if(order == 1)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Movie2 hold = a[i];
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(hold.getTitle().compareTo(dest[k - 1].getTitle()) >= 0)
                    {
                        insert = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k --;
                }
                dest[insert] = hold;
            }
        }
        else if(order == 2)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Movie2 hold = a[i];
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(hold.getTitle().compareTo(dest[k - 1].getTitle()) <= 0)
                    {
                        insert = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k --;
                }
                dest[insert] = hold;
            }
        }
        return dest;
    }
    
    public static Movie2[] sortYears(Movie2[] a, int order)
    {
        Movie2[] dest = new Movie2[a.length];
        if(order == 1)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Movie2 hold = a[i];
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(hold.getYear() >= dest[k - 1].getYear())
                    {
                        insert = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k --;
                }
                dest[insert] = hold;
            }
        }
        else if(order == 2)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Movie2 hold = a[i];
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(hold.getYear() <= dest[k - 1].getYear())
                    {
                        insert = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k --;
                }
                dest[insert] = hold;
            }
        }
        return dest;
    }
    
    public static Movie2[] sortStudios(Movie2[] a, int order)
    {
        Movie2[] dest = new Movie2[a.length];
        if(order == 1)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Movie2 hold = a[i];
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(hold.getStudio().compareTo(dest[k - 1].getStudio()) >= 0)
                    {
                        insert = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k --;
                }
                dest[insert] = hold;
            }
        }
        else if(order == 2)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Movie2 hold = a[i];
                int insert = 0;
                int k = i;
                while(k > 0 && insert == 0)
                {
                    if(hold.getStudio().compareTo(dest[k - 1].getStudio()) <= 0)
                    {
                        insert = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k --;
                }
                dest[insert] = hold;
            }
        }
        return dest;
    }
    
    public static void main(String[] args)
    {
        Movie2[] myMovies = new Movie2[10];
        myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
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