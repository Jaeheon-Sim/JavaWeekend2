package com.kita.second.level3.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Coffee(MenuItem mi) {
		name = mi.getName();
		price = mi.getPrice();
	}
	
}
