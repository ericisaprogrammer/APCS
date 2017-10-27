/* Purpose: To demonstrate how to override methods
 * Author: Eric Osgood
 * Date: March 24th, 2016
 */
public class Box3 extends Rectangle3
{
    // instance variables 
    private int height;

    /**
     * Constructor for objects of class box
     */
    public Box3(int l, int w, int h)
    {
        // call superclass
        super(l, w);
        // initialise instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + height;
    }
    
    public boolean equals(Box3 box)
    {
        if(!(box instanceof Box3))
        {
            return false;
        }
        if(box.getWidth() == getWidth() && box.getLength() == getLength() && box.getHeight() == getHeight())
        {
            return true;
        }
        return false;
    }
    
    public boolean equalsVolume(Box3 box)
    {
        if((getWidth() * getHeight() * getLength()) == (box.getWidth() * box.getHeight() * box.getLength()))
        {
            return true;
        }
        return false;
    }
}
