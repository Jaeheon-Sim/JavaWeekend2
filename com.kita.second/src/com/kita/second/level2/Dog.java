package com.kita.second.level2;

public class Dog extends Animal {
	boolean cutiness;
	
	public Dog(String name,int age) {
		super(name,age);
//		super(age);
		this.cutiness=true;
		
	}
	@Override
	void cry() {
		System.out.println("개가 운다");
	}
	void bark() {
		System.out.println("짖는다");
	}
	
	
}
