/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {
            "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", 
            "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", 
            "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", 
            "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
            };
        String[] suits = new String[52];
        for(int i = 0; i < suits.length; i ++)
        {
            if(i < 13)
            {
                suits[i] = "Diamonds";
            }
            else if(i < 26)
            {
                suits[i] = "Hearts";
            }
            else if(i < 39)
            {
                suits[i] = "Spades";
            }
            else
            {
                suits[i] = "Clubs";
            }
        }
        
        int[] values = new int[52];
        for(int i = 0; i < values.length; i ++)
        {
            values[i] = i + 1;
        }
        
        Deck deck = new Deck(ranks, suits, values);
        System.out.println("Here is a hand of five cards (dealt from a deck of " + deck.size() +  " cards):");
        System.out.println("--------------------------------------------------------------");
        System.out.println(deck.deal() + ": There are " + deck.size() + " cards left.");
        System.out.println(deck.deal() + ": There are " + deck.size() + " cards left.");
        System.out.println(deck.deal() + ": There are " + deck.size() + " cards left.");
        System.out.println(deck.deal() + ": There are " + deck.size() + " cards left.");
        System.out.println(deck.deal() + ": There are " + deck.size() + " cards left.");
        System.out.println("--------------------------------------------------------------");
        System.out.println("After dealing 5 cards, the deck is empty - " + deck.isEmpty());
    }
}
