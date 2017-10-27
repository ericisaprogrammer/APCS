/* Purpose: To demonstrate the basic principals for inheritance
 * Author: Eric Osgood
 * Date: March 21st, 2016
 */
public class Box
{
    private int length, width, height;
    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }
    
    
    public int calcVolume()
    {
        return length * width * height;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
}