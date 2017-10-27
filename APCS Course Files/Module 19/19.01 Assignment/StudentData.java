/* Purpose: To demonstrate the use of RuntimeExceptions
 * Author: Eric Osgood
 * Date: June 6th, 2016
 */
public class StudentData
{
    private String firstName, lastName;
    private double[] testScores;
    private char grade;
    
    //Precondition: testScores is non-empty
    //Precondition: firstName and lastName are non-empty
    StudentData(String firstName, String lastName, double[] testScores)
    {
        if(firstName == "")
        {
            throw new RuntimeException("firstName cannot be empty.");
        }
        if(lastName == "")
        {
            throw new RuntimeException("lastName cannot be empty.");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        grade = courseGrade(testScores);
    }
    
    public char courseGrade(double[] list)
    {
        if(testScores.length < 1)
        {
            throw new RuntimeException("testScores cannot be empty.");
        }
        double avg = 0;
        for(double a : list)
        {
            avg += a;
        }
        avg /= list.length;
        if(avg >= 90)
        {
            return 'A';
        }
        if(avg >= 80)
        {
            return 'B';
        }
        if(avg >= 70)
        {
            return 'C';
        }
        if(avg >= 60)
        {
            return 'D';
        }
        return 'F';
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " | " + testScores + " - " + grade;
    }
}