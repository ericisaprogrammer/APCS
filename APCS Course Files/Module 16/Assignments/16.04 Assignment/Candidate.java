/* Purpose: To understand the use of deletion algorithms
 * Author: Eric Osgood
 * Date: April 27th, 2016
 */
public class Candidate
{
    private String name;
    private int numVotes;
    
    Candidate()
    {
        name = "";
        numVotes = 0;
    }
    
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