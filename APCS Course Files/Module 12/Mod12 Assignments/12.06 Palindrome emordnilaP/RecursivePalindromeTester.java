/* Purpose: To test the RecursivePalindrome class. Allows for user input of phrases to see if a phrase is a palindrome.
 * This program enforces a greater understanding of how to use recursive programming.
 * Author: Eric Osgood
 * Date: March 17th, 2016
 */
import java.util.Scanner;
public class RecursivePalindromeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your phrase (Type Q to quit): ");
        String input = in.next() + in.nextLine();
        
        while(!input.equalsIgnoreCase("Q"))
        {
            RecursivePalindrome palindrome = new RecursivePalindrome(input);
            if(palindrome.phraseModifier().equals(""))
            {
                System.out.println("Please input some letters, and not just numbers/special characters.");
            }
            else if(palindrome.palindrome(palindrome.phraseModifier()))
            {
                System.out.println("This phrase is a palindrome.");
            }
            else
            {
                System.out.println("This phrase is not a palindrome.");
            }
            System.out.print("Enter your phrase (Type Q to quit): ");
            input = in.next() + in.nextLine();
        }
        
        System.out.println("Goodbye.");
    }
}