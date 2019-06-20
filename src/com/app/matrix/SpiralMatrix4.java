package com.app.matrix;

public class SpiralMatrix4 {
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

		// printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("::::::::::::::::::::::");

		// spiral
		for (int i = 0, j = 0, row = n, col = n; i < row && j < col; row--, col--, i++, j++) {
			// from first row
			for (int k = i; k < col; k++) {
				System.out.print(ar[i][k] + ", ");
			}

			// from last col
			for (int k = i + 1; k < row; k++) {
				System.out.print(ar[k][col - 1] + ", ");
			}

			// from last row
			for (int k = col - 2; k >= j; k--) {
				System.out.print(ar[row - 1][k] + ", ");
			}
			
			// from down to up first column
			for(int k=row-2;k>j;k--) {
				System.out.print(ar[k][j] + ", ");
			}
		}

	}
}
