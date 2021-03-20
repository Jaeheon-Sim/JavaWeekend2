package com.kita.second.blackjack;

public class Game {
	
	public static void newGame() {
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		Card card = new Card();
		Rule rule = new Rule();
		CardDec cardDec = new CardDec();

	}
	
	public static void game() {
		newGame();
	}
	
	 public static void main(String[] args) {
		Game game = new Game();
		 Game.game();
		
		
		
	}
}
