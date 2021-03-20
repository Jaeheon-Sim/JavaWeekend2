package com.kita.second.level3;

public class AnonymousObject {
	
	public static void main(String[] args) {
		Parent p = new Childa();
		Childa c = (Childa)p;
		c.childmethod();
		p.parentmethod();
		
		Parent p2 = new Parent(){
			int childField;
			
			@Override
			void parentmethod() {
				
			}
			
			void childmethod() {
				
			}
		};
		
	}
	
}

class Parent{
	int parentField;
	
	void parentmethod() {
		
	}
	
}

class Childa extends Parent{
	
	int childField;
	
	@Override
	void parentmethod() {
		
	}
	
	void childmethod() {
		
	}
}
