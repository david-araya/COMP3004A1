package core;

public class Card {

	protected static String[] suits = new String[] { "S", "H", "C", "D" };
	protected static String[] ranks = new String[] {"J", "A", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "J", "Q", "K"};
			// 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A,
	
	private String suit;
	private String rank;
	private int value;

	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public String getRank() {
		
		return rank;
	}
	
	public int getValue()
	{
		
		
		for(int i = 0; i < ranks.length - 1; i++)
		{
			if(rank == ranks[i] && i > 10)
			{
				value = 10;
				
			} else if(rank == ranks[i] && i == 1)
			{
				value = 11;
				
			} else if (rank == ranks[i]){
				value = i;
			}
		}
		return value;
	}
}