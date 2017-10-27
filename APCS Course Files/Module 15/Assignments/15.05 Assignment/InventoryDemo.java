/* Purpose: To be a review for everything learned in module 15
 * Author: Eric Osgood
 * Date: April 25th, 2016
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class InventoryDemo
{
    public static void takeInventory(String name, List<Product> inventory)
    {
        int quantity = 0;
        double totalCost = 0;
        for(Product a : inventory)
        {
            if(a.getName().equals(name))
            {
                quantity ++;
                totalCost += a.getCost();
            }
        }
        if(quantity == 0)
        {
            System.out.println("There are no products under the name '" + name + ".'");
        }
        else
        {
            System.out.printf("%-15s   Quantity = %1d;   Total Cost = $%1.2f%n", name, quantity, totalCost);
        }
    }
    
    public static void main(String[] args)
    {
        List<Product> inventory = new ArrayList<Product>();
        Random rand = new Random();
        
        inventory.add(new Car("Jaguar", rand.nextDouble() * 1000000));
        inventory.add(new Car("Neon", rand.nextDouble() * 10000));
        inventory.add(new Tool("Jigsaw", rand.nextDouble() * 100));
        inventory.add(new Car("Jaguar", rand.nextDouble() * 1000000));
        inventory.add(new Car("Neon", rand.nextDouble() * 10000));
        inventory.add(new Car("Neon", rand.nextDouble() * 10000));
        inventory.add(new Truck("RAM", rand.nextDouble() * 10000));
        inventory.add(new Tool("Circular Saw", rand.nextDouble() * 100));
        inventory.add(new Tool("Circular Saw", rand.nextDouble() * 100));
        
        System.out.println("Current Inventory");
        System.out.println("=================================================================");
        for(Product a : inventory)
        {
            System.out.printf("%-15s       $%1.2f%n", a.getName(), a.getCost());
        }
        System.out.println("=================================================================");
        System.out.println();
        takeInventory("Jaguar", inventory);
        takeInventory("Neon", inventory);
        takeInventory("Jigsaw", inventory);
        takeInventory("RAM", inventory);
        takeInventory("Circular Saw", inventory);
        
        Tool saw1 = new Tool("Circular Saw", inventory.get(7).getCost());
        Tool saw2 = new Tool("Circular Saw", inventory.get(8).getCost());
        
        if(saw1.compareTo(saw2) > 0)
        {
            System.out.println("The first saw is more expensive.");
        }
        else
        {
            System.out.println("The second saw is more expensive.");
        }
    }
}