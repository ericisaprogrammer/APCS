import java.util.ArrayList;
public class TestCandidate2
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
        System.out.printf("%20s%20s%20s%n", "Candidate", "Votes Received", "% of Total Votes");
        int totalVotes = getTotal(a);
        for(Candidate b : a)
        {
            double votePercentage = (b.getNumVotes() / (double)totalVotes) * 100;
            System.out.printf("%20s%20d%20.1f%n", b.getName(), b.getNumVotes(), votePercentage);
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + totalVotes);
    }
    
    public static void main(String[] args)
    {
        ArrayList<Candidate> election = new ArrayList<Candidate>();
        
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));
        
        System.out.println("Results per candidate:");
        System.out.println();
        System.out.println("======================");
        System.out.println();
        
        printVotes(election);
        
        System.out.println();
        
        printResults(election);
    }
}