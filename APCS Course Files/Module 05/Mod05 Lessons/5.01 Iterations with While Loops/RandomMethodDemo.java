public class RandomMethodDemo
{
    public static void main (String[] args)
    {
        double randomNumber;
        int counter = 0;

        while(counter <= 100)
        {
            randomNumber = Math.random();
            System.out.println(randomNumber);
            counter ++;
        }
    }
}