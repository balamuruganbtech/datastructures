package com.app.logic;

public class Pattern {

	public static void main(String[] args) {

		String s = "BALA";
		int n = s.length();
		int r = n, c = (2 * n) - 1;
		char ar[][] = new char[r][c];
		for (int i = 0, j = c - 1, count = 0, itr = n; i <= j; i++, j--, itr--, count++) {
			char ch = s.charAt(count);
			for (int k = 0; k < itr; k++) {
				ar[k][i] = ch;
				ar[k][j] = ch;
			}
		}

		for (int x = 0; x < r; x++) {
			for (int y = 0; y < c; y++) {
				System.out.print(ar[x][y]);
			}
			System.out.println();
		}
	}

}
