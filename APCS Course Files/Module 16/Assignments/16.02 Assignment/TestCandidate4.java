/* Purpose: To understand the use of replacement algorithms
 * Author: Eric Osgood
 * Date: April 26th, 2016
 */
import java.util.ArrayList;
public class TestCandidate4
{
    public static void printVotes(ArrayList<Candidate> a)
    {
        for(Candidate b : a)
        {
            System.out.println(b.toString());
        }
    }
    
    public static int getTotal(ArrayList<Candidate> a)
    {
        int totalVotes = 0;
        for(Candidate b : a)
        {
            totalVotes += b.getNumVotes();
        }
        return totalVotes;
    }
    
    public static void printResults(ArrayList<Candidate> a)
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
    
    public static void replace(ArrayList<Candidate> a, String search, String replace)
    {
        for(Candidate b : a)
        {
            if(b.getName().equalsIgnoreCase(search))
            {
                b.setName(replace);
            }
        }
    }
    
    public static void replace(ArrayList<Candidate> a, String search, int replace)
    {
        for(Candidate b : a)
        {
            if(b.getName().equalsIgnoreCase(search))
            {
                b.setVotes(replace);
            }
        }
    }
    
    public static void replace(ArrayList<Candidate> a, String search, String replaceName, int replaceVotes)
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
        ArrayList<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));
        election.add(new Candidate("Mickey Jones", 3000));
        election.add(new Candidate("Rebecca Morgan", 2000));
        election.add(new Candidate("Kathleen Turner", 8000));
        election.add(new Candidate("Tory Parker", 500));
        election.add(new Candidate("Ashton Davis", 10000));
        
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
