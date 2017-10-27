/* Purpose: Deomonstrate how class hierarchies work
 * Author: Eric Osgood
 * Date: March 22nd, 2016
 */
public class TerrainTester
{
    public static void main(String[] args)
    {
        Forest forest = new Forest(100, 200, 57);
        Mountain mountain = new Mountain(300, 400, 17);
        WinterMountain winterMountain = new WinterMountain(400, 450, 32, 5);
        
        System.out.println(forest.forestInfo() + ".");
        System.out.println(mountain.mountainInfo() + ".");
        System.out.println(winterMountain.winterMountainInfo() + ".");
    }
}