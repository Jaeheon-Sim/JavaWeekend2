package com.kita.second.leve1.practice;

import java.util.Scanner;

public class Practice01 {
	//구구단 찍기
	public static void printGugu(int i) {
		for(int j=1;j<10;j++) {
			System.out.printf("%d * %d= %2d\n",i,j,j*i);
		}
	}
	public static void printGugu() {
		for(int j=1;j<10;j++) {
			System.out.printf("2 * %d= %2d\n",j,j*2);
		}
	}
	//오버로딩
	//매개변수의 개수 ,타입,위치
	
	
	//별찍기
	//입력하는 값에 따라 line()과 별개수가 달라지도록
	public static void intStars(int line,int stars) {
		
		for(int i = 0;i<line;i++) {
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public static int sum(int n1,int n2) {
		
		return n1+n2;
	}	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("라인 입력:");
		int line = scan.nextInt();
		System.out.print("개수 입력:");
		int stars = scan.nextInt();
		
		intStars(line,stars);
		scan.close();
		
	}
	
	
	
	
	
	
	
}
