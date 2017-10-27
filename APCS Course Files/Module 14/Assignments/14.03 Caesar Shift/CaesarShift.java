/* Purpose: To demonstrate the proper usage of class variables and constants
 * Author: Eric Osgood
 * Date: April 2nd, 2016
 */
public class CaesarShift
{
    public static final String[] ALPHABET = { "A", "B", "C", "D", "E", "F",
                                              "G", "H", "I", "J", "K", 
                                              "L", "M", "N", "O", "P",
                                              "Q", "R", "S", "T", "U",
                                              "V", "W", "X", "Y", "Z" };
    public static String[] shiftAlphabet = { "A", "B", "C", "D", "E", "F",
                                             "G", "H", "I", "J", "K", 
                                             "L", "M", "N", "O", "P",
                                             "Q", "R", "S", "T", "U",
                                             "V", "W", "X", "Y", "Z" };
    public static void createShiftAlphabet(int shift, boolean encryption)
    {
        if(encryption)
        {
            for(int i = 0; i < shiftAlphabet.length; i ++)
            {
                if(i + shift > 25)
                {
                    shiftAlphabet[i] = ALPHABET[i + shift - ALPHABET.length];
                }
                else
                {
                    shiftAlphabet[i] = ALPHABET[i + shift];
                }
            }
        }
        else
        {
            for(int i = 0; i < shiftAlphabet.length; i ++)
            {
                if(i - shift < 0)
                {
                    shiftAlphabet[i] = ALPHABET[i - shift + ALPHABET.length];
                }
                else
                {
                    shiftAlphabet[i] = ALPHABET[i - shift];
                }
            }
        }
    }
    
    public static String encrypt(String message)
    {
        for(int i = 0; i < message.length() - 1; i ++)
        {
            for(int j = 0; j < ALPHABET.length; j ++)
            {
                if(message.substring(i, i + 1).equals(" "))
                {
                    j += ALPHABET.length;
                }
                else if(message.substring(i, i + 1).equalsIgnoreCase(ALPHABET[j]))
                {
                    if(i == 0)
                    {
                        message = shiftAlphabet[j] + message.substring(i + 1);
                    }
                    else if(i == message.length() - 1)
                    {
                        message = message.substring(0, i) + shiftAlphabet[j];
                    }
                    else
                    {
                        message = message.substring(0, i) + shiftAlphabet[j] + message.substring(i + 1);
                    }
                    j += ALPHABET.length;
                }
            }
        }
        return message;
    }
    
    public static String getEncryption(String message, int shift, boolean encryption)
    {
        createShiftAlphabet(shift, encryption);
        return encrypt(message);
    }
}