package com.kita.second.level3;

public class Samsung extends Phone{
	
	public Samsung(int memory) {
			super("Galaxy",memory,"빅스비");
		}
	
	@Override
	void printModel() {
		System.out.println(model);
	}
	
	 
	@Override
	void printMemory() {
		System.out.println(memory);
		
	}
	@Override
	void callAi() {
		System.out.println(ai);
	}


	









}

