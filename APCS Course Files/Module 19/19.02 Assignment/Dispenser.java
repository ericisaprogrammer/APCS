/* Purpose: To demonstrate proper useage of Assertions and Exceptions
 * Author: Eric Osgood
 * Date: June 6th, 2016
 */
public class Dispenser
{
    private int numberOfItems, cost;
    
    Dispenser()
    {
        numberOfItems = 50;
        cost = 50;
    }
    
    //Precondition: numberOfItems >= 0 and cost >= 0
    Dispenser(int numberOfItems, int cost)
    {
        if(numberOfItems <= 0)
        {
            throw new RuntimeException("Cannot have negative/no amount of items.");
        }
        if(cost <= 0)
        {
            throw new RuntimeException("Cannot have negative/no cost.");
        }
        
        this.numberOfItems = numberOfItems;
        this.cost = cost;
    }
    
    public int getCount()
    {
        return numberOfItems;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    //Precondition: numberOfItems > 0
    public void makeSale()
    {
        if(numberOfItems <= 0)
        {
            throw new RuntimeException("Cannot make sale: Number of items <= 0.");
        }
        numberOfItems --;
    }
}
