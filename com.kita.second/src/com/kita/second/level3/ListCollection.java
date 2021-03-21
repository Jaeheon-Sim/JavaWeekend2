package com.kita.second.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); 
		List<Dog> list2=new LinkedList<Dog>();
		
//		list1.add("gdfd");//삽입
//		boolean result2 = list1.set("dsf");//수정
//		String result=list1.get(0);//뽑아오기
//		System.out.println(result);
//		boolean result3=list1.remove("dsf");//삭제 
//		System.out.println(result3);
			
		list1.add("a");
		list1.add("B");
		list1.add("C");
		list1.add("d");
		list1.add("e");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
			
		}
		
		list1.set(2,"h");
		list1.remove(2);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
			
		}
		Dog n1 = new Dog("누렁이");
		Dog n2 = new Dog("흰둥이");
		Dog n3 = new Dog("얼룩이");
		list2.add(0,n1);
		list2.add(1, n2);                                                                                                                                                                                        
		list2.add(2,n3);
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i).name);
			
		}
		Dog n4 = new Dog("까망이");
		list2.set(2,n4);
		list2.remove(0);
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i).name);
			System.out.println(list2.get(i).getName());
		}
	}
		
	
}
