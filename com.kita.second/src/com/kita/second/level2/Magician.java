package com.kita.second.level2;

public class Magician extends Adventurer{
	int mp;
	
	public Magician() {
		super();
		mp=10;
	}
	
	@Override
	public void attack() {
		System.out.println("마법공격");
	}
	public void teleport() {
		System.out.println("텔레포트");
	}
}
