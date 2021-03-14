package com.kita.second.level3;

public interface RemoteControl {
	public final int MAX_VOLUME = 10;
	public final int MIN_VOLUME = 0;
	
	abstract public void turnOn();
	public void turnOff();
	abstract public void setVolume(int volume);
	
}
