package com.kita.second.blackjack;

public class Card {
	//52개
	//다이아 하트 스페이드 클럽
	//a 2~10 k q j 한개당 4+9=13개
	
	public final static String[] patterns= {"스페이드","하트","클로버","다이아"};
	private final String pattern;
	private final String denomination;
	private final int point;
	//카드 생성자로 값 매개변수 받아넣기
	// 게터 메소드 만드기
	//
	
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
