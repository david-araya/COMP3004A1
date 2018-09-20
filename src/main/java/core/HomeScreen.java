package core;

import java.util.Scanner;

public class HomeScreen {
	private int aceInHand = 0;
	
	private static Scanner scanner = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		System.out.print("Console(c) or file(f):" );
		String input = scanner.nextLine();
		System.out.println("input = " + input);
		
		if(input.equals("c"))
		{
			Deck deck = new Deck();
			Dealer dealer = new Dealer(deck);
			
		} else if (input.equals("f"))
		{
			System.out.println("hello2");
		} else {
			System.out.println("Please try again");
			
		}
	}
	
	
}
