package core;

public class ArithmeticSolver{
	
	 public double add(Card firstCard, Card secondCard)
	{
		String value = 0;
		 
		value = firstCard.getSuit() + secondCard.getSuit();
		
		return value;
	}
	

}