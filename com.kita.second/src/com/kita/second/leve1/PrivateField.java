package com.kita.second.leve1;

public class PrivateField {
	public String getField2() {
		return field2;
	}

	private int field1;
	private String field2;
	
	PrivateField(int field1,String field2){
		this.field1 = field1;
		this.field2= field2;
	}
	
	void setField1(int field1){
		this.field1=field1;
	}
	
	int getField1(){
		return field1;
	}
	
	void setField2(String field2) {
		this.field2=field2;
	}
	
	String getfield2() {
		return field2;
	}
	
}
