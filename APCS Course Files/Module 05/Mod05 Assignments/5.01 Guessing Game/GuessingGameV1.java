/* Author: Eric Osgood
 * Version: 1.0.0 (Nov. 18th, 2015)
 * How it works: Program takes in an inputed range of numbers (e.g. 10, 20)
 * and picks a random integer in that range. Then cycles multiple inputs until
 * the input matches the chosen number.
 * Purpose: Deomonstrate an understanding of looping input
 */

import java.util.Scanner;
public class GuessingGameV1
{
    public static void main(String[] args)
    {
        //Variable Declarations
        int randomNumber = 0;
        double random = 0.0;
        int guess = 0;
        int numberGuesses = 0;
        int startRange = 0;
        int endRange = 0;
        String input = "";
        boolean again = true;
        
        Scanner in = new Scanner(System.in);
        
        while(again)
        {
            //Input Gathering
            System.out.print("Enter the range of numbers you wish to/nchoose from (e.g. 1 100): ");
            startRange = in.nextInt();
            endRange = in.nextInt();
        
            random = (Math.random() * (endRange - startRange)) + startRange;
            randomNumber = (int)random;
        
            System.out.println();
            System.out.println();
        
        
            //Loop code
            while(!(guess == randomNumber))
            {
                System.out.print("Enter your guess: ");
                guess = in.nextInt();
                if(guess > randomNumber)
                {
                    System.out.println("Too high");
                }
                else if(guess < randomNumber)
                {
                    System.out.println("Too low");
                }
                numberGuesses ++;
            }
            System.out.println("Congratulations!");
            System.out.println("The random integer was " + randomNumber + ".");
            System.out.println("It took you " + numberGuesses + " guesses.");
        
            if(numberGuesses < 5)
            {
                System.out.println("Wow!");
            }
            else if(numberGuesses < 10)
            {
                System.out.println("Nice job!");
            }
            else if(numberGuesses < 20)
            {
                System.out.println("Want to try again?");
            }
            else
            {
                System.out.println("Better luck next time!");
            }
        
            System.out.println("Would you like to play again (Y/N)?");
            input = in.next();
            again = (input.substring(0, 1)).equalsIgnoreCase("Y");
        }
        System.out.print("Goodbye! Thanks for playing!");
    }
}