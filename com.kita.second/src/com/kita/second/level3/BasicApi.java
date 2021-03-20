package com.kita.second.level3;

public class BasicApi {
	public static void main(String[] args) {
		String str1="자바 프로그래밍";
		char c1 =str1.charAt(3);
		System.out.println(c1);
		String addr = "123456-3456346";
		char i= addr.charAt(7);
		int a = (int)addr.charAt(8);
		char b = '1';
		int a1 = (int)b;
		System.out.println(a1);
		switch(i) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;		
		}
		
		String str2= "자바프로그래밍";

		boolean result1 = str2.equals(str1);
		System.out.println(result1);
	
		int idx1 = str1.indexOf("밍");
		System.out.println(idx1);
	
		String str3 = "안녕하세요";
		int idx2 = str3.indexOf("안녕");
		if(idx2 == -1) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
		}else {
			System.out.printf("안녕은 %d에 있습니다\n",idx2);
		}
		
		
		
		int len = str3.length();
		System.out.println("len 길이:"+len);
		
		String str4 = "오늘은 날씨가 좋다";
		String result2 = str4.replace("날씨가", "기분이");
		System.out.println(result2);
		System.out.println(str4);
		
		String result3 = str4.substring(4);
		System.out.println(result3);
		String result4 = str4.substring(4,7);
		System.out.println(result4);
		
		String str5= "hello";
		String result6 = str5.toUpperCase();
		System.out.println(result6);
		
		String str6 = "            java     ";
		String result7 = str6.trim();
		System.out.println(str6);
		System.out.println(result7);
		
		int num = 5;
		double num2 = 3.4;
		
		String str7 = String.valueOf(num2);
		System.out.println(str7);
		
		double r= Math.random();
		//int rNum= (int)(Math.random()*(max-min+1)+1);
		int d1 = (int)Math.ceil(5.6);
		System.out.println(d1);
	
		double d2 = Math.floor(7.3);
		System.out.println(d2);
		
}
}
