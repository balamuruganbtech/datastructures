package com.app;

public class Pattern3 {

	/*
	 
	      *
		 ***
		*****
		 ***
		  *
	 */

	public static void main(String[] args) {
		String s="balamuruganramya";
		int n = s.length();
		for (int i = 0, j = n; i < n; i++, j--) {
			for (int k = 0; k < j; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(s.charAt(i) + " ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 0; i--) {
			for (int k = i; k < n; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}
	}

}
