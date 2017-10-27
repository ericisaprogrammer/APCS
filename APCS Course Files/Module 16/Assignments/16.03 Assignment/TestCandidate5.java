/* Purpose: To understand the use of insertion algorithms
 * Author: Eric Osgood
 * Date: April 26th, 2016
 */
public class TestCandidate5
{
    public static void printVotes(Candidate[] a)
    {
        for(Candidate b : a)
        {
            System.out.println(b.toString());
        }
    }
    
    public static int getTotal(Candidate[] a)
    {
        int totalVotes = 0;
        for(Candidate b : a)
        {
            totalVotes += b.getNumVotes();
        }
        return totalVotes;
    }
    
    public static void printResults(Candidate[] a)
    {
        System.out.printf("%-20s%-20s%-20s%n", "Candidate", "Votes Received", "% of Total Votes");
        int totalVotes = getTotal(a);
        for(Candidate b : a)
        {
            double votePercentage = (b.getNumVotes() / (double)totalVotes) * 100;
            System.out.printf("%-20s%-20d%-20.1f%n", b.getName(), b.getNumVotes(), votePercentage);
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + totalVotes);
    }
        
    public static Candidate[] insertPosition(Candidate[] a, int position, Candidate insert)
    {
        for(int i = a.length - 1; i > position - 1; i --)
        {
            a[i] = a[i - 1];
        }
        a[position - 1] = insert;
        return a;
    }
    
    public static Candidate[] insertCandidate(Candidate[] a, String name, Candidate insert)
    {
        int position = 0;
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i].getName().equalsIgnoreCase(name))
            {
                position = i + 1;
            }
        }
        return insertPosition(a, position, insert);
    }
    
    public static void main(String[] args)
    {
        Candidate[] election = new Candidate[10];
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        election[5] = new Candidate("Mickey Jones", 3000);
        election[6] = new Candidate("Rebecca Morgan", 2000);
        election[7] = new Candidate("Kathleen Turner", 8000);
        election[8] = new Candidate("Tory Parker", 500);
        election[9] = new Candidate("Ashton Davis", 10000);
        
        printResults(election);
        System.out.println();
        election = insertPosition(election, 5, new Candidate("Mickey Duck", 14000));
        System.out.println("---Added Mickey Duck in position 5---");
        printResults(election);
        System.out.println();
        election = insertCandidate(election, "Kathleen Turner", new Candidate("Donald Mouse", 100));
        System.out.println("---Added Donald Mouse behind Kathleen Turner---");
        printResults(election);
        System.out.println();
    }
}
