package com.app.dfs;

/*
 * Algorithm's to solve connected cells using DFS
 */
public class IslandPuzzle {

	static int mat[][] = {

			{ 0, 0, 0, 1, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 0, 0, 1 }, { 0, 0, 0, 0, 0, 1, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0 }

	};

	static int getRegionSize(int row, int col) {
		if (row < 0 || col < 0 || row >= mat.length || col >= mat[row].length) {
			return 0;
		}
		if (mat[row][col] == 0) {
			return 0;
		}
		mat[row][col] = 0;
		int size = 1;
		for (int r = row - 1; r <= row + 1; r++) {
			for (int c = col - 1; c <= col + 1; c++) {
				if (r != row || c != col) {
					size += getRegionSize(r, c);
				}
			}
		}
		return size;

	}

	static int getBiggerRegion() {
		int maxRegion = 0;
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				if (mat[row][col] == 1) {
					int size = getRegionSize(row, col);
					System.out.println("size =  " + size);
					maxRegion = Math.max(maxRegion, size);
				}
			}
		}
		return maxRegion;
	}

	public static void main(String[] args) {
		System.out.println(getBiggerRegion());
	}

}
