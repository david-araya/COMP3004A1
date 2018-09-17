package core;

public class Deck {
	{
		Card[] hand = new Card[52];
		int count = 0;

		//Make Deck
		for (int suit = 0; suit < Card.suits.length; suit += 1) {
			for (int rank = 2; rank <= 14; rank += 1) {
				hand[count++] = new Card(Card.suits[suit], rank);
			}
		}

		//Shuffle Deck
		for (int i = 0; i < hand.length; i++) {
			int k = (int) (Math.random() * (hand.length - i));
			// swap card i with card i+k
			Card tmp = hand[i];
			hand[i] = hand[i + k];
			hand[i + k] = tmp;
		}
	}

}
