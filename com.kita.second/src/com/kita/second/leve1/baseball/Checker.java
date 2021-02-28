package com.kita.second.leve1.baseball;

public class Checker {
	
	static int cnt=0;
	
	public static void	check(int[] inarr,int[] randomarr) {
		int strike = 0;
		while(strike != 3) {
			MyBall.inputarr(inarr);
			strike=Checker.realcheck(inarr,randomarr);
			cnt++;
		}	
	}
	
	public static void endPrint() {
		System.out.println("!!!!!!!!!!!!!!");
		System.out.println(cnt+"번걸림");
	}
	
	public static int realcheck(int inarr[],int ranarr[]) {
		int strike=0;
		int ball=0;
		for(int i =0;i<ranarr.length;i++) {
			for(int j=0;j<ranarr.length;j++) {
				
				if(inarr[i]==ranarr[j]&&i==j) {
						strike+=1;
					} 
				if(inarr[i]==ranarr[j]&&i!=j){
						ball+=1;
					}
				}	
			}
			
		System.out.println("strike:"+strike+" ball:"+ball+" out:"+(3-(ball+strike)));
		return strike;
	}
}
