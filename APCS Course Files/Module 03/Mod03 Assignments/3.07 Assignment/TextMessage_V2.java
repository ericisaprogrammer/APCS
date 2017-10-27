/* Author: Eric Osgood
 * Version: 2.0 (09/21/2015)
 * 
 * Takes in an input message, then replaces some words to make it appear like
 * a text message. 
 */
import java.util.Scanner;
public class TextMessage_V2
{
    public static void main(String[] args)
    {
    Scanner inMessage = new Scanner(System.in);
    //Original message
    System.out.print("Please enter your message: ");
    String originalMessage = inMessage.next() + inMessage.nextLine();
    
    //New message manipulation
    String newMessage = originalMessage.replace("Hello", "sup");
    newMessage = newMessage.replaceAll("be", "b");
    newMessage = newMessage.replaceAll("are", "r");
    newMessage = newMessage.replaceAll("Are", "r");
    newMessage = newMessage.replaceAll("see", "c");
    newMessage = newMessage.replaceAll("to", "2");
    newMessage = newMessage.replaceAll("for", "4");
    newMessage = newMessage.replace("Thank you", "kthnxbai");
    newMessage = newMessage.replaceAll("you", "u");
    newMessage = newMessage.replace("Please", "plz");
    newMessage = newMessage.replace("as soon as possible", "ASAP");
    newMessage = newMessage.replace("I am", "im");
    
    //Output/Calculations
    System.out.println("ORIGINAL MESSAGE\n" + originalMessage);
    System.out.println("Message Length: " + originalMessage.length() + " characters\n");
    System.out.println("NEW MESSAGE\n" + newMessage);
    System.out.println("New Message Length: " + newMessage.length() + " characters\n");

    }
}