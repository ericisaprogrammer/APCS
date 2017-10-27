/* Purpose: To understand the use of insertion algorithms
 * Author: Eric Osgood
 * Date: April 26th, 2016
 */
public class Candidate
{
    private String name;
    private int numVotes;
    
    Candidate(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumVotes()
    {
        return numVotes;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setVotes(int votes)
    {
        numVotes = votes;
    }
    
    public String toString()
    {
        return name + " has " + numVotes + " votes";
    }
}
