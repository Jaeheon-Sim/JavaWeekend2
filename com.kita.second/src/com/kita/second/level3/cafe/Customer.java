package com.kita.second.level3.cafe;

public class Customer {
	
	public MenuItem order(Menu mi) {
		MenuItem cm = new MenuItem(mi.getName(),mi.getPrice());
		return cm;
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName()+"마신다");
	}
	
}
