/* Purpose: To demonstrate how to override methods
 * Author: Eric Osgood
 * Date: March 24th, 2016
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle - " + length + " X " + width;
	}
}
