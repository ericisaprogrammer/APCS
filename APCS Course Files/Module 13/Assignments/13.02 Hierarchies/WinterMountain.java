/* Purpose: Deomonstrate how class hierarchies work
 * Author: Eric Osgood
 * Date: March 22nd, 2016
 */
public class WinterMountain extends Mountain
{
    private double myTemp;
    WinterMountain(int l, int w, int mountains, int temp)
    {
        super(l, w, mountains);
        myTemp = temp;
    }
    
    public String winterMountainInfo()
    {
        return "Winter " + mountainInfo() + " and has temperature " + myTemp;
    }
}