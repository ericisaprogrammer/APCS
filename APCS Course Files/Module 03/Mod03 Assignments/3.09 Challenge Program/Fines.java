/*
 * Program Purpose: Caluculates the fine of any overdue book from a library
 * Author: Eric Osgood
 * Version: 1.0 (09/29/2015)
 */

import java.util.Scanner;
public class Fines {
    public static void main(String[] args){
        //Variable declarations
        double dailyFine = .12;              
        double totalFine = 0;
        int currentDateInDays = 0;
        int checkoutDateInDays = 0;
        int daysForMonth = 0;
        int month = 0;
        int day = 0;
        int year = 0;
        int daysLate = 0;
                
        Scanner in = new Scanner(System.in);      
                
        String currentDate = "09/29/2015";
        String name = "";
        String firstName = "";
        String lastName = "";
        String socialSecurityNumber = "";
        String book = "";
        String checkoutDate = "";
        String monthToDays = "000031059090120151181212243273304334";
        String account = "";
        
        //CODE
        //Inputs
        System.out.print("Please enter name (Last, First): ");
        lastName = in.next();
        firstName = in.next();
        name = lastName + " " + firstName;
        lastName = lastName.replace(",", "");
        System.out.println();
        
        System.out.print("Please enter Social Security Number (###-##-####): ");
        socialSecurityNumber = in.next();
        System.out.println();
        
        System.out.print("Please enter the book title: ");
        book = in.next();
        book += in.nextLine();
        System.out.println();
        
        System.out.print("Please enter the date of check out (mm/dd/yyyy): ");
        checkoutDate = in.next();
        System.out.println();
        
        //Manipulations
        day = Integer.parseInt(currentDate.substring(3,5));
        month = Integer.parseInt(currentDate.substring(0,2));
        year = Integer.parseInt(currentDate.substring(6,10));
        daysForMonth = Integer.parseInt(monthToDays.substring(month * 3 - 3, month * 3));
        currentDateInDays = day + daysForMonth + year * 365;
        
        day = Integer.parseInt(checkoutDate.substring(3,5));
        month = Integer.parseInt(checkoutDate.substring(0,2));
        year = Integer.parseInt(checkoutDate.substring(6,10));
        daysForMonth = Integer.parseInt(monthToDays.substring(month * 3 - 3, month * 3));
        checkoutDateInDays = day + daysForMonth + year * 365;
        
        daysLate = currentDateInDays - checkoutDateInDays;
        totalFine = dailyFine * daysLate;
        account = lastName + firstName.substring(0,3) + "-" + socialSecurityNumber.substring(7,11);
        
        //Final Output
        System.out.println("Days Late: " + daysLate);
        System.out.println("Daily Fine: " + dailyFine);
        System.out.println("\n");
        System.out.println("To: " + name + "                    Account: " + account);
        System.out.println("From: Mona");
        System.out.println("Subject: Overdue Notice");
        System.out.println("=====================================================================");
        System.out.println(book + " was checked out on: " + checkoutDate);
        System.out.println("This book is currently " + daysLate + " days late.");
        System.out.println("Your fine has accumulated to: " + totalFine);
    }
}