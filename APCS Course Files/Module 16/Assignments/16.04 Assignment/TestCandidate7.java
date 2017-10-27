/* Purpose: To understand the use of deletion algorithms
 * Author: Eric Osgood
 * Date: April 27th, 2016
 */
public class TestCandidate7
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
            if(!b.getName().equals(""))
            {
                double votePercentage = (b.getNumVotes() / (double)totalVotes) * 100;
                System.out.printf("%-20s%-20d%-20.1f%n", b.getName(), b.getNumVotes(), votePercentage);
            }
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + totalVotes);
    }
    
    public static Candidate[] deleteByLoc(Candidate[] a, int position)
    {
        for(int i = position - 1; i < a.length - 1; i ++)
        {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = new Candidate();
        return a;
    }
    
    public static Candidate[] deleteByName(Candidate[] a, String name)
    {
        int position = 0;
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i].getName().equalsIgnoreCase(name))
            {
                position = i + 1;
            }
        }
        return deleteByLoc(a, position);
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
        election = deleteByLoc(election, 6);
        printResults(election);
        System.out.println();
        election = deleteByName(election, "Kathleen Turner");
        printResults(election);
        System.out.println();
    }
}