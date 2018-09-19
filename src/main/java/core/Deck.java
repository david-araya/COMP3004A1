package core;

import java.util.*;

public class Deck {
	protected ArrayList<Card> deck;

	Deck() // constructor creates the deck
	{
		deck = new ArrayList<Card>();
		for (int suit = 0; suit <= Card.suits.length-1; suit++) {
			for (int rank = 1; rank <= Card.ranks.length-1; rank++) {

				deck.add(new Card(Card.suits[suit], Card.ranks[rank]));
			}
		}
	}

	// Shuffle Deck
	public void shuffleDeck() {
		
		Collections.shuffle(deck);
	}

	public int getSize() {
		System.out.println(deck.size());
		return deck.size();
	}

	public Card getCard() {

		return deck.remove(0);
	}
	
	public Card getAtPosition(int i)
	{
		return deck.get(i);
	}
	
	public Card getLastPosition()
	{
		return deck.get(deck.size() - 1);
	}
}
