/*Author: Eric Osgood
 * Date: November 17th, 2015
 * Program Purpose: Simulate the number of males and femals from a random selection
 * of people from Uruguay
 */
import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String[] args)
    {
        //Variable Declarations
        double random = 0.0;
        int males = 0;
        int females = 0;
        int population = 0;
        int counter = 1;
        
        Scanner in = new Scanner(System.in);
        
        //Input Prompt
        System.out.print("Enter the number of people you would like to simulate: ");
        population = in.nextInt();
        
        //Output + Simulation
        while(counter <= population)
        {
            random = Math.random();
            if(random < .4831)
            {
                males ++;
                System.out.println(counter + "\t" + random + "\tMale");
            }
            else
            {
                females ++;
                System.out.println(counter + "\t" + random + "\tFemale");
            }
            counter ++;
        }
        
        System.out.println();
        System.out.println("POPULATION RESULTS FROM SIMULATION (URUGUAY)");
        System.out.println("Males\t" + males);
        System.out.println("Females\t" + females);
        System.out.println("Total\t" + population);
    }
}