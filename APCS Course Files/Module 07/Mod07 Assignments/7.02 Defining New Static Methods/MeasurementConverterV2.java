
/**
 * Write a description of class MeasurementConverterV2_Key here.
 * To demonstrate the usage of static methods created for unique purposes
 * 
 * @author (your name) Eric Osgood
 * @version 1.0.0 (November 30th, 2015)
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("Imperial and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        //return statement calculate kilometers goes here    
        return mi * 1.60934;
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        //return statement to calculate miles goes here  
        return km * 0.621371;
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public static double convertPoundsToKilograms(double lbs)
    {
        //return statement to calculate kilograms goes here 
        return lbs * 0.453592;
    } 
    
    //convert kilograms to pounds
    // method header to convert kilograms to pounds goes here
    public static double convertKilogramsToPounds(double kg)
    {
        //return statement to calculate pounds goes here    
        return kg * 2.20462;
    } 
    
    public static double convertGallonsToLiters(double gal)
    {
        return gal * 3.78541;
    }
    
    public static double convertLitersToGallons(double lit)
    {
        return lit * 0.264172;
    }
    
    public static double convertHectaresToAcres(double hect)
    {
        return hect * 2.47105;
    }
    
    public static double convertAcresToHectares(double acre)
    {
        return acre * 0.404686;
    }
        
    public static void main(String[ ] args)
    {
        //local variables
        //double miles, feet, inches, pounds, gallons;
        //double kilometers, kilograms, liters;
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        double feet = 6230;
        double miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%10.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%10.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%10.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        //call method to convert kilometers to miles goes here
        //print results goes here
        miles = convertKilometersToMiles(miles);
        System.out.printf("%10.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
         //call method to convert pounds to kilograms goes here
        //print results goes here
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%10.1f kg. = %7.1f lb. %n", kilograms, pounds);
       
        //declare and initialize the kilograms variable goes here
        //call method to convert kilograms to pounds goes here
        //print results goes here
        kilograms = 143;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%10.1f kg. = %7.1f lb. %n", pounds, kilograms);
        
        //declare and initialize the gallons variable goes here
        //call method to convert gallons to liters goes here
        //print results goes here
        double gallons = 47;
        double liters = convertGallonsToLiters(gallons);
        System.out.printf("%10.1f gal = %7.1f L %n", gallons, liters);
        
        //declare and initialize the liters variable goes here
        //call method to convert liters to gallons goes here
        //print results goes here
        liters = 19;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%10.1f L   = %7.1f gal. %n", liters, gallons);
        
        double hectares = 65;
        double acres = convertHectaresToAcres(hectares);
        System.out.printf("%10.1f ha. = %7.1f ac. %n", hectares, acres);
        
        acres = 34;
        hectares = convertAcresToHectares(acres);
        System.out.printf("%10.1f ac. = %7.1f ha. %n", acres, hectares);
           
    }//end of main method
	
}//end of class


