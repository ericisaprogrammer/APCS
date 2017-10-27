/* Purpose: To demonstrate understanding of recursive piece-wise functions
 * Author: Eric Osgood
 * Date: March 20th, 2016
 */
public class PieceWise
{
    public static int function(int x)
    {
        if(x >= 1000 || x <= 0)
        {
            return 1;
        }
        else
        {
            return 2 * function(x * 2);
        }
    }
    
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i ++)
        {
            System.out.println(function(i));
        }
    }
}