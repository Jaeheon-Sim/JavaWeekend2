package com.kita.second.leve1.baseball;

public class Baseball {
	
	public static void random(int randomarr[]) {
		
		for(int i=0;i<randomarr.length;i++){
			randomarr[i]=(int)(Math.random()*10+1);
			for(int j=0;j<i;j++) {
				while(true) {
					if(randomarr[i]==randomarr[j]){
						randomarr[i]=(int)(Math.random()*10+1);
					}else {
							break;
					}
				}
			}
		}
	}
}
