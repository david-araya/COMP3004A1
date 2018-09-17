package core;

public class Card {

	protected static String[] suits = new String[] { "S", "H", "C", "D" };
	protected static String[] ranks = new String[] { "J", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "J", "Q", "K", "A",};
	
	private String suit;
	private int rank;

	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;

	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}
}