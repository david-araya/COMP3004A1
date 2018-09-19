package core;

import java.util.*;

public class Deck {
	protected ArrayList<Card> deck;
	int count = 0;

	Deck() // constructor creates the deck
	{
		deck = new ArrayList<Card>();
		// Card[] deck = new Card[52];
		for (int suit = 0; suit < Card.suits.length; suit += 1) {
			for (int rank = 2; rank <= 14; rank += 1) {

				deck.add(new Card(Card.suits[suit], rank));
			}
		}
	}

	public void shuffleDeck() {

		// Shuffle Deck
		
		Collections.shuffle(deck);
		
		/*
		for (int i = 0; i < deck.size(); i++) {
			int k = (int) (Math.random() * (deck.size() - i));
			// swap card i with card i+k
			
			
			Card tmp = deck[i];
			deck[i] = deck[i + k];
			deck[i + k] = tmp;
		}
		*/
	}

	public int getSize() {
		return deck.size();
	}

	public Card getCard() {

		return deck.remove(0);
	}
}
