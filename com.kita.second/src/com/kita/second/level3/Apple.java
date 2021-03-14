package com.kita.second.level3;

public class Apple extends Phone{
	
	public Apple(int memory) {
		super("iphone",memory,"siri");
	}
	
	@Override
	void printModel() {
		System.out.println(model);
	}
	@Override
	void printMemory() {
		System.out.println(memory);
		
	}
	@Override
	void callAi() {
		System.out.println(ai);
	}
}
