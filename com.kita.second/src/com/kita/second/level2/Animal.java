package com.kita.second.level2;

public class Animal {
	String name;
	int age;
	private String type;
	
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	void bark() {
		
		
		System.out.println("짖는다");
	}
	
	void cry() {
		System.out.println("운다");
	}

	
	
}
