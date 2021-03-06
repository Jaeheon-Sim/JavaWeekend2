package com.kita.second.leve1.practice;

public class Adventurer {
	//필드 
	int str;
	int dex;
	int intel;
	int luck;
	int hp;
	//생성자
	public Adventurer() {
		str=10;
		dex=10;
		intel=10;
		luck=10;
		hp=10;
	}
	public Adventurer(int str,int dex) {
		this.str=str;
		this.dex=dex;
	}
	
	//메소드
	public void attack() {
		System.out.println("공격");
	}
	
	public void jump() {
		System.out.println("점프");
	}
	
}
