package core;

//import java.util.Arrays;

public class Deck {	
		Card[] deck;
		int count = 0;

		public Card[] getDeck()
		{
		Card[] deck = new Card[52];
		for (int suit = 0; suit < Card.suits.length; suit += 1) {
			for (int rank = 2; rank <= 14; rank += 1) {

				deck[count++] = new Card(Card.suits[suit], rank);
			}
		}
		
		return deck;
		}

		public void shuffle(Card deck[])
		{
			
		// Shuffle Deck
		for (int i = 0; i < deck.length; i++) {
			int k = (int) (Math.random() * (deck.length - i));
			// swap card i with card i+k
			Card tmp = deck[i];
			deck[i] = deck[i + k];
			deck[i + k] = tmp;
		}
	}
		
	public int getSize()
	{
		return count;
	}
	
	public Card getCard() {

		shuffle(getDeck());
		
		return deck[0];
	}


}
