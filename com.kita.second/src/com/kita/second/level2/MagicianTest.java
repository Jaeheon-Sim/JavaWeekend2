package com.kita.second.level2;

public class MagicianTest {
	public static void main(String[] args) {
		
	Magician m = new Magician();
	m.attack();
	System.out.println(m.hp);
	m.teleport();
	m.jump();
	Adventurer a = new Adventurer();
	a.attack();
	Adventurer.a();
	}
}