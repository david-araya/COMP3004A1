package core;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase{
	/*
   	public double add(double leftOperand, double rightOperand)
	{
		return leftOperand + rightOperand;
	}
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();

		assertEquals(4.0, solver.add(2, 2)); // 2 + 2 = 4
	}
	*/
	
	public void testSize()
	{
		Deck deck = new Deck();
		assertEquals(52,deck.getSize());
	} 
	
	//Test that there are 52 cards
	// Test shuffling
	//Test that you can select (f) input
	//Test that you can select (c) input
	
	//Test that you offer a choice between c and f input
	
	//Test that the initial 2 cards of the player are visible
	//Test that only one of the 2 cards of dealer are visible
	
	//Test that a player can hit
	
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
	
	//Test an ace can count as 1 or 11
	
	/*
	Test that if you have two aces in the same hand, 
	one counts as 11 and the other counts 1
	*/
	
	//Test that ace can count as 1
	
	//Test that ace can count as 11
	
	//Test that a hand can count two aces worth 1 each
	//Test that J,Q,K count as 10
	
	//Test that a players initial black jack is detected
	//Test that a dealers initial black jack is detected
	
	//Test that scoring of players hand is displayed and is correct
	//Test that scoring of dealers hand is displayed and is correct
	
}
