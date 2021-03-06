package com.kita.second.leve1;

public class ClassEX {
	//필드
	int field1;
	String field2;
	int[] field3;
	//생성자
	public ClassEX(int field1) {
		this.field1=field1;
	} 
	
	public ClassEX(int field1,String field2) {
		this(field1);
		this.field2=field2;
	}
	public ClassEX(int field1,String field2,int[] field3) {
		this(field1,field2);
		this.field3=field3;
	}
	//메소드
	int sum(int n1,int n2) {
		int result = n1+n2;
		return result;
	}
	
	int sum(int n1,int n2,int n3) {
		int result = sum(n1,n2)+n3;
		return result;
	}
	
	int sum1(int... arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}
	
	int sum(int[] arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}
	//매개변수 타입, 위치 개수//오버로딩
	
}
