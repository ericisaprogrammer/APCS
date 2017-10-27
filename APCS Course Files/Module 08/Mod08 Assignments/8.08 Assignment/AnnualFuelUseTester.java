/* Author: Eric Osgood
 * Version: 1.0.0 (January 25th, 2016)
 * Purpose: Code that creates AnnualFuelUse objects and displays data from them 
 */

public class AnnualFuelUseTester
{
    public static void main(String[] args)
    {
        //Variable Assignments
        int maxDistance = Integer.MIN_VALUE, minDistance = Integer.MAX_VALUE;
        int totalDistance = 0;
        int annualDistance;
        double maxMPG = Double.MIN_VALUE, minMPG = Double.MAX_VALUE, maxPrice = Double.MIN_VALUE, minPrice = Double.MAX_VALUE;
        double totalGallonsUsed = 0.0, totalCost = 0.0;
        double annualGallonsUsed, annualMPG, annualCost;
        
        int fillUpDay1 = 1, startMiles1 = 47825, endMiles1 = 48084;
        double gallonsUsed1 = 8.7, pricePerGallon1 = 1.65;
        
        int fillUpDay2 = 9, startMiles2 = 48084, endMiles2 = 48313;
        double gallonsUsed2 = 9.3, pricePerGallon2 = 1.87;
        
        int fillUpDay3 = 18, startMiles3 = 48313, endMiles3 = 48576;
        double gallonsUsed3 = 9.2, pricePerGallon3 = 1.83;
        
        //Object Creation
        AnnualFuelUse[] car = new AnnualFuelUse[3];
        car[0] = new AnnualFuelUse(fillUpDay1, startMiles1, endMiles1, gallonsUsed1, pricePerGallon1);
        car[1] = new AnnualFuelUse(fillUpDay2, startMiles2, endMiles2, gallonsUsed2, pricePerGallon2);
        car[2] = new AnnualFuelUse(fillUpDay3, startMiles3, endMiles3, gallonsUsed3, pricePerGallon3);
        
        //Loop: Assigns max/min values for distance, MPG, and price and assigns total distance, gallons used, and cost
        for(int i = 0; i < car.length; i ++)
        {
            //Max/Min value assignment
            if(car[i].getPricePerGallon() < minPrice)
            {
                minPrice = car[i].getPricePerGallon();
            }
            if(car[i].getPricePerGallon() > maxPrice)
            {
                maxPrice = car[i].getPricePerGallon();
            }
            if(car[i].calcMilesPerGallon() > maxMPG)
            {
                maxMPG = car[i].calcMilesPerGallon();
            }
            if(car[i].calcMilesPerGallon() < minMPG)
            {
                minMPG = car[i].calcMilesPerGallon();
            }
            if(car[i].calcDistance() > maxDistance)
            {
                maxDistance = car[i].calcDistance();
            }
            if(car[i].calcDistance() < minDistance)
            {
                minDistance = car[i].calcDistance();
            }
            
            //Total assignments
            totalDistance += car[i].calcDistance();
            totalGallonsUsed += car[i].getGallonsUsed();
            totalCost += car[i].calcCost();
        }
        
        annualDistance = (totalDistance / car[car.length - 1].getFillUpDay()) * 365;
        annualGallonsUsed = (totalGallonsUsed / car[car.length - 1].getFillUpDay()) * 365;
        annualMPG = annualDistance / annualGallonsUsed;
        annualCost = (totalCost / car[car.length - 1].getFillUpDay()) * 365;
        
        //Output
        System.out.printf("%7s%5s%13s%11s%10s%10s%7s%9s%8s%n", "Fill Up", "Day", "Start Miles", "End Miles", "Distance", "Gallons", "MPG", "Price", "Cost");
        for(int i = 0; i < car.length; i ++)
        {
            System.out.printf("%5d%7d%11d%12d%9d%11.1f%9.1f%8.2f%8.2f%n", i + 1, car[i].getFillUpDay(), car[i].getStartMiles(), car[i].getEndMiles(), car[i].calcDistance(), car[i].getGallonsUsed(), car[i].calcMilesPerGallon(), car[i].getPricePerGallon(), car[i].calcCost());
        }
        System.out.println();
        System.out.printf("%-41s%3d%20.1f%8.2f%n", "Minimum:", minDistance, minMPG, minPrice);
        System.out.printf("%-41s%3d%20.1f%8.2f%n", "Maximum:", maxDistance, maxMPG, maxPrice);
        System.out.printf("%-41s%3d%20.1f%16.2f%n", "Totals:", totalDistance, totalGallonsUsed, totalCost);
        System.out.println();
        System.out.printf("%-39s%3d%11.1f%9.1f%16.2f", "Annual Projections:", annualDistance, annualGallonsUsed, annualMPG, annualCost);
    }
}