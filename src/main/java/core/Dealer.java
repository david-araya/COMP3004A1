package core;

import java.util.ArrayList;

public class Dealer {
	protected ArrayList<Card> dealersHand;
	protected ArrayList<Card> playersHand;

	protected String input;
	protected int playerHandValues = 0;
	protected int dealerHandValues = 0;

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
	
	public int getPlayerHandValue()
	{
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
	
	public void checkAce()
	{
		for (int i = 0; i < dealersHand.size() - 1; i++) {
			if(dealerHandValues > 21 && dealersHand.get(i).getRank() == "A")
			{
				//dealerHandValues-=10;
				dealersHand.get(i).setValue(1);	
			}
		}
		
		for (int i = 0; i < playersHand.size() - 1; i++) {
			if(playerHandValues > 21 && playersHand.get(i).getRank() == "A")
			{
				//playerHandValues-=10;
				playersHand.get(i).setValue(1);
			}
		}
		
	}
	
	public void playerHit(Deck deck)
	{
		playersHand.remove(playersHand.size()-1);

		playersHand.add(deck.getCard());

		playerHandValues = 0;
		for (int i = 0; i < playersHand.size(); i++) {
			playerHandValues += playersHand.get(i).getValue();
		}
		
		checkAce();
	}
	
	public void dealerHit(Deck deck)
	{
		
		dealersHand.remove(dealersHand.size()-1);
		
		dealersHand.add(deck.getCard());
		
		
		dealerHandValues = 0;
		for (int i = 0; i < dealersHand.size(); i++) {
			dealerHandValues += dealersHand.get(i).getValue();
		}
		
		checkAce();
	}
	
	public String getInput(String input)
	{
		return this.input = input;
	}
}

