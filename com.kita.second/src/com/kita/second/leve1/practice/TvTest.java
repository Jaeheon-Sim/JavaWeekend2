package com.kita.second.leve1.practice;

public class TvTest {
	public static void main(String[] args) {
		Tv mytv = new Tv();
		if(mytv.ispower==false) {
			mytv.powerOn();
		}
		
		
		for(int i=0;i<30;i++) {
			mytv.volUp();
		}
		System.out.println(mytv.vol);
		
		
		mytv.powerOff();
	}
}
