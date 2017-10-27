/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  
 * @version 
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        // provide menu item for BMR
        System.out.println("[B] BMR");
        // provide menu item for Healthy Eating
        System.out.println("[C] Healthy Eating");
        // provide menu item for Food Pyramid
        System.out.println("[D] Food Pyramid");
        // provide menu item for Fitness Training
        System.out.println("[E] Fitness Training");
        // prompt user to enter A, B, C, D, or E: ");
        System.out.println("[Q] Quit");
        // accept user choice with a Scanner class method
        System.out.println();
        String userInput = in.next();
        if (userInput.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("You chose: A for BMI\n");
            System.out.println("BMI stands for Body Mass Index, and is a reference");
            System.out.println("to a massive catalog of people with the largest body masses.");
            System.out.println("Some notable members of the BMI include:");
            System.out.println("John Brower");
            System.out.println("Paul Bunyun");
            System.out.println("That giant from 'Jack and the Beanstock'");
            System.out.println("Fluffles, the strangely named competitive Hotdog Eating Champion of Nebraska");
            System.out.println("Me, a day after Thanksgiving");
        }
        else if (userInput.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
            System.out.println("You chose: B for BMR\n");
            System.out.println("BMR stands for Basic Monday Ritual.");
            System.out.println("BMR is usually conducted on the first Monday of every week, and usually");
            System.out.println("consists of people going about their normal lives, but complaining");
            System.out.println("about it by saying things such as \"I hate mondays,\" or \"I got those monday blues.\"");
            System.out.println("Most of the time, they actually don't hate mondays, but they feel grogy and sad because");
            System.out.println("they thought pounding an entire keg of liquidized potatoes was a good ");
            System.out.println("idea the night before a work day.");
        }
        else if (userInput.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
            System.out.println("You chose: C for Healthy Eating\n");
            System.out.println("Healthy Eating is a custom of food consumption");
            System.out.println("where the consumer considers the overall benefit");
            System.out.println("of eating the food, rather than the taste.");
            System.out.println("It is a custom rarely practiced in America and");
            System.out.println("is highly frowned upon in most states.");
        }
        else if (userInput.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
            System.out.println("You chose: D for Food Pyramid\n");
            System.out.println("The Food Pyramid was originally built in 1809 at Berlin, Germany");
            System.out.println("to celebreate the 57th anual Food Day festival. It stood over");
            System.out.println("a soaring 10 feet high and included delicacies from around the");
            System.out.println("world. It lasted approximately 30 days before it rotted completely");
            System.out.println("and created a noxious cloud of rotting food that killed 3 dogs and a");
            System.out.println("stray cat.");
            System.out.println("There were no survivors.");
        }
        else if (userInput.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
            System.out.println("You chose: E for Fitness Training\n");
            System.out.println("Fitness Training can be achieved by doing some fitness.");
            System.out.println("You can train for it, I guess... Like, doing some curls or situps or something.");
            System.out.println("Whatever. Just do some exercise or something.");
        }
        else if (userInput.equalsIgnoreCase("Q"))
        {
            System.out.println("Goodbye!");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
            System.out.println("I'm sorry, but you did not enter a valid input.");
        }
    }
}
