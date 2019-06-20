package com.app;

public class IslandPermiter {

	static void copyDataFromOldToNew(int oldGrid[][], int newGrid[][]) {
		for (int i = 0; i < oldGrid.length; i++) {
			int tempCol = oldGrid[i].length;
			for (int j = 0; j < tempCol; j++) {
				newGrid[i][j] = oldGrid[i][j];
			}
		}
	}

	static int identifyMaxColumn(int grid[][]) {
		int c = 0;
		for (int i = 0; i < grid.length; i++) {
			c = (c < grid[i].length) ? grid[i].length : c;
		}
		return c;
	}

	static int isLandPermeter(int r, int c, int nR, int nC, int[][] grid) {
		int prevRow = r - 1;
		int nextRow = r + 1;

		int prevCol = c - 1;
		int nextCol = c + 1;

		int count = 0;
		if (prevRow == -1 || grid[prevRow][c] == 0) {
			++count;
		}

		if (nextRow == nR || grid[nextRow][c] == 0) {
			++count;
		}

		if (prevCol == -1 || grid[r][prevCol] == 0) {
			++count;
		}

		if (nextCol == nC || grid[r][nextCol] == 0) {
			++count;
		}
		return count;
	}

	public static void main(String[] args) {
		// input 1 - {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};

		// input 2 - { { 1 }, { 0, 1, 0, 0, 1 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1,
		// 0, 0 },{1} }

		// input 3 - { { 1,1,1 }, { 1, 1 }, { 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1,
		// 1},{1} };

		int grid[][] = { { 1 }, { 1, 1, 1 }, { 1, 1 }, { 1, 1, 1 },{1}, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1 } };
		int r = grid.length;

		// identify the max column to separate water and land
		int c = identifyMaxColumn(grid);

		int newGrid[][] = new int[r][c];

		// copy the data from old grid to new grid for better understanding
		copyDataFromOldToNew(grid, newGrid);

		int result = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (newGrid[i][j] == 1) {
					result += isLandPermeter(i, j, r, c, newGrid);
				}
			}
		}
		System.out.println(result);

	}

}
