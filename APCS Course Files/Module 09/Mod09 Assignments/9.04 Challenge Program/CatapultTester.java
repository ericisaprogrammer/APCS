public class CatapultTester
{
    /**
     * This class tests the Catapult class
     * 
     * A Catapult object is created to hold 2 double arrays.
     * 
     * Print commands are used to format the desired values by directly calling
     * convert(), calcLaunchValues(), getLaunchValues(), and reconvert().
     * 
     * @author E. Osgood
     * @version 2/28/16
     */
    public static void main(String[] args)
    {
        //Variable Declaration
        Double[][] launchValues;
        Double[] launchSpeeds = new Double[7];
        Double[] launchAngles = new Double[6];
        int rows = launchSpeeds.length;
        int columns = launchAngles.length;
        
        //Each angle in the array is the real value divided by 5, making the array incremental and easier to handle
        for(int i = 0; i < launchAngles.length; i ++)
        {
            launchAngles[i] = i + 5.0;
        }
        
        //Each speed in the array is the real value divided by 5, making the array incremental and easier to handle
        for(int i = 0; i < launchSpeeds.length; i ++)
        {
            launchSpeeds[i] = i + 4.0;
        }
        
        //Creation of Catapult object
        Catapult launch = new Catapult(launchSpeeds, launchAngles);
        
        //Determines all launch values for the angles and speeds
        launch.convert();
        launch.calcLaunchValues();
        launchValues = launch.getLaunchValues();
        launch.reconvert();
        
        //Displays all the angle measurements used
        System.out.printf("%7s%32s%n", "Launch", "Launch");
        System.out.printf("%6s%29s%n", "Speed(mph)", "Angle");
        System.out.printf("%2s", "");
        for(double angle : launchAngles)
        {
            System.out.printf("%10d", (int)(angle * 5));
        }
        System.out.printf("%n=========================================================================%n");
        
        for(int i = 0; i < rows; i ++)
        {
            System.out.printf("%3d", (int)(launchSpeeds[i] * 5));
            for(int j = 0; j < columns; j ++)
            {
                System.out.printf("%10.2f", launchValues[i][j]);
            }
            System.out.printf("%n");
        }
    }
}