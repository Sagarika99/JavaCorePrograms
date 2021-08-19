package com.bridgelabz.ObjectOrientedPrograms;

import java.util.*;

public class DeckOfCards {
	
	public String[] suits = {"Clubs","Diamonds", "Hearts", "Spades"};
	public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9","10","Jack", "Queen", "King", "Ace"};
	public String[] DeckofCards = new String[52];
	public int card=0;
	
	public void DeckofCards() {
		for (int i=0; i<suits.length;i++) {
			for (int j=0; j<ranks.length; j++) {
				DeckofCards[card] = ranks[j] + " of "+  suits[i];
				//System.out.println(DeckofCards[card]);
				card++;
			}
		}
	}
	
	public void Shuffle() {
		//System.out.println(DeckofCards.length);
		//System.out.println(suits.length*ranks.length);
		for (int i=0; i<DeckofCards.length; i++) {
			int rand = (int)(Math.random()*DeckofCards.length); //using random function
	        String temp = DeckofCards[i];
	        DeckofCards[i] = DeckofCards[rand];
	        DeckofCards[rand] = temp;//swapping and shuffling
	        //System.out.println(DeckofCards[i]);
	        }		
	}
	
	public void displayCards() {
		card=0;
		for (int i=0; i<suits.length;i++) {
			for (int j=0; j<ranks.length; j++) {
				System.out.println(DeckofCards[card]);
				card++;
			}		
		}
	}
	
	public void dealCards() {
		card = 0;
		for (int i=1; i<5; i++) {
			System.out.print("For Player " + i + ": \n");
			for (int j=0; j<9; j++) {
				System.out.print(DeckofCards[card] + " , ");
				card++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DeckOfCards cards = new DeckOfCards();
		cards.DeckofCards();
		cards.Shuffle();
		cards.displayCards();
		cards.dealCards();
	}
}