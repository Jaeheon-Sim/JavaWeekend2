package com.kita.second.level2;

public class Netflix {
	int chapter = 0;
	int maxChapter;
	
	
	
	public Netflix(int maxChapter) {
		this.maxChapter=maxChapter;
	}
	
	boolean watch() {
		++chapter;
		if(chapter<=maxChapter) {
			System.out.println("넷플릭스 본다");
			return true;
		}
		System.out.println("이미 다 봤다");
		return false;
	}
}
