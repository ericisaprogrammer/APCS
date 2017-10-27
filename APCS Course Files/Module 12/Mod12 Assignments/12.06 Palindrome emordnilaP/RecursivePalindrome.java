/* Purpose: Constructs RecursivePalindrome classes that can determine whether or not a phrase is a palindrome
 * Author: Eric Osgood
 * Date: March 17th, 2016
 */
public class RecursivePalindrome
{
    private String myPhrase;
    RecursivePalindrome()
    {
    }
    
    RecursivePalindrome(String phrase)
    {
        myPhrase = phrase;
    }
    
    public String phraseModifier()
    {
        String newPhrase = "";
        for(int i = 0; i < myPhrase.length(); i ++)
        {
             int asciiValue = (int)myPhrase.charAt(i);
             if((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122))
             {
                 newPhrase += myPhrase.substring(i, i + 1);
             }
        }
        newPhrase.toUpperCase();
        return newPhrase;
    }
    
    public boolean palindrome(String phrase)
    {
        if(phrase.length() <= 1)
        {
            return true;
        }
        else if(phrase.length() == 2)
        {
            if(phrase.substring(0, 1).equals(phrase.substring(1, 2)))
            {
                return true;                
            }
            else
            {
                return false;
            }
        }
        else if(phrase.substring(0, 1).equals(phrase.substring(phrase.length() - 1, phrase.length())))
        {
            phrase = phrase.substring(1);
            phrase = phrase.substring(0, phrase.length() - 1);
            return palindrome(phrase);
        }
        else
        {
            return false;
        }
    }
}
