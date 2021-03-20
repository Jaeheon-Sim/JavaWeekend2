package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	
	public MenuItem order(Menu m) {
		m.showMenus();
		
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		
		while(mi == null) {
			System.out.println("input menu");
			int idx = scan.nextInt();
			if(idx>=1 && idx <=4 ) {
				mi=m.choose(idx-1);
			}else {
				System.err.println("wrong");
			}
		}
		scan.close();
		return mi;
	}
	
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(을)를 마신다.");
		
	}

}
