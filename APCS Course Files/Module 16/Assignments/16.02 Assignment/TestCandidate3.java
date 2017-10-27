/* Purpose: To understand the use of replacement algorithms
 * Author: Eric Osgood
 * Date: April 26th, 2016
 */
public class TestCandidate3
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
    
    public static void replace(Candidate[] a, String search, String replace)
    {
        for(Candidate b : a)
        {
            if(b.getName().equalsIgnoreCase(search))
            {
                b.setName(replace);
            }
        }
    }
    
    public static void replace(Candidate[] a, String search, int replace)
    {
        for(Candidate b : a)
        {
            if(b.getName().equalsIgnoreCase(search))
            {
                b.setVotes(replace);
            }
        }
    }
    
    public static void replace(Candidate[] a, String search, String replaceName, int replaceVotes)
    {
        for(Candidate b : a)
        {
            if(b.getName().equalsIgnoreCase(search))
            {
                b.setName(replaceName);
                b.setVotes(replaceVotes);
            }
        }
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
        replace(election, "Michael Duffy", "John Elmos");
        printResults(election);
        System.out.println();
        replace(election, "Mickey Jones", 2500);
        printResults(election);
        System.out.println();
        replace(election, "Kathleen Turner", "John Kennedy", 8500);
        printResults(election);
        System.out.println();
    }
}
