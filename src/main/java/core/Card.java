package core;

public class Card {
	private String suits;
	private String ranks;

	public Card(String suits, String ranks) {
		this.suits = suits;
		this.ranks = ranks;
	
}

	public String getSuit() { return suits; }
	public String getRank() { return ranks; }
}