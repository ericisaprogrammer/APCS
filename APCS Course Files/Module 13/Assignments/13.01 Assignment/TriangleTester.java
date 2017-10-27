/* Purpose: To demonstrate the basic principals for inheritance
 * Author: Eric Osgood
 * Date: March 21st, 2016
 */
public class TriangleTester
{
    public static void main(String[] args)
    {
        Triangle triangle1 = new Triangle(1, 2, 3);
        Equilateral equilateral1 = new Equilateral(4);
        IsoscelesRight isoscelesRight1 = new IsoscelesRight(1.5);
        
        System.out.printf("Triangle lengths are A = %1.1f, B = %1.1f, C = %1.1f%n", triangle1.getSideA(), triangle1.getSideB(), triangle1.getSideC());
        System.out.printf("Equilateral lengths are A = %1.1f, B = %1.1f, C = %1.1f", equilateral1.getSideA(), equilateral1.getSideB(), equilateral1.getSideC());
        System.out.printf("Isosceles Right lengths are A = %1.1f, B = %1.1f, C = %1.1f%n%n", isoscelesRight1.getSideA(), isoscelesRight1.getSideB(), isoscelesRight1.getSideC());
    }
}