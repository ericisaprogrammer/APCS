/* Purpose: To demonstrate the proper usage of class variables and constants
 * Author: Eric Osgood
 * Date: April 2nd, 2016
 */
import java.util.Scanner;
public class CaesarShiftTester
{
    public static void main(String[] args)
    {
        String selection;
        String message;
        boolean encryption = false;
        boolean crypt = true;
        Scanner in = new Scanner(System.in);
                
        System.out.println("|---------------|");
        System.out.println("|  Encrypt [E]  |");
        System.out.println("|  Decrypt [D]  |");
        System.out.println("|  Quit    [Q]  |");
        System.out.println("|---------------|");
        System.out.println();
        System.out.print("Enter your selection: ");
        
        selection = in.next().substring(0, 1);
        if(selection.equalsIgnoreCase("E"))
        {
            encryption = true;
        }
        
        if(!selection.equalsIgnoreCase("E") && !selection.equalsIgnoreCase("D"))
        {
            crypt = false;
        }
        
        if(crypt)
        {
            System.out.print("Enter your message: ");
        
            message = in.next() + in.nextLine();
            
            if(encryption)
            {
                System.out.print("Enter the desired shift (0 - 25): ");
            }
            else
            {
                System.out.print("Enter the original shift (0 - 25): ");
            }
            final int shift = in.nextInt();
            System.out.print("New Alphabet: ");
            CaesarShift.createShiftAlphabet(shift, encryption);
            for(String character : CaesarShift.shiftAlphabet)
            {
                System.out.print(character + " ");
            }
            System.out.println();
            System.out.println("Original Message: " + message);
            System.out.println("New Message: " + CaesarShift.getEncryption(message, shift, encryption));
        }
        else
        {
        }
        System.out.println();
        System.out.println("Goodbye.");
    }
}