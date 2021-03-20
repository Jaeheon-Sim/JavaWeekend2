package com.kita.second.blackjack;

public class Card {
	//52개
	//다이아 하트 스페이드 클럽
	//a 2~10 k q j 한개당 4+9=13개
	
	private String pattern;
	private String num;
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	
}
