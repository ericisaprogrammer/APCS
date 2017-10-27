/* Author: Eric Osgood
 * Version: 1.0.0 (November 24th, 2015)
 * Purpose: To provide a challenge / practice mah skeelz for Java programming
 */
import java.util.Scanner;
import java.util.Random;
public class Password
{
    public static void main(String[] args)
    {
        //Variable and Object Declarations
        int random = 0;
        int passwordLength = 0;
        boolean specialCharacters = false;
        boolean numbers = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean quit = false;
        String password = "";
        String menuSelection = "";
                
        Scanner in = new Scanner(System.in);
        Random randomNumber = new Random();
        
        
        //Input Gathering
        System.out.println("Choose what characters you want your password to have");
        System.out.println("If you would like more than one option, type both selections");
        System.out.println("For example, if you want both lower and uppercase letters, type AB or BA.");
        System.out.println("Or if you want all the possible characters, type something like ABCD!");
        System.out.println();
        System.out.println("===========Menu=Selection==========");
        System.out.println("\t[A] Lowercase Letters");
        System.out.println("\t[B] Uppercase Letters");
        System.out.println("\t[C] Numbers");
        System.out.println("\t[D] Special Characters");
        System.out.println("\t[E] Quit");
        System.out.println("===================================");
        System.out.print("Make your choice: ");
        
        menuSelection = in.next();
        
        System.out.print("Enter the length the password will be: ");
        passwordLength = in.nextInt();
            //Incase there's any funny business...
        if(passwordLength <= 0)
        {
            passwordLength = 1;
            System.out.println("Password Length was too short, so the length is now 1.");
        }
        
        //Loops and Data Manipulations
            //Determines what selections were made
        for(int counter = 1; counter <= menuSelection.length(); counter ++)
        {
            if(menuSelection.substring(counter - 1, counter).equalsIgnoreCase("A"))
            {
                lowerCase = true;
            }
            if(menuSelection.substring(counter - 1, counter).equalsIgnoreCase("B"))
            {
                upperCase = true;
            }
            if(menuSelection.substring(counter - 1, counter).equalsIgnoreCase("C"))
            {
                numbers = true;
            }
            if(menuSelection.substring(counter - 1, counter).equalsIgnoreCase("D"))
            {
                specialCharacters = true;
            }
            if(menuSelection.substring(counter - 1, counter).equalsIgnoreCase("E"))
            {
                quit = true;
            }
        }
        
            //Loop
        while(!quit)
        {
                //Produces the password
                for(password = password; password.length() < passwordLength;)
                {
                random = randomNumber.nextInt(95) + 33;
                if(lowerCase && (random >=97 && random <=122))
                {
                    password += (char)random;
                }
                else if(upperCase && (random >= 65 && random <= 90))
                {
                    password += (char)random;
                }
                else if(numbers && (random >= 48 && random <= 57))
                {
                    password += (char)random;
                }
                else if(specialCharacters && ((random >= 33 && random <= 47) || (random >= 58 && random <= 64) || (random >= 123 && random <= 126)))
                {
                    password += (char)random;
                }
            }
        
        
            //Output
            System.out.println("\n");
            System.out.println("Generated Password: " + password);
            System.out.println("Password Length: " + password.length());
            if(password.length() <= 7)
            {
                System.out.println("It's not a very secure password...");
            }
            else if(password.length() <= 16)
            {
                System.out.println("An average password - Not super secure, but secure enough.");
            }
            else if(password.length() <= 24)
            {
                System.out.println("Pretty secure password, huh?");
            }
            else if(password.length() <= 32)
            {
                System.out.println("That is some quality security!");
            }
            else if(password.length() >= 33)
            {
                System.out.println("Wow! There is NO WAY your password can be cracked!");
            }
            quit = true;
        }
        System.out.println();
        System.out.println();
        System.out.println("Goodbye!");
    }
}