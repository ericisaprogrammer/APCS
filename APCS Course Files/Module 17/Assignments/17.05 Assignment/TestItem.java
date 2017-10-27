/* Purpose: To act as a review for the module
 * Version: May 14th, 2016
 * Author: Eric Osgood
 */
public class TestItem
{
    public static void printInventory(Item[] a)
    {
        for(Item b : a)
        {
            System.out.println(b);
        }
    }
    
    public static Item[] sortID(Item[] a)
    {
        Item[] dest = new Item[a.length];
        for(int i = 0; i < a.length; i ++)
        {
            Item temp = a[i];
            int insert = 0;
            int j = i;
            while(j > 0 && insert == 0)
            {
                if(temp.getID() >= dest[j - 1].getID())
                {
                    insert = j;
                }
                else
                {
                    dest[j] = dest[j - 1];
                }
                j --;
            }
            dest[insert] = temp;
        }
        a = dest;
        return a;
    }    
    
    public static Item[] sortName(Item[] a)
    {
        Item[] dest = new Item[a.length];
        for(int i = 0; i < a.length; i ++)
        {
            Item temp = a[i];
            int insert = 0;
            int j = i;
            while(j > 0 && insert == 0)
            {
                if(temp.getItemName().compareTo(dest[j - 1].getItemName()) >= 0)
                {
                    insert = j;
                }
                else
                {
                    dest[j] = dest[j - 1];
                }
                j --;
            }
            dest[insert] = temp;
        }
        a = dest;
        return a;
    }   
    
    public static Item[] sortInStore(Item[] a)
    {
        for(int i = a.length; i > 0; i --)
        {
            Item max = a[0];
            int pos = 0;
            for(int k = 0; k < i; k ++)
            {
                if(max.getInStore() < a[k].getInStore())
                {
                    max = a[k];
                    pos = k;
                }
            }
            Item hold = a[i - 1];
            a[i - 1] = max;
            a[pos] = hold;
        }
        return a;
    }
    
    public static void sortPrice(Item[] a, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low + high) / 2;
        
        sortPrice(a, low, mid);
        sortPrice(a, mid + 1, high);
        
        mergePrice(a, low, mid, high);
    }
    
    public static void mergePrice(Item[] a, int low, int mid, int high)
    {
        Item[] temp = new Item[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        while(i <= mid || j <= high)
        {
            if(i > mid)
            {
                temp[n] = a[j];
                j ++;
            }    
            else if(j > high)
            {
                temp[n] = a[i];
                i ++;
            }
            else if(a[i].getPrice() < a[j].getPrice())
            {
                temp[n] = a[i];
                i ++;
            }
            else
            {
                temp[n] = a[j];
                j ++;
            }
            n ++;
        }
        
        for(int k = low; k <= high; k ++)
        {
            a[k] = temp[k - low];
        }
    }
    
    public static void main(String[] args)
    {
        Item[] hardware = new Item[6];
        hardware[0] = new Item(1011, "Air Filters", 200, 10.5);
        hardware[1] = new Item(1034, "Door Knobs", 60, 21.5);
        hardware[2] = new Item(1101, "Hammers", 90, 9.99);
        hardware[3] = new Item(1600, "Levels", 80, 19.99);
        hardware[4] = new Item(1500, "Ceiling Fans", 100, 59);
        hardware[5] = new Item(1201, "Wrench Sets", 55, 80);
        
        System.out.println("Original Order:");
        printInventory(hardware);
        
        System.out.println();
        hardware = sortID(hardware);
        System.out.println("Sorted By ID (Insertion):");
        printInventory(hardware);
        
        System.out.println();
        hardware = sortName(hardware);
        System.out.println("Sorted By Name (Insertion):");
        printInventory(hardware);
        
        System.out.println();
        hardware = sortInStore(hardware);
        System.out.println("Sorted By Quantity (Selection):");
        printInventory(hardware);
        
        System.out.println();
        sortPrice(hardware, 0, hardware.length - 1);
        System.out.println("Sorted By Price (Merge):");
        printInventory(hardware);
    }
}