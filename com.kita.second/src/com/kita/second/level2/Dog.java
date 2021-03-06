package com.kita.second.level2;

public class Dog extends Animal {
	boolean cutiness;
	
	public Dog(String name,int age) {
		super(name,age);
//		super(age);
		this.cutiness=true;
	}
	
	void bark() {
		System.out.println("짖는다");
	}
}
