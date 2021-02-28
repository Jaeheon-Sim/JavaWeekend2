package com.kita.second.leve1;

import java.util.Scanner;

public class MacBook {
	//메모리,가격,색상,
	//웹서핑,코딩,
	//메모리만 , 메모리+가격,메모리+색상,메모리 가격 색상

	int memory;
	int price;
	String color;
	
	public MacBook(int memory) {
		this.memory = memory;
	}
 
	public MacBook(int memory, String color) {
		this.memory = memory;
		this.color = color;
	}

	public MacBook(int memory,int price) {
		this.memory = memory;
		this.price = price;
	}

	public MacBook(int memory, int price, String color) {
		this.memory = memory;
		this.price = price;
		this.color = color;
	}
	
	void webSurf() {
		System.out.println("웹서핑중");
	}
	
	void coding() {
		System.out.println("코딩중");
	}
	
	void email() {
		Scanner scan = new Scanner(System.in);
		System.out.println("누구한테?");
		String who =scan.nextLine();
		System.out.printf("%s에게 이메일 보내는중\n",who);
		scan.close();
	}
	
}
