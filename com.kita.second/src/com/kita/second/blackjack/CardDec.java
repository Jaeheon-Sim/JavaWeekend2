package com.kita.second.blackjack;

public class CardDec {
	
	int[] cardDec = new int[52];
	
	public int cardPicker() {
		int card = (int)(Math.random()*(52-0+1)+1);
		return card;
	}
	
	
}
