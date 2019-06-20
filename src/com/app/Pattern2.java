package com.app;

public class Pattern2 {

	/*
	 
	      *
		 ***
		*****
		 ***
		  *
	 */
	public static void printTriagle(int n) {
		// number of spaces
		int k = 2 * n - 2;
		for (int i = 0; i < n; i++, k--) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
//		printTriagle(3);
		int n = 5;
		char ch ='#';
		for (int i = 0, k = n; i < n; i++, k--) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		for (int i = n, k = n; i >= 0; i--) {
			for (int j = i; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
