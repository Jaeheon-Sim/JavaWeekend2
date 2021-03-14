package com.kita.second.level3;

public class Tv implements RemoteControl,Bluetooth {
	
	public int volume;
	
	public void turnOn() {
		System.out.println("Tv on");
	};
	
	public void connect() {
		System.out.println("tv에 블루투스 연결");
	}
	
	public void turnOff() {
		System.out.println("Tv off");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) 
		{
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME)
		{
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume=volume;
		}
		System.out.println("volume="+this.volume);
	}
	
}
