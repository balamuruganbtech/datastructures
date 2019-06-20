package com.app;

public class Matrix1 {

	static char ar[][] = { { 'w', 'e', 'l', 'c', 'o' }, { 'm', 'e', 't', 'o', 't' }, { 'i', 'c', 'k', 'e', 't' },
			{ 'g', 'o', 'o', 's', 'e' }, { 'w', 'o', 'w', ' ', ' ' } };

	static int n = 5;

	static String s = "elco";

	static String result = "";

	String row(int row, int col, int counter) {
		int nextCol = 1 + col;
		if (nextCol < n && nextCol >= 0 && row < n && row >= 0 && counter<s.length()) {
			if (ar[row][nextCol] == s.charAt(counter)) {
				result += ar[row][nextCol];
				row(row, nextCol, ++counter);
			}
		}else {
			return "";
		}
		return result;
	}
	
	String col(int row, int col, int counter) {
		int nextRow = 1 + row;
		if (nextRow < n && nextRow >= 0 && row < n && row >= 0 && counter<s.length()) {
			if (ar[nextRow][col] == s.charAt(counter)) {
				result += ar[nextRow][col];
				col(nextRow, col, ++counter);
			} 
		}else {
			return "";
		}
		return result;
	}

	void performTask() {
		outer: for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (s.charAt(0) == ar[i][j]) {
					// row checks
					result = "";
					result += s.charAt(0);
					row(i, j, 1);
					if (result.equals(s)) {
						System.out.println("Occured in Row("+i+","+j+") --> Wow congrats !");
						break outer;
					}
					
					// col checks
					result = "";
					result += s.charAt(0);
					col(i, j, 1);
					if (result.equals(s)) {
						System.out.println("Occured in col("+i+","+j+") --> col congrats !");
						break outer;
					}
				}

			}

		}
	
		System.out.println("result= " + result);
	}

	public static void main(String[] args) {
		Matrix1 m1 = new Matrix1();
		m1.performTask();
	}

}
