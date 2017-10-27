/* Purpose: To understand the use of deletion algorithms
 * Author: Eric Osgood
 * Date: April 27th, 2016
 */
import java.util.ArrayList;
public class TestCandidate8
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
    
    public static ArrayList<Candidate> deleteByLoc(ArrayList<Candidate> a, int position)
    {
        a.remove(position - 1);
        return a;
    }
    
    public static ArrayList<Candidate> deleteByName(ArrayList<Candidate> a, String name)
    {
        for(int i = 0; i < a.size(); i ++)
        {
            if(a.get(i).getName().equals(name))
            {
                a.remove(i);
            }
        }
        return a;
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
        election = deleteByLoc(election, 6);
        printResults(election);
        System.out.println();
        election = deleteByName(election, "Kathleen Turner");
        printResults(election);
        System.out.println();
    }
}