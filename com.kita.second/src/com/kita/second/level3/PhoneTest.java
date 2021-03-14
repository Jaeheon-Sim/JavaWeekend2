package com.kita.second.level3;

public class PhoneTest {
	public static void main(String[] args) {
		Phone i = new Apple(128);
		Phone g = new Samsung(256);
		
		i.printModel();
		i.callAi();
		i.printMemory();
		g.printModel();
		g.callAi();
		g.printMemory();
	}
}
