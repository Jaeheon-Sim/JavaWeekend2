package com.kita.second.level3;

import java.util.Scanner;

public class TryCatch {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2 };
		
		try {
			//에러 코드
			System.out.println(arr[2]);
		}catch(NullPointerException e) {
			System.out.println("널포인터 예외");
				
		}
		catch(Exception e){
			//예외 발생 시 처리 코드
			System.out.println("XXXXXXXXXXXXX");
		}
		//없어도 댐
		finally {
			System.out.println("END");
		}
		System.out.println(arr[1]);

		
		Scanner scan = new Scanner(System.in);
		int num;
	
		String strNum = scan.next();
		
		try {
			num = Integer.parseInt(strNum);
			arr[2]=num;
		}catch(NumberFormatException e){
			System.out.println("x");	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("X");
		}catch(Exception e) {
			System.out.println("X");
			
		}
		
		
	}
}
