package com.kita.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDec {
	
	private List<Card> arr= new ArrayList<>();
	
	
	public int cardPicker() {
		int card = (int)(Math.random()*(52-0+1)+1);
		return card;
	}
	
	
}
