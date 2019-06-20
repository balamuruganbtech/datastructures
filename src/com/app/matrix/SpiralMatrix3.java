package com.app.matrix;

public class SpiralMatrix3 {

	public static void main(String[] args) {
		int n = 5;
		int row = n;
		int col = n;
		int count = 9;
		int visit=0;

		int ar[][] = new int[row][col];
		for (int i = 0, j = 0; i < row && j < col; i++, j++, row--, col--) {
			// for left to right row
			for (int k = i; k < col; k++) {
				ar[i][k] = ++count;
			}
			// for top to bottom col
			for (int k = i + 1; k < row; k++) {
				ar[k][col - 1] = ++count;
			}
			// for right to left row
			for (int k = col - 2; k >= j; k--) {
				ar[row - 1][k] = ++count;
			}
			// for bottom to top col
			for (int k = row - 2; k > i; k--) {
				ar[k][j] = ++count;
			}
			System.out.println("visit="+(++visit));
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
