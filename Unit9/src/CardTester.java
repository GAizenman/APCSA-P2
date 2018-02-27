/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("king", "spades", 10);
		Card two = new Card("six", "hearts", 6);
		Card three = new Card("ace", "clubs", 1);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
	}
}
