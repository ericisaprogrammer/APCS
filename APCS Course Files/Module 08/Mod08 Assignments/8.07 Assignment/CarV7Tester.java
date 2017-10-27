/* Author: Eric Osgood
 * Version: 1.3.0 (January 23rd, 2016)
 * Purpose: Demonstrates how blah blah blah blah just look at the other class' comment
 */
public class CarV7Tester
{
    public static void main(String[] args)
    {
        //CarV7 Object: 2003 Honda Civic
        int endMiles1, startMiles1;
        double gallonsUsed1, pricePerGallon1;
        String carType1;
        
        startMiles1 = 147623; endMiles1 = 147952;
        gallonsUsed1 = 11.846; pricePerGallon1 = 1.65;
        carType1 = "03 Honda Civic";
        
        CarV7 car1 = new CarV7(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
        
        //CarV7 Object: 2016 Toyota Prius
        int endMiles2, startMiles2;
        double gallonsUsed2, pricePerGallon2;
        String carType2;
        
        startMiles2 = 7452; endMiles2 = 7734;
        gallonsUsed2 = 5.645; pricePerGallon2 = 1.71;
        carType2 = "16 Toyota Prius";
        
        CarV7 car2 = new CarV7(carType2, endMiles2, startMiles2, gallonsUsed2, pricePerGallon2);
        
        //CarV7 Object: 2007 Hummer
        int endMiles3, startMiles3;
        double gallonsUsed3, pricePerGallon3;
        String carType3;
        
        startMiles3 = 57372; endMiles3 = 57604;
        gallonsUsed3 = 15.574; pricePerGallon3 = 1.67;
        carType3 = "07 Hummer H3";
        
        CarV7 car3 = new CarV7(carType3, endMiles3, startMiles3, gallonsUsed3, pricePerGallon3);
        
        //Final Output
        System.out.printf("%60s%n", "Gas Mileage Calculations");
        System.out.printf("%15s%13s%12s%11s%10s%8s%9s%12s%11s%n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("=====================================================================================================");
        System.out.printf("%12s%14d%12d%11d%10.1f%8.2f%9.2f%12.1f%11.3f%n", car1.getCarType(), car1.getStartMiles(), car1.getEndMiles(), car1.calcDistance(), car1.getGallonsUsed(), car1.getPricePerGallon(), car1.calcCost(), car1.calcMilesPerGallon(), car1.calcGallonsPerMile());
        System.out.printf("%12s%13d%12d%11d%10.1f%8.2f%9.2f%12.1f%11.3f%n", car2.getCarType(), car2.getStartMiles(), car2.getEndMiles(), car2.calcDistance(), car2.getGallonsUsed(), car2.getPricePerGallon(), car2.calcCost(), car2.calcMilesPerGallon(), car2.calcGallonsPerMile());
        System.out.printf("%12s%16d%12d%11d%10.1f%8.2f%9.2f%12.1f%11.3f%n", car3.getCarType(), car3.getStartMiles(), car3.getEndMiles(), car3.calcDistance(), car3.getGallonsUsed(), car3.getPricePerGallon(), car3.calcCost(), car3.calcMilesPerGallon(), car3.calcGallonsPerMile());
    }
}