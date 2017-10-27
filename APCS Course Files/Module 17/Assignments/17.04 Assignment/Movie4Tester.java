/* Purpose: To understand merge sort
 * Author: Eric Osgood
 * Date: May 7th, 2016
 */
public class Movie4Tester
{
    public static void printMovies(Movie4[] a)
    {
        for(Movie4 b : a)
        {
            System.out.println(b.toString());
        }
    }
    
    public static void sortTitles(Movie4[] a, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low + high) / 2;
        
        sortTitles(a, low, mid);
        sortTitles(a, mid + 1, high);
        
        mergeTitles(a, low, mid, high);
    }
    
    public static void mergeTitles(Movie4[] a, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        while(i <= mid || j <= high)
        {
            if(i > mid)
            {
                temp[n] = a[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = a[i];
                i++;               
            }
            else if(a[i].getTitle().compareTo(a[j].getTitle()) < 0)
            {
                temp[n] = a[i];
                i++;
            }
            else
            {
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k ++)
        {
            a[k] = temp[k - low];
        }
    }
    
    public static void sortStudios(Movie4[] a, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low + high) / 2;
        
        sortStudios(a, low, mid);
        sortStudios(a, mid + 1, high);
        
        mergeStudios(a, low, mid, high);
    }
    
    public static void mergeStudios(Movie4[] a, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high)
        {
            if(i > mid)
            {
                temp[n] = a[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = a[i];
                i++;
            }
            else if(a[i].getStudio().compareTo(a[j].getStudio()) < 0)
            {
                temp[n] = a[i];
                j++;
            }
            else
            {
                temp[n] = a[j];
                j++;
            }
            n++;
        }
    }
    
    public static void sortYears(Movie4[] a, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low + high) / 2;
        
        sortYears(a, low, mid);
        sortYears(a, mid + 1, high);
        
        mergeYears(a, low, mid, high);
    }
    
    public static void mergeYears(Movie4[] a, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high)
        {
            if(i > mid)
            {
                temp[n] = a[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = a[i];
                i++;
            }
            else if(a[i].getYear() < a[j].getYear())
            {
                temp[n] = a[i];
                i++;
            }
            else
            {
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k ++)
        {
            a[k] = temp[k - low];
        }
    }
    
    public static void main(String[] args)
    {
        Movie4[] myMovies = new Movie4[10];
        myMovies[0] = new Movie4("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie4("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie4("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie4("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie4("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie4("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie4("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie4("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie4("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie4("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Original Order:");
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted By Title (Ascending)");
        sortTitles(myMovies, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted By Year (Ascending)");
        sortYears(myMovies, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted By Studio (Ascending)");
        sortStudios(myMovies, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
    }
}