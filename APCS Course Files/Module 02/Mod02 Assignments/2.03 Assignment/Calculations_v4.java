/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * FLVS 2007
 * @author Bill Jordan; A.Ross; Eric Osgood
 * @version 01/19/07; 06/24/12; 08/11/15; 08/19/15
 */
public class Calculations_v4
{
    public static void main(String[ ] args)
    {
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 5;
        int iNum4 = 16;
        
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " + " + iNum2 + " = ");
        System.out.println(iNum1 + iNum2);
        System.out.println("43.21 + 3.14 + 5 = " + (43.21 + 3.14 + 5.0));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum4 + " - " + iNum2 + " - " + iNum1 + " = ");
        System.out.println(iNum4 - iNum2 - iNum1);
        System.out.print("3.14 - " + iNum3 + " = ");
        System.out.println(3.14 - iNum3);
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum1 + " * " + iNum2 + " = ");
        System.out.println(iNum1 * iNum2);
        System.out.print("3.14 * " + iNum3 + " * " + iNum3 + " = ");
        System.out.println(3.14 * iNum3 * iNum3);
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum2 + " / " + iNum1 + " = ");
        System.out.println(iNum2 / iNum1);
        System.out.print("43.21 / " + iNum3 + " = ");
        System.out.println(43.21 / iNum3);
        System.out.println();
          
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum4 + " % " + iNum2 + " = ");
        System.out.println(iNum4 % iNum2);
        System.out.print(iNum3 + " % 3.14 = ");
        System.out.println(iNum3 % 3.14);
        System.out.println();
        
        // 2.02 Lab Equations
        int iNum5 = 15;
        int iNum6 = 2;
        int iNum7 = 10;
        int iNum8 = 234;
        int iNum9 = 6;
        int iNum10 = 12;
        int iNum11 = 3;
        int iNum12 = 11;
        int iNum13 = 24;
        int iNum14 = 17;
        int iNum15 = 480;
        int iNum16 = 200;
        int iNum17 = 20;
        int iNum18 = 8;
        
        System.out.println("2.02 Lab Equations");
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.print(iNum5 + " / 2.5 * -" + iNum6 + " + " + iNum7 + " / " + iNum3 + " = ");
        System.out.println(iNum5 / 2.5 * -iNum6 + iNum7 / iNum3);
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.print(iNum8 + " - (" + iNum8 + " / " + iNum9 + " % " + iNum10 + ") + " + iNum11 + " = ");
        System.out.println(iNum8 - (iNum8 / iNum9 % iNum10) + iNum11);
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.print("46.2 / " + iNum12 + " - " + iNum11 + " + " + iNum13 + " % (" + iNum14 + " - " + iNum6 + " * " + iNum11 + " ) = ");
        System.out.println(46.2 / iNum12 - iNum11 + iNum13 % (iNum14 - iNum6 * iNum11));
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.print(iNum15 + " / " + iNum7 + " / " + iNum10 + " + " + iNum16 + " * .5 - " + iNum17 + " % " + iNum18 + " = ");
        System.out.println(iNum15 / iNum7 / iNum10 + iNum16 * .5 + iNum17 % iNum18);
        // 2.03 Additional int Equations
        System.out.println();
        System.out.println("2.03 Unique Equations");
        System.out.print(iNum6 + " / " + iNum18 + " % " + iNum1 + " * " + iNum5 + " + " + iNum7 + " = ");
        System.out.println(iNum6 / iNum18 % iNum1 * iNum5 + iNum7);
        System.out.print(iNum15 + " - " + iNum16 + " % " + iNum4 + " * " + iNum8 + " / " + iNum5 + " = ");
        System.out.println(iNum15 - iNum16 % iNum4 * iNum8 / iNum5);
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class