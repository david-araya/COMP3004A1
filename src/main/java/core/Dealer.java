package core;

import java.util.ArrayList;

public class Dealer {
	protected ArrayList<Card> dealersHand;
	protected ArrayList<Card> playersHand;

	protected String input;
	protected int playerHandValues = 0;
	protected int dealerHandValues = 0;

	protected int playerWins;
	protected int dealerWins;

	Dealer(Deck deck) {

		deck.shuffleDeck();

		dealersHand = new ArrayList<Card>();
		playersHand = new ArrayList<Card>();

		// populates dealers cards
		dealersHand.add(deck.getCard());
		dealersHand.add(deck.getCard());

		// populates player cards
		playersHand.add(deck.getCard());
		playersHand.add(deck.getCard());

		// gets the players card value
		for (int i = 0; i < playersHand.size() - 1; i++) {

		}

		// gets the dealers card value
		for (int i = 0; i < dealersHand.size() - 1; i++) {
			dealerHandValues += dealersHand.get(i).getValue();
		}
	}

	public int getPlayerHandValue() {
		playerHandValues = 0;
		for (int i = 0; i < playersHand.size(); i++) {
			playerHandValues += playersHand.get(i).getValue();
		}
		return playerHandValues;
	}

	public int getDealerHandValue() {
		dealerHandValues = 0;
		for (int i = 0; i < dealersHand.size(); i++) {
			dealerHandValues += dealersHand.get(i).getValue();
		}

		return dealerHandValues;
	}

	public void checkAce() {
		for (int i = 0; i < dealersHand.size(); i++) {

			if (dealerHandValues > 21 && dealersHand.get(i).getRank() == "A") {
				dealersHand.get(i).setValue(1);
			}
			getDealerHandValue();
		}

		for (int i = 0; i < playersHand.size(); i++) {
			if (playerHandValues > 21 && playersHand.get(i).getRank() == "A") {
				playersHand.get(i).setValue(1);
			}
			getPlayerHandValue();
		}

	}

	public void reduceBothAces() {
		if (dealerHandValues > 12) {
			for (int i = 0; i < dealersHand.size(); i++) {
				if (dealersHand.get(i).getValue() == 11) {
					dealersHand.get(i).setValue(1);
				}
			}
		}

		if (playerHandValues >= 12) {
			for (int i = 0; i < playersHand.size(); i++) {
				if (playersHand.get(i).getValue() == 11) {
					playersHand.get(i).setValue(1);
				}
			}
		}
	}

	public void reduceSingleAce() {
		if (dealerHandValues > 13) {
			for (int i = 0; i < dealersHand.size(); i++) {
				if (dealersHand.get(i).getValue() == 11 && dealerHandValues > 13) {
					dealersHand.get(i).setValue(1);

					getDealerHandValue();
				}
			}
		}

		if (playerHandValues >= 13) {
			for (int i = 0; i < playersHand.size(); i++) {
				if (playersHand.get(i).getValue() == 11 && dealerHandValues > 13) {
					playersHand.get(i).setValue(1);

					getPlayerHandValue();
				}
			}
		}
	}

	public void playerHit(Deck deck) {
		playersHand.remove(playersHand.size() - 1);

		playersHand.add(deck.getCard());

		playerHandValues = 0;
		for (int i = 0; i < playersHand.size(); i++) {
			playerHandValues += playersHand.get(i).getValue();
		}

		System.out.println("Players Cards: " + playersHand.get(0).getSuit() + playersHand.get(0).getRank() + ", "
				+ playersHand.get(1).getSuit() + playersHand.get(1).getRank());

		checkAce();

		System.out.println("Players Score: " + getPlayerHandValue());

		for (int i = 0; i < playersHand.size(); i++) {
			if (getDealerHandValue() > 21 && playersHand.get(i).getValue() == 1) {
				System.out.println("You have busted, the dealer wins");
				System.exit(0);
			}
		}
	}

	public boolean checkBlackJack() {
		if (playerHandValues == 21 || dealerHandValues == 21) {
			return true;
		} else {
			return false;
		}
	}

	public boolean playerInitialCards() {
		String firstCardValue;
		String secondCardValue;

		firstCardValue = playersHand.get(0).getSuit() + playersHand.get(0).getRank();
		secondCardValue = playersHand.get(1).getSuit() + playersHand.get(1).getRank();

		if (firstCardValue instanceof String && secondCardValue instanceof String) {
			return true;
		} else {
			return false;
		}
	}

	public boolean playerStand() {
		return true;
	}

	public boolean dealerStand() {
		return true;
	}

	public boolean dealerInitialCards() {
		String firstCardValue;
		String secondCardValue;

		firstCardValue = dealersHand.get(0).getSuit() + dealersHand.get(0).getRank();
		secondCardValue = dealersHand.get(1).getSuit() + dealersHand.get(1).getRank();

		if (firstCardValue instanceof String && secondCardValue instanceof String) {
			return true;
		} else {
			return false;
		}
	}

	public void dealerHit(Deck deck) {

		dealersHand.remove(dealersHand.size() - 1);

		dealersHand.add(deck.getCard());

		dealerHandValues = 0;
		for (int i = 0; i < dealersHand.size(); i++) {
			dealerHandValues += dealersHand.get(i).getValue();
		}

		System.out.println("Dealers Cards: " + dealersHand.get(0).getSuit() + dealersHand.get(0).getRank() + ", "
				+ dealersHand.get(1).getSuit() + dealersHand.get(1).getRank());

		checkAce();

		System.out.println("Dealers Score: " + getDealerHandValue());

		for (int i = 0; i < dealersHand.size(); i++) {
			if (getDealerHandValue() <= 16) {
				dealerHit(deck);

			} else if (getDealerHandValue() == 17 && dealersHand.get(i).getRank() == "A") {
				dealerHit(deck);
			} else {
				dealerStand();
			}
		}
		
		

	}

	public String getInput(String input) {
		return this.input = input;
	}
}
