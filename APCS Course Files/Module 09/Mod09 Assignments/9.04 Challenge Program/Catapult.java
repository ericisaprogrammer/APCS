/**
 * This class creates Catapult objects with four private instance variables.
 * It contains mutator methods that calculate launch distances for given speeds
 * and angles, and convert and reconvert between degrees, and radians and meters per second
 * and miles per hour. Private instance variables include myLaunchValues, myLaunchAngle,
 * myLaunchSpeed, and isRadians.
 * 
 * @author E. Osgood
 * @version 02/28/16
 */
public class Catapult
{
    private Double[][] myLaunchValues;
    private Double[] myLaunchAngle, myLaunchSpeed;
    private boolean isRadians = false;
    
    /**
     * Default constructor for the Catapult class
     */
    Catapult()
    {    
    }
    
    /**
     * Constructor for objects in the Catapult class
     * @param launchSpeed launch speeds
     * @param launchAngle launch angles
     */
    Catapult(Double[] launchSpeed, Double[] launchAngle)
    {
        myLaunchSpeed = launchSpeed;
        myLaunchAngle = launchAngle;
    }
    
    /**
     * Getter method to return launch speeds (no parameters)
     */
    public Double[] getLaunchSpeed()
    {
        return myLaunchSpeed;
    }
    
    /**
     * Getter method to return launch angles (no parameters)
     */
    public Double[] getLaunchAngle()
    {
        return myLaunchAngle;
    }
    
    /**
     * Getter method to return launch distances (no parameters)
     */
    public Double[][] getLaunchValues()
    {
        return myLaunchValues;
    }
    
    /**
     * Mutator method to convert mph and degrees to mps and radians (no parameters)
     */
    public void convert()
    {
        for(int i = 0; i < myLaunchSpeed.length; i++)
        {
            myLaunchSpeed[i] *= .44704;
            if(i < myLaunchAngle.length)
            {
                myLaunchAngle[i] = Math.toRadians(myLaunchAngle[i]);
            }
        }
        isRadians = true;
    }
    
    /**
     * Mutator method to convert mps and radians to mph and degrees (no parameters)
     */
    public void reconvert()
    {
        for(int i = 0; i < myLaunchSpeed.length; i ++)
        {
            myLaunchSpeed[i] /= .44704;
            if(i < myLaunchAngle.length)
            {
                myLaunchAngle[i] = Math.toDegrees(myLaunchAngle[i]);
            }
        }
        isRadians = false;
    }
    
    /**
     * Mutator method to calculate launch distances (no parameters)
     */
    public void calcLaunchValues()
    {
        myLaunchValues = new Double[myLaunchSpeed.length][myLaunchAngle.length];
        if(!isRadians)
        {    
            convert();
        }
        for(int i = 0; i < myLaunchSpeed.length; i ++)
        {
            for(int j = 0; j < myLaunchAngle.length; j ++)
            {
                myLaunchValues[i][j] = Math.pow(myLaunchSpeed[i] * 5, 2) * Math.sin(2 * myLaunchAngle[j] * 5) / 9.8;
            }
        }
    }
}
