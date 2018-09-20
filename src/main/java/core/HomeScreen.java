package core;

import java.io.*;

import java.util.Scanner;

public class HomeScreen {
	private int aceInHand = 0;
	protected String input;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Console(c) or file(f):");
		String input = scanner.nextLine();

		FileReader in = null;

		if (input.equals("c")) {
			Deck deck = new Deck();
			Dealer dealer = new Dealer(deck);

			System.out.println(
					"Players Cards: " + dealer.playersHand.get(0).getSuit() + dealer.playersHand.get(0).getRank() + ", "
							+ dealer.playersHand.get(1).getSuit() + dealer.playersHand.get(1).getRank());
			
			System.out.println(
					"Dealers Card: " + dealer.dealersHand.get(0).getSuit() + dealer.dealersHand.get(0).getRank());
			
			if (dealer.checkBlackJack()) {
				System.out.print("BlackJack.");
				System.out.print("Player: Hit(h) or Stand(s):");
				String newInput = scanner.nextLine();

				if (newInput.equals("h")) {
					dealer.playerHit(deck);
					dealer.dealerHit(deck);
					System.out.print("Player: Hit(h) or Stand(s):");
					String newestInput = scanner.nextLine();
					if (newestInput.equals("h")) {
						dealer.playerHit(deck);
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					} else if (newestInput.equals("s")) {
						dealer.playerStand();
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					}

				} else if (newInput.equals("s")) {
					dealer.playerStand();
					dealer.dealerHit(deck);
					System.out.print("Player: Hit(h) or Stand(s):");
					String newestInput = scanner.nextLine();
					if (newestInput.equals("h")) {
						dealer.playerHit(deck);
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					} else if (newestInput.equals("s")) {
						dealer.playerStand();
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					}
				}

			} else {
				System.out.print("Player: Hit(h) or Stand(s):");
				String newInput = scanner.nextLine();

				if (newInput.equals("h")) {
					dealer.playerHit(deck);
					dealer.dealerHit(deck);
					System.out.print("Player: Hit(h) or Stand(s):");
					String newestInput = scanner.nextLine();
					if (newestInput.equals("h")) {
						dealer.playerHit(deck);
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					} else if (newestInput.equals("s")) {
						dealer.playerStand();
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					}

				} else if (newInput.equals("s")) {
					dealer.playerStand();
					dealer.dealerHit(deck);
					System.out.print("Player: Hit(h) or Stand(s):");
					String newestInput = scanner.nextLine();
					if (newestInput.equals("h")) {
						dealer.playerHit(deck);
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					} else if (newestInput.equals("s")) {
						dealer.playerStand();
						if (!dealer.checkBlackJack()) {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("No Winner!");
						} else {
							System.out.println("-----------");
							dealer.getCards();
							System.out.println("Winner!");
						}
					}
				}

			}

		} else if (input.equals("f")) {

			try {
				in = new FileReader(
						"/Users/davidaraya/eclipse-workspace/COMP3004A1/src/main/resources/BlackJackGame.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Please try again");

		}
	}
}
