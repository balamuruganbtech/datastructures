package com.app.matrix;

public class SpiralMatrix5 {
	public static void main(String[] args) {
		int n = 4;
		int ar[][] = new int[n][n];
		int num = 50;

		// pushing val
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = --num;
			}
		}

		System.out.println("::::::::::::::::::::::");

		// spiral
		for (int i = 0, j = 0, row = n, col = n; i < row && j < col; row--, col--, i++, j++) {
			// from first row
			for (int k = i; k < col; k++) {
				ar[i][k] = num--;
			}

			// from last col
			for (int k = i + 1; k < row; k++) {
				ar[k][col - 1] = num--;
			}

			// from last row
			for (int k = col - 2; k >= j; k--) {
				ar[row - 1][k] = num--;
			}

			// from down to up first column
			for (int k = row - 2; k > j; k--) {
				ar[k][j] = num--;
			}
		}
		
		// printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
