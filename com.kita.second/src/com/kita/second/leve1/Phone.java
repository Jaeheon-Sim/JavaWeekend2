package com.kita.second.leve1;

public class Phone {
     //필드(속성)
	String pName;
	private String owner;
	private String color;
	private int mem;
	String pNum;
	// 메소드(동작)
	//call(String person)
	
	//생성자
	//생성자가 정의되지 않았을 때만 컴파일러가 기본생성자 넣어줌
	public Phone(){}
	
	void setColor(String color) {
		this.color=color;
	}
	String getColor() {
		return color;
	}
	void setMem(int mem) {
		this.mem=mem;
	}
	int getMem() {
		return mem;
	}
	
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	String getowner() {
		return owner;
	}
	
	public Phone(String pName,String color,int mem){
//		pName = Name;
		this.pName=pName;
		this.color = color;
		this.mem=mem;
	}
	
	public Phone(String pName,String owner,String color, int mem, String pNum) {
		this.pName=pName;
		this.owner=owner;
		this.color=color;
		this.mem=mem;
		this.pNum=pNum;
	}
	
	void call(String person) {
		System.out.printf("%s에게 전화를 건다.\n",person);
	}
	 
	void message(String person) {
		System.out.printf("%s에게 %s가 문자를 보난다.\n",person,owner);
	}

}

 