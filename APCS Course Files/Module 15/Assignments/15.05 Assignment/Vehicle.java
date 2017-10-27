/* Purpose: To be a review for everything learned in module 15
 * Author: Eric Osgood
 * Date: April 25th, 2016
 */
public abstract class Vehicle implements Product
{
    private String name;
    private double cost;
    
    Vehicle(String name, double cost)
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
}