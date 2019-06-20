package com.app;

public class TestNumberSeries {
	
	static void numSeries(int n) {
		int ar[] = new int[n+1];
		ar[1]=4;
		ar[2]=7;
		for(int i=3;i<=n;i++) {
			if(i%2!=0) {
				ar[i]=(ar[i/2]*10)+4;
			}else {
				ar[i]=(ar[(i/2)-1]*10)+7;
				
			}
			System.out.println(i+"-->"+ar[i]);
		}
	}

	public static void main(String[] args) {
		numSeries(1028);
	}

}
