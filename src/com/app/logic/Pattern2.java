package com.app.logic;

public class Pattern2 {

	public static void main(String[] args) {

		String s = "BALA";
		int n = s.length();
		int r = 4, c = 2 * n - 1;
		char[][] ch = new char[r][c];

		for (int i = 0, j = c - 1, itr = n; i < j; i++, j--, itr--) {
			for (int k = 0; k < itr; k++) {
				ch[k][i] = s.charAt(k);
				ch[k][j] = s.charAt(k);
			}
		}
	}

}
