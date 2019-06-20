package com.app;

public class NumberSystem {

	public static void main(String[] args) {
		int n=1000;
		
		int ar[] = new int[n+1]; 
		ar[1]=4;
		ar[2]=7;
		
		for(int i=3;i<=n;i++) {
			System.out.print(i+"--->"+i+"/"+2+"--->"+i/2+"--->");
			if(i%2!=0) {
				ar[i]=(ar[i/2]*10)+4;
			}else {
				ar[i]=(ar[(i/2)-1]*10)+7;
			}
			System.out.println(ar[i]);
		}
		
	}

}
