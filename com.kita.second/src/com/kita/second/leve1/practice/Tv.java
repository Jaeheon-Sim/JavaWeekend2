package com.kita.second.leve1.practice;

public class Tv {
	//필드
	boolean ispower;
	int chl;
	int vol;
	
	//생성자
	public Tv() {
		ispower = false;
		chl=1;
		vol=0;
	}
	
	//메소드
	
	void powerOn() {
		System.out.println("ON");
		ispower=true;
	}
	void powerOff() {
		System.out.println("OFF");
		ispower=false;
	}
	void chlUp() {
		chl++;
		System.out.println(chl);
	}

	void chldown() {
		chl--;
		System.out.println(chl);
		}

	void volUp() {
		vol++;
		System.out.println(vol);
		
	}

	void volDown() {
		vol--;
		System.out.println(vol);
		
	}
}
