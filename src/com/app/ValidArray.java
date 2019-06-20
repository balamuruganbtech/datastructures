package com.app;

public class ValidArray {

	public static void main(String[] args) {
		//2, 2, 0, 4, 0, 8
//		int ar[]= {2,2,0,4,0,8};
		int ar[]= {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		int n = ar.length;
		
		for(int i=0;i<n;i++) {
			if(i+1<n) {
				if(ar[i]==ar[i+1]) {
					ar[i]=ar[i]*2;
					ar[i+1]=0;
				}
			}
		}
		
		for(int i=0, counter=0;i<n;i++) {
			if(ar[i]!=0) {
				int temp=ar[i];
				ar[counter]=temp;
				ar[i]=0;
				++counter;
			}
		}
		
		//4 4 8 0 0 0
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
	}

}
