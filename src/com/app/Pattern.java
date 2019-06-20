package com.app;

public class Pattern {

	public static void main(String[] args) {

		String s = "geeksforgeeks";//ticketgoose,renaultnissan,geeksforgeeks
		int n = s.length();
		char ar[][] = new char[n][n];
		for(int i=0,j=n-1;i<n;i++,j--) {
			ar[i][i]=s.charAt(i);
			ar[j][i]=s.charAt(j);
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
	}

}
