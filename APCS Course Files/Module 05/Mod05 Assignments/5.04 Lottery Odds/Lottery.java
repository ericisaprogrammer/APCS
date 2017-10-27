/* Author: Eric Osgood
 * What it does: Computerized lottery that takes an input as lottery numbers.
 * If the first or last pair of numbers match, it's a winner
 * Version: 1.0.0 (November 20th, 2015)
 */
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //Variable Declarations
        String guess = "";
        String input = "";
        String winner = "";
        boolean again = true;
        int random = 0;
        
        Scanner in = new Scanner(System.in);
        
        while(again)
        {
            //Input Gathering
            winner = "";
            System.out.print("Please enter your three numbers (e.g. 123): ");
            guess = in.next();
        
            for(int counter = 1; counter <= 3; counter ++)
            {
                random = (int)(Math.random() * 10);
                winner = winner + random;
            }
        
            //Output
            System.out.println("\tWinner: " + winner);
            if(winner.equals(guess))
            {
                System.out.println("\tCongratulations! You guessed the right numbers!");
            }
            else if((winner.substring(0, 2)).equals(guess.substring(0, 2)))
            {
                System.out.println("\tGood job! You guessed the first pair of numbers!");
            }
            else if((winner.substring(1, 3)).equals(guess.substring(0, 3)))
            {
                System.out.println("\tGood job! You guessed the second pair of numbers!");
            }
            else
            {
                System.out.println("\tSorry, no matches this time... You only had a\n\tone in fifty chance anyways...");
            }
            System.out.println("\nWould you like to play again (Y/N)?");
            input = in.next();
            again = input.substring(0, 1).equalsIgnoreCase("Y");
        }
        System.out.println("Goodbye!");
    }
}