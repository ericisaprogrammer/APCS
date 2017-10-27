/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card sixOfHearts = new Card("Six", "Hearts", 1);
		Card sevenOfDiamonds = new Card("Seven", "Diamonds", 1);
		Card jackOfSpades = new Card("Jack", "Spades", 2);
		
		Card duplicateJack = new Card(jackOfSpades.rank(), jackOfSpades.suit(), jackOfSpades.pointValue());
		
		System.out.println(sixOfHearts);
		System.out.println(sevenOfDiamonds);
		System.out.println(jackOfSpades);
		System.out.println(duplicateJack);
		System.out.println();
		System.out.println("Jack of Spades = Duplicate Jack - " + jackOfSpades.matches(duplicateJack));
		System.out.println("Seven of Diamonds = Six of Hearts - " + sevenOfDiamonds.matches(sixOfHearts));
	}
}
