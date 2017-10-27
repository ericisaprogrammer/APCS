public class TestCandidate
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
        Candidate[] election = new Candidate[5];
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        
        System.out.println("Results per candidate:");
        System.out.println();
        System.out.println("======================");
        System.out.println();
        
        printVotes(election);
        
        System.out.println();
        
        printResults(election);
    }
}
