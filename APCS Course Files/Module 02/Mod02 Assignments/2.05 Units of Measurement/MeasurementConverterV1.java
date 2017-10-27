/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * FLVS 2007
 * @authors: B. Jordan, Eric Osgood
 * @version: 01/19/07, 08/25/2015
 *
 * Modified by: (Student name goes here)
 * Date: (Today's date goes here)
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
            // measurement types
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers
        double inches;                  // distance in inches
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilos
        double gallons;                 // volume in gallons
        double liters;                  // volume in liters
        
            // conversion factors
        double feetPerMile = 5280;             // number of feet per 1 mile
        double milesPerFoot = 1.8939393E-4;    // number of miles per 1 foot
        double milesPerKilometer = 0.621371;   // number of miles per 1 kilometer
        double kilometersPerMile = 1.60934;    // number of kilometers per 1 mile
        double inchesPerMile = 63360;          // number of inches per 1 mile
        double milesPerInch = 1.5783E-5;       // number of miles per 1 inch
        double poundsPerKilogram = 2.20462;    // number of pounds per 1 kilogram
        double kilogramsPerPound = 0.453592;   // number of kilograms per 1 pound 
        double gallonsPerLiter = 0.264172;     // number of gallons per 1 liter
        double litersPerGallon = 3.78541;      // number of liters per 1 gallon
        
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable
        
        //Visual explaination of the program
        System.out.println("**************************************");
        System.out.println("    This program converts between");
        System.out.println("    selected units of measurement.");
        System.out.println("**************************************");
        
        
        //seperation of unit conversions
        System.out.println("DISTANCE");
        
        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

        //convert miles to feet
        miles = 50;
        feet = miles / milesPerFoot;
        System.out.println(miles + " miles = " + feet + " feet.");
        
        //convert miles to kilometers
        miles = 70;
        kilometers = miles / milesPerKilometer;
        System.out.println(miles + " miles = " + kilometers + " kilometers.");
        
        //convert kilometers to miles
        kilometers = 25;
        miles = kilometers / kilometersPerMile;
        System.out.println(kilometers + " kilometers = " + miles + " miles.");
        
        // convert miles to inches
        miles = 1.7;
        inches = miles / milesPerInch;
        System.out.println(miles + " miles = " + inches + " inches.");
        
        // convert inches to miles
        inches = 10000000;
        miles = inches / inchesPerMile;
        System.out.println(inches + " inches = " + miles + " miles.");
        
        
        //seperation of unit conversions
        System.out.println();
        System.out.println("WEIGHT");
        
        //convert pounds to kilograms
        pounds = 165;
        kilograms = pounds / poundsPerKilogram;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms.");
        
        //convert kilograms to pounds
        kilograms = 80;
        pounds = kilograms / kilogramsPerPound;
        System.out.println(kilograms + " kilograms = " + pounds + " pounds.");
        
        
        //seperation of unit conversions
        System.out.println();
        System.out.println("VOLUME");
        
        //convert gallons to liters
        gallons = 17;
        liters = gallons / gallonsPerLiter;
        System.out.println(gallons + " gallons = " + liters + " liters.");
        
        // convert liters to gallons
        liters = 47;
        gallons = liters / litersPerGallon;
        System.out.println(liters + " liters = " + gallons + " gallons.");
    }//end of main method
}//end of class

