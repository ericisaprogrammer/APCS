PROJECT TITLE: 14.03 Caesar Shift
PURPOSE OF PROJECT: To demonstrate the usage of constants and class variables
VERSION or DATE: April 2nd, 2016
AUTHOR: Eric Osgood

==================================PMR==========================================
[+] Understand how to use class constants and variables

[+] Making this program was quite the challenge. I appreciate that

[-] When I created the class constant String[] ALPHABET, I was extremely
confused when the constant kept changing in tandem with the class variable
String[] shiftAlphabet. Finding this error was key to the project working, and
it was extremely frustrating to discover.
===============================================================================
In the future, I would like to see assignments with the same level of challenge
in them. 
Here was the original code that caused the error: 
public static final String[] ALPHABET = { "A", "B", "C", "D", "E", "F",
                                          "G", "H", "I", "J", "K", 
                                          "L", "M", "N", "O", "P",
                                          "Q", "R", "S", "T", "U",
                                          "V", "W", "X", "Y", "Z" };
public static String[] shiftAlphabet = ALPHABET;

Whenever I manipulated the shiftAlphabet variable, the ALPHABET constant would
change. I'm guessing that isn't supposed to happen, but why did it?
If you want to find the same errors as me when I made the program, replace the
public static String[] shiftAlphabet = { "A", "B", "C", "D", "E", "F",
                                         "G", "H", "I", "J", "K", 
                                         "L", "M", "N", "O", "P",
                                         "Q", "R", "S", "T", "U",
                                         "V", "W", "X", "Y", "Z" };
in the program I submitted with the error declaration above.
