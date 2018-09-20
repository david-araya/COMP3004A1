package core;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase{

	//Test that there are 52 cards
	public void testSize()
	{
		Deck deck = new Deck();
		assertEquals(52,deck.getSize());
	} 
	
	//Test shuffling
	public void testShuffling()
	{
		//Only have to run once to make sure it works
		Deck deck = new Deck();
		
		String card1 = deck.getAtPosition(2).getRank() + deck.getAtPosition(2).getSuit();
		
		deck.shuffleDeck();
		
		String card = deck.getAtPosition(2).getRank() + deck.getAtPosition(2).getSuit();	
		
		assertNotSame(card1,card);
	}
	
	//Test that you can select (f) input
	public void testInputOfC()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);
		//assertEquals("c",dealer.getInput());
		
	}
	//Test that you can select (c) input
	public void testInputOfF()
	{
		
	}
	
	//Test an ace can count as 1 or 11
	public void testAceCanBe1or11()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);

		dealer.dealersHand.get(0).setRank("A");
		dealer.dealersHand.get(1).setRank("A");
		
		assertEquals(11,dealer.dealersHand.get(0).getValue());
		assertEquals(11,dealer.dealersHand.get(1).getValue());
		
		dealer.reduceSingleAce();
		
		assertEquals(11,dealer.dealersHand.get(0).getValue());
		assertEquals(11,dealer.dealersHand.get(1).getValue());
	}
	
	//Test that ace can count as 1
	public void testAceAs1()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);

		dealer.dealersHand.get(0).setRank("A");
		dealer.dealersHand.get(1).setRank("J");
		
		assertEquals("A",dealer.dealersHand.get(0).getRank());
		assertEquals("J",dealer.dealersHand.get(1).getRank());
		
		assertEquals(21,dealer.getDealerHandValue());
		dealer.checkAce();
		dealer.reduceBothAces();
		assertEquals(11,dealer.getDealerHandValue());
	}
	
	//Test that ace can count as 11
	public void testAceAs11()
	{
		Deck deck = new Deck();
		
		assertEquals("A",deck.getAtPosition(0).getRank());
		assertEquals(11,deck.getAtPosition(0).getValue());
	}
	
	//Test that a hand can count two aces worth 1 each
	public void testThatTwoAcesCountAs1()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);

		dealer.dealersHand.get(0).setRank("A");
		dealer.dealersHand.get(1).setRank("A");
		
		assertEquals("A",dealer.dealersHand.get(0).getRank());
		assertEquals("A",dealer.dealersHand.get(1).getRank());
		
		assertEquals(22,dealer.getDealerHandValue());
		dealer.checkAce();
		dealer.reduceBothAces();
		assertEquals(12,dealer.getDealerHandValue());
	}
	
	/*
	 Test that if you have two aces in the same hand, 
	 one counts as 11 and the other counts 1
	 */
public void testThatTwoAcesCountAs1or11()
{
	Deck deck = new Deck();
	Dealer dealer = new Dealer(deck);

	dealer.dealersHand.get(0).setRank("A");
	dealer.dealersHand.get(1).setRank("A");
	
	assertEquals("A",dealer.dealersHand.get(0).getRank());
	assertEquals("A",dealer.dealersHand.get(1).getRank());
	
	dealer.checkAce();
	assertEquals(12,dealer.getDealerHandValue());
	
}
	
	//Test that J,Q,K count as 10
	public void testRanksValuedAt10()
	{
		Card Jack = new Card("S","J");
		Card Queen = new Card("S","Q");
		Card King = new Card("S","K");
		
		assertEquals(10, Jack.getValue());
		assertEquals(10, Queen.getValue());
		assertEquals(10, King.getValue());
	}
	
	//Test that a player can hit
	public void testPlayerHit()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);
		
		String tempRank = dealer.playersHand.get(1).getRank();
		String tempSuit= dealer.playersHand.get(1).getRank();
		assertEquals(2, dealer.playersHand.size());
		dealer.playerHit(deck);
		assertEquals(2, dealer.playersHand.size());
		assertNotSame(tempRank, dealer.playersHand.get(1).getRank());
		assertNotSame(tempSuit, dealer.playersHand.get(1).getSuit());
	}
	
	//Test that a players initial black jack is detected & Test that a dealers initial black jack is detected
	public void testPlayersBlackjack()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);
		
		dealer.dealerHandValues = 21;
		assertEquals(true,dealer.checkBlackJack());
		
		
		dealer.playerHandValues = 22;
		assertEquals(true,dealer.checkBlackJack());
	}
	
	//Test that the initial 2 cards of the dealer are visible
	public void testInitial2CardsOfDealerAreVisible()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);
		
		assertEquals(true,dealer.checkDealerHasInitialCards());
	}
	
	//Test that only one of the 2 cards of player are visible
	
	public void testInitial2CardsOfPlayerAreVisible()
	{
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);
		
		assertEquals(true,dealer.checkPlayerHasInitialCards());
	}
	
	//Test that a player can repeatedly hit
	
	//Test that a player can stand

	/*
		Test that the hand of a player 
		is displayed at the end of the players turn
	*/
	
	//Test that the player can bust which causes the dealer to win
	//Test if dealer has <= 16 it can hit
	
	//Test that if the dealer has a soft 17, he can hit
	
	//Test that the dealer can hit repeatedly
	//Test that at the end of the dealers turn his cards are visible
	
	//Test that if the dealer busts, a player wins
	
	//Test that scoring of players hand is displayed and is correct
	
	//Test that scoring of dealers hand is displayed and is correct	
}
