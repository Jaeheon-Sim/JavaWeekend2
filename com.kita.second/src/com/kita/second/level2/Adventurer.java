package com.kita.second.level2;

public class Adventurer {
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
	static void a() {
		System.out.println("a");
	}
}
