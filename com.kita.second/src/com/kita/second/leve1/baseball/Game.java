package com.kita.second.leve1.baseball;

public class Game {
	
	public static void main(String[] args) {
		
		
		int[] randomarr= {0,0,0};
		int[] inarr= {0,0,0};
		
		Baseball.random(randomarr);
		Checker.check(inarr, randomarr);
		Checker.endPrint();
	}
}
