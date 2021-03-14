package com.kita.second.level3;

public abstract class Phone {
	
	String model;
	int memory;
	String ai;
	
	public Phone(String model,int memory, String ai){
		this.model=model;
		this.ai=ai;
		this.memory=memory;
	}
	
	abstract void printModel();
	abstract void printMemory();
	abstract void callAi();

	
	
	
	
	
	

}
