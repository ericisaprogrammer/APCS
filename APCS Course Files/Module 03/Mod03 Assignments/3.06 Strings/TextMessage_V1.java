/* Author: Eric Osgood
 * Version: 1.0 (09/16/2015)
 * 
 * Takes in an input message, then replaces some words to make it appear like
 * a text message. 
 */

public class TextMessage_V1
{
    public static void main(String[] args)
    {
    //Original message
    String originalMessage = "Hello! I am writing to ask about your position for office secretary. \nAre you still looking for applicants? Please respond to this as soon as possible. \nThank you!";
    
    //New message manipulation
    String newMessage = originalMessage.replace("Hello!", "sup.");
    newMessage = newMessage.replaceAll("be", "b");
    newMessage = newMessage.replaceAll("are", "r");
    newMessage = newMessage.replaceAll("Are", "r");
    newMessage = newMessage.replaceAll("see", "c");
    newMessage = newMessage.replaceAll("to", "2");
    newMessage = newMessage.replaceAll("for", "4");
    newMessage = newMessage.replace("Thank you!", "kthnxbai!");
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