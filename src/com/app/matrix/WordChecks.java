package com.app.matrix;

public class WordChecks {
	static char ar[][] = { { 'w', 'e', 'l', 'c', 'o' }, 
						   { 'm', 'e', 't', 'o', 't' }, 
						   { 'i', 'c', 'k', 'e', 't' },
						   { 'g', 'o', 'o', 's', 'e' }, 
						   { 'w', 'o', 'w', ' ', ' ' } 
						 };

	static int n = 5;

	static String s = "wow";

	static String result = "";

	static String rowChecks(int r, int c, int count) {
		int nextCol = c + 1;
		if (nextCol < n && nextCol >= 0 && r < n && r >= 0 && count < s.length()) {
			char ch = s.charAt(count);
			if (ar[r][nextCol] == ch) {
				result += ch;
				rowChecks(r, nextCol, ++count);
			} else {
				return "";
			}

		} else {
			return "";
		}
		return result;
	}

	static String colChecks(int r, int c, int count) {
		int nextRow = r + 1;
		if (c < n && c >= 0 && nextRow < n && nextRow >= 0 && count < s.length()) {
			char ch = s.charAt(count);
			if (ar[nextRow][c] == ch) {
				result += ch;
				colChecks(nextRow, c, ++count);
			} else {
				return "";
			}

		} else {
			return "";
		}
		return result;
	}

	public static void main(String[] args) {

		outer: for (int i = 0; i < n; i++) {
			inner: for (int j = 0; j < n; j++) {
				if (s.charAt(0) == ar[i][j]) {
					result += s.charAt(0);
					rowChecks(i, j, 1);

					if (result.equals(s)) {
						System.out.println("Occured in Row(" + i + "," + j + ") --> Wow congrats !");
						break outer;
					}

					colChecks(i, j, 1);
					if (result.equals(s)) {
						System.out.println("Occured in Row(" + i + "," + j + ") --> Wow congrats !");
						break outer;
					}
				}
			}
		}
	}

}
