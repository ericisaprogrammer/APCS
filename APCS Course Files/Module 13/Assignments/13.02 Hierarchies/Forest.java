/* Purpose: Deomonstrate how class hierarchies work
 * Author: Eric Osgood
 * Date: March 22nd, 2016
 */
public class Forest extends Terrain
{
    private int myTrees;
    Forest(int l, int w, int trees)
    {
        super(l , w);
        myTrees = trees;
    }
    
    public String forestInfo()
    {
        return "Forest " + terrainSize() + " and has " + myTrees + " trees";
    }
}