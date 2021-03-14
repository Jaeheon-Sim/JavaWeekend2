package com.kita.second.level3.cafe;

public class MenuItem{
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public MenuItem(String name,int price) {
		this.name= name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%,d원",name,price);
	}
	
}
