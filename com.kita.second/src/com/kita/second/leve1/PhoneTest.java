package com.kita.second.leve1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Phone myPhone = new Phone();
		myPhone.call("엄마");
		//myPhone.color = "blue";
		myPhone.pName = "iphone 12";
//		myPhone.owner= "sim";
		//myPhone.mem = 512;
		Phone p1 = new Phone("갤럭시","빨",256);
	
		p1.setOwner("simss");
		String p1owner = p1.getowner();
		System.out.println(p1owner);
		p1.setMem(2443);
		int p1Mem=p1.getMem();
		System.out.println(p1Mem);
		p1.setColor("sdfsdfsdfsd");
		String p1color=p1.getColor(); 
		System.out.println(p1color);
		scan.close();
	}
}
