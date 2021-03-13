package com.kita.second.level2;

public class Movie extends Netflix {
	
	public Movie(int maxChapter) {
		super(maxChapter);
	}
	
	
	@Override
	boolean watch() {
		++chapter;
		if(chapter<=maxChapter) {
			System.out.println("영화 본다");
			return true;
		}
		System.out.println("영화 이미 다 봤다");
		return false;
	}
}
