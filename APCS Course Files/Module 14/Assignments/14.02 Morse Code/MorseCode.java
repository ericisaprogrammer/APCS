/* Purpose: To demonstrate the usage of private methods in seperate classes
 * Author: Eric Osgood
 * Date: March 28th, 2016
 */
import java.util.ArrayList;
public class MorseCode
{
    public static String[] convertText(ArrayList<String> text, String[] letters, String[] morse)
    {
        String[] message = new String[text.size()];
        for(int i = 0; i < text.size(); i ++)
        {
            for(int j = 0; j < letters.length; j ++)
            {
                if(((int)(text.get(i).charAt(0))) < 64 || ((int)(text.get(i).charAt(0))) > 90)
                {
                    message[i] = "";
                    j += letters.length;
                }
                else if(text.get(i).equalsIgnoreCase(letters[j]))
                {
                    message[i] = morse[j];
                    j += letters.length;
                }
            }
        }
        return message;
    }
    
    public static ArrayList<String> createArray(String text)
    {
        ArrayList<String> brokenText = new ArrayList<String>();
        text = text.trim();
        text = text.toUpperCase();
        while(!text.equals(""))
        {
            brokenText.add(text.substring(0, 1));
            text = text.substring(1);
        }
        return brokenText;
    }
}