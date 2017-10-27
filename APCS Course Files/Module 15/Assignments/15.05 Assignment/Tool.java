/* Purpose: To be a review for everything learned in module 15
 * Author: Eric Osgood
 * Date: April 25th, 2016
 */
public class Tool implements Product, Comparable<Tool>
{
    private String name;
    private double cost;
    
    Tool(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int compareTo(Tool a)
    {
        if(getCost() - a.getCost() < 0)
        {
            return -1;
        }
        if(getCost() - a.getCost() == 0)
        {
            return 0;
        }
        return 1;
    }
    
    public void test()
    {
        System.out.println("TEST");
    }
}