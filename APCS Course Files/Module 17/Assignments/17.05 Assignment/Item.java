/* Purpose: To act as a review for the module
 * Version: May 14th, 2016
 * Author: Eric Osgood
 */
public class Item
{
    private String itemName;
    private int inStore, itemID;
    private double price;
    
    Item(int itemID, String itemName, int inStore, double price)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    }
    
    public int getID()
    {
        return itemID;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    
    public int getInStore()
    {
        return inStore;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return itemID + " - " + itemName + ": " + inStore + " in stock @ $" + price;
    }
}