package com.kita.second.level2;

public class Cat extends Animal {
	
	
	public Cat(String name, int age) {
		super(name,age);
		
	}
	
	@Override
	void cry() {
		System.out.println("고양이가 운다");
	}
	
}
