package com.kita.second.level2;

public class AnimalTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("assd",4);
		System.out.println(d1.name);
		d1.cry();
		d1.bark();
		Animal cat1 = new Animal("342",2);
		cat1.cry();
		cat1 = new Dog("aa",3);
		cat1.cry();
		Dog d = (Dog)cat1;
		d.bark();
		cat1 = new Cat("aa",3);
		cat1.cry();
		
		
	}
}
