
/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 * 
 * FLVS 2007
 * @author B. Jordan 
 * @version 03/08/07
 */
public class StringPractice
{
	public static void main(String[ ] args)
	{
	    //determine the length of the String object called odString
	    String oldString = "Four score and seven years ago";
	    System.out.println("Old string: " + oldString);
	    int stringLength = oldString.length();
	    System.out.println("Number of characters: " + stringLength);
	    System.out.println();
	   	
	    //replace characters within the String object
	    String replaceCharacters = oldString.replace("Four", "4");
	    replaceCharacters = replaceCharacters.replace("seven", "7");
	    System.out.println("Replacement characters: " + replaceCharacters);
	    System.out.println();
	    
	    //split the String object and reassemble in reverse
	    int halfwayPoint = stringLength /2;
	    String firstHalf = oldString.substring(0, halfwayPoint);
	    String secondHalf = oldString.substring(halfwayPoint, stringLength);
	    String splitString = secondHalf + "-" + firstHalf;
	    System.out.println("Split string: " + splitString);
	    System.out.println();
	    
	    //remove all the vowels from the string object.
	    String newString1 = oldString.replaceAll("[aeiou]", "");
	    System.out.println("New string: " + newString1);
	    System.out.println();
	    
	    //move first word to the end of the string object
	    int positionOfSpace = oldString.indexOf(' ');
	    String substring1 = oldString.substring(0, positionOfSpace);
	    String substring2 = oldString.substring(positionOfSpace, stringLength);	    
	    String newString2 = substring2 + " " + substring1;
	    System.out.println("New substring: " + newString2);
	    System.out.println();
	    
	    //Replacement practice calculations
	    String input = "407-317-3326";
	    int positionOfHyphen = input.indexOf('-');
	    substring1 = input.substring(0, positionOfHyphen);
	    substring1.replace("-", "");
	    substring1 = "(" + substring1 + ")";
	    String output = substring1 + input.substring(positionOfHyphen);
	    //Output
	    System.out.println("Original: " + input);
	    System.out.println("New: " + output);
	    System.out.println();
	    
	    //Insertion practice calculations
	    input = "4073173326";
	    substring1 = input.substring(0, 3);
	    substring2 = input.substring(3, 6);
	    String substring3 = input.substring(6);
	    output = substring1 + "." + substring2 + "." + substring3;
	    //Output
	    System.out.println("Original: " + input);
	    System.out.println("New: " + output);
	    System.out.println();
	    
	    //Replacement practice calculations
	    input = "03/07/2007";
	    output = input.replaceAll("/", "-");
	    substring1 = output.substring(0, 6);
	    substring2 = input.substring(8);
	    output = substring1 + substring2;
	    //Output
	    System.out.println("Original: " + input);
	    System.out.println("New: " + output);
	    System.out.println();
	    
	    //Replacement practice calculations
	    input = "Tallahassee, Florida";
	    output = input.replaceAll("a", "A");
	    //Output
	    System.out.println("Original: " + input);
	    System.out.println("New: " + output);
	    System.out.println();
	    
	    //Switching practice
	    input = "Anna Wright";
	    positionOfSpace = input.indexOf(" ");
	    substring1 = input.substring(0, positionOfSpace);
	    substring2 = input.substring(positionOfSpace + 1);
	    output = substring2 + ", " + substring1;
	    //Output
	    System.out.println("Original: " + input);
	    System.out.println("New: " + output);
	   }//end of main method
}//end of class
