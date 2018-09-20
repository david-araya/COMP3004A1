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
			
			

		} else if (input.equals("f")) {
			
			try {
				in = new FileReader("/Users/davidaraya/eclipse-workspace/COMP3004A1/src/main/resources/BlackJackGame.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}else{
		System.out.println("Please try again");

	}
}}
