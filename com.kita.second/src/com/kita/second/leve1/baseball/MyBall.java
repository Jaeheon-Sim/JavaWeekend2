package com.kita.second.leve1.baseball;

import java.util.Scanner;

public class MyBall {
	
	public static void inputarr(int arr[]) {
		
		Scanner scan = new Scanner(System.in);

		for(int i=0;i<3;i++) {
			System.out.print("입력:");
			arr[i]=scan.nextInt();
		}
	} 
}
