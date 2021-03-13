package com.kita.second.level2;

public class Drama extends Netflix {

	
	public Drama(int maxChapter) {
		super(maxChapter);
	}
	
	@Override
	boolean watch() {
		++chapter;
		if(chapter<=maxChapter) {
			System.out.println("드라마 본다");
			return true;
		}
		System.out.println("이미 다 봤다");
		return false;
	}
}
                                                                                                                                                