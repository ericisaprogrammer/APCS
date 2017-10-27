/* Purpose: Deomonstrate how class hierarchies work
 * Author: Eric Osgood
 * Date: March 22nd, 2016
 */
public class Mountain extends Terrain
{
    private int myMountains;
    Mountain(int l, int w, int mountains)
    {
        super(l, w);
        myMountains = mountains;
    }
    
    public String mountainInfo()
    {
        return "Mountain " + terrainSize() + " and has " + myMountains + " mountains";
    }
}