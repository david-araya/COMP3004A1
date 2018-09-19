package core;

public class Card {

	protected static String[] suits = new String[] { "S", "H", "C", "D" };
	protected static String[] ranks = new String[] {"J", "A", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "J", "Q", "K"};
			// 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A,
	
	private String suit;
	private int rank;
	private int value;

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
	
	public int getValue()
	{
		if(rank > 10)
		{
			value = 10;
		} if(rank == 1)
		{
			value = 11;
		} else {
			value = rank;
		}
		
		return value;
	}
}