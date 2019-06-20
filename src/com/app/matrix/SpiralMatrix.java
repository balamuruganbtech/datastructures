package com.app.matrix;

public class SpiralMatrix {
	public static void main(String[] args) {
		int n = 4;
		int ar[][] = new int[n][n];
		int num = 10;

		// pushing val
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = ++num;
			}
		}

		// printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("::::::::::::::::::::::");
		// spiral
		for (int i = 0, j = 0, row = n, col = n; (i < row && j < col); row--, col--, i++, j++) {
			for (int k = i; k < col; k++) {
				System.out.print(ar[i][k] + ", ");
			}
			for (int k = i + 1; k < row; k++) {
				System.out.print(ar[k][col - 1] + ", ");
			}
			for (int k = col - 2; k >= j; k--) {
				System.out.print(ar[row - 1][k] + ", ");
			}
			for (int k = row - 2; k > i; k--) {
				System.out.print(ar[k][j] + ", ");
			}
		}

	}
}
