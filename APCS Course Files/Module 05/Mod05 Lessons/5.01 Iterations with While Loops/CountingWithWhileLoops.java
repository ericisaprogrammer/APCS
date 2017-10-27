public class CountingWithWhileLoops 
{
    public static void main (String[] args) 
    {
        int counter = 0;
        int theTerminator = 100;
        
        while(counter <= theTerminator)
        {
            System.out.println("counter = " + counter);
            counter ++;
        }
    }
}