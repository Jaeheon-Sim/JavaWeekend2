package com.kita.second.level3;

public abstract class Animal {

		String name;
		int age;
		
		
		public Animal(String name) {
			this.name=name;
			
		}
		
		
		
		void bark() {
				
			System.out.println("짖는다");
		}
		
		void cry() {
			System.out.println("운다");
		}

		
		
	
}
