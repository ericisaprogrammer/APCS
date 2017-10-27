/*This project takes String variables and prints them to make artwork
 * using keyboard characters, or ASCII symbols. This piece looks like
 * Zoidberg from 'Futurama!'
 * 
 * AUTHOR: Eric Osgood
 * VERSION: 09/8/2015
 */
public class ArtWork
{
    public static void main(String[] args)
    {
        //String variables for ASCII Art
        String row1 =  "  .-------------------.";
        String row2 =  " /                     \\";
        String row3 =  "|      .-----.       .-----.";
        String row4 =  "|     /       \\     /       \\";
        String row5 =  " \\   |    []  |     |    []  |";
        String row6 =  "  |   \\______/       \\______/";
        String row7 =  "   \\                         \\";
        String row8 =  "    |                         \\";
        String row9 =  "     \\                         |";
        String row10 = "      |      /--.\\  \\   \\  \\   |";
        String row11 = "       \\     :___|   |   |  |  |";
        String row12 = "        |        |   |   |  |  |";
        String row13 = "         \\        \\_/ \\_/ \\_/\\_/";
        String row14 = "        .-\"-.________________.-\".";
        String row15 = "       /                         \\";
        String row16 = "   _.-\"                           \"-._";
        String row17 = " .\"                                   \"";
        
        //Code to print the ASCII Art without System.out.println();
        System.out.print(row1 + "\n" + row2 + "\n" + row3 + "\n");
        System.out.print(row4 + "\n" + row5 + "\n" + row6 + "\n");
        System.out.print(row7 + "\n" + row8 + "\n" + row9 + "\n");
        System.out.print(row10 + "\n" + row11 + "\n" + row12 + "\n" + row13 + "\n");
        System.out.print(row14 + "\n" + row15 + "\n" + row16 + "\n" + row17);
    }
}