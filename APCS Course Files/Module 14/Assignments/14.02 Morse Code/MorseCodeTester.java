/* Purpose: To demonstrate the usage of private methods in seperate classes
 * Author: Eric Osgood
 * Date: March 28th, 2016
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        String text = "";
        String[] code;
        String[] letters = { "A", "B", "C", "D", "E", "F",
                             "G", "H", "I", "J", "K", "L",
                             "M", "N", "O", "P", "Q", "R",
                             "S", "T", "U", "V", "W", "X",
                             "Y", "Z", "1", "2", "3", "4",
                             "5", "6", "7", "8", "9", "0" };
        String[] morse = new String[letters.length];
        ArrayList<String> message = new ArrayList<String>();
        Scanner inFile = new Scanner(new File("text.txt"));
        Scanner in = new Scanner(System.in);
        
        
        int i = 0;
        while(inFile.hasNext())
        {
            morse[i] = inFile.next();
            i ++;
        }
        inFile.close();
        
        System.out.print("Input your message: ");
        text += in.next() + in.nextLine();
        
        message = MorseCode.createArray(text);
        code = MorseCode.convertText(message, letters, morse);
        System.out.println();
        System.out.println("Here is your coded message: ");
        for(String codes : code)
        {
            System.out.println(codes);
        }
    }
}