package com.kita.second.level3;

public class RCTest {
	
	public static void main(String[] args) {
		RCUser user = new RCUser();
		user.rc.turnOn();
		RCUser user2 = new RCUser(new Audio());
		user2.rc.turnOn();
		user2.rc.setVolume(5);
		
		
		
	
	}
}
