/* Purpose: To demonstrate how to utilize binary search
 * Author: Eric Osgood
 * Date: May 22nd, 2016 
 */
public class MusicTester2
{
    public static void printMusic(Music2[] a)
    {
        System.out.println("My Music:");
        for(Music2 b : a)
        {
            System.out.println(b);
        }
    }
    
    public static Music2[] insertionSort(Music2[] a, int sort)
    {
        Music2[] temp = new Music2[a.length];
        if(sort == 1)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Music2 next = a[i];
                int insertindex = 0;
                int k = i;
                while(k > 0 && insertindex == 0)
                {
                    if(next.getTitle().compareTo(temp[k - 1].getTitle()) > 0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        temp[k] = temp[k - 1];
                    }
                    k --;
                }
                temp[insertindex] = next;
            }
        }
        else if(sort == 2)
        {
            for(int i = 0; i < a.length; i ++)
            {
                Music2 next = a[i];
                int insertindex = 0;
                int k = i;
                while(k > 0 && insertindex == 0)
                {
                    if(next.getYear() > temp[k - 1].getYear())
                    {
                        insertindex = k;
                    }
                    else
                    {
                        temp[k] = temp[k - 1];
                    }
                    k --;
                }
                temp[insertindex] = next;
            }
        }
        else
        {
            for(int i = 0; i < a.length; i ++)
            {
                Music2 next = a[i];
                int insertindex = 0;
                int k = i;
                while(k > 0 && insertindex == 0)
                {
                    if(next.getSinger().compareTo(temp[k - 1].getSinger()) > 0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        temp[k] = temp[k - 1];
                    }
                    k --;
                }
                temp[insertindex] = next;
            }
        }
        return temp;
    }
    
    public static void searchTitle(Music2[] a, String toFind)
    {
        int high = a.length;
        int low = -1;
        int probe = 0;
        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(a[probe].getTitle().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(a[probe].getTitle().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        if(low >= 0 && (a[low].getTitle().compareTo(toFind) == 0))
        {
            System.out.println("Song Found:");
            System.out.println(a[probe]);
        }
        else
        {
            System.out.println("There were no songs with the title " + toFind + " in the library.");
        }
    }
    
    public static void searchYear(Music2[] a, int toFind)
    {
        int high = a.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(a[probe].getYear() > toFind)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(a[probe].getYear() == toFind)
                {
                    break;
                }
            }
        }
        if(low >= 0 && (a[low].getYear() == toFind))
        {
            System.out.println("Songs Found with desired year:");
            linearPrint(a, a[low], low, 1);
        }
        else
        {
            System.out.println("There were no songs made in " + toFind + " in the library.");
        }
    }
    
    public static void searchSinger(Music2[] a, String toFind)
    {
        int high = a.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(a[probe].getSinger().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(a[probe].getSinger().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        if(low >= 0 && (a[low].getSinger().compareTo(toFind) == 0))
        {
            System.out.println("Songs Found with desired year:");
            linearPrint(a, a[low], low, 2);
        }
        else
        {
            System.out.println("There were no songs by the singer " + toFind + " in the library.");
        }
    }
    
    public static void linearPrint(Music2[] a, Music2 b, int l, int param)
    {
        int count = 1;
        if(param == 1)
        {
            while(l > 0 && (a[l - 1].getYear() == b.getYear()))
            {
                l --;
            }
            
            System.out.println(a[l]);
            while(l < a.length && (a[l + 1].getYear() == b.getYear()))
            {
                l ++;
                System.out.println(a[l]);
                count ++;
            }
            
            System.out.println(count + " song(s) were found to be made in " + b.getYear() + ".");
        }
        else
        {
            while(l > 0 && (a[l - 1].getSinger().compareTo(b.getSinger()) == 0))
            {
                l --;
            }
            
            System.out.println(a[l]);
            while(l < a.length && (a[l + 1].getSinger().compareTo(b.getSinger()) == 0))
            {
                l ++;
                System.out.println(a[l]);
                count ++;
            }
            
            System.out.println(count + " song(s) were found to be written by " + b.getSinger() + ".");
        }
    }
    
    public static void main(String[] args)
    {
        Music2[] myMusic = new Music2[10];
        
        myMusic[0] = new Music2("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music2("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music2("What If It's You", 1995, "Reba McEntire");
        myMusic[3] = new Music2("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music2("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music2("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music2("Under My Skin", 2004, "Avril Lavigne");
        myMusic[7] = new Music2("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music2("Let it Go", 2007, "Tim McGraw");
        myMusic[9] = new Music2("White Flag", 2004, "Dido");
        
        printMusic(myMusic);
        System.out.println();
        
        myMusic = insertionSort(myMusic, 1);

        searchTitle(myMusic, "Let Go");
        System.out.println();
        
        searchTitle(myMusic, "Uptown Funk");
        System.out.println();
        
        myMusic = insertionSort(myMusic, 2);
        
        searchYear(myMusic, 2001);
        System.out.println();
        
        searchYear(myMusic, 2003);
        System.out.println();
        
        myMusic = insertionSort(myMusic, 3);
        
        searchSinger(myMusic, "Avril Lavigne");
        System.out.println();
        
        searchSinger(myMusic, "Jesus Christ");
    }
}