package com.app;

class Solution {
	static int sumofBoxPerimiter(int r, int c, int nR, int nC, int grid[][]) {
		int count = 0;

		int prevRow = r - 1;
		int prevCol = c - 1;

		int nextRow = r + 1;
		int nextCol = c + 1;

		// visit previousRow && nextRow checks
		if ((prevRow == -1 || prevRow < nR) || (nextRow >= nR || nextRow < nR)) {
			if (prevRow == -1 || nextRow >= nR) {
				count++;
			}
			if (prevRow >= 0) {

				if (grid[r - 1].length >= grid[r].length && grid[r - 1][c] == 0) {
					count++;
				}
			}
			if (nextRow < nR) {
				if (grid[r + 1].length <= grid[r].length && grid[r + 1][c] == 0) {
					count++;
				}
			}
		}

		// visit previousCol && nextCol checks
		if ((prevCol == -1 || prevCol < nC) || (nextCol >= nC || nextCol < nC)) {
			if ((prevCol == -1) || (nextCol >= nC)) {
				count++;
			}
			if (prevCol >= 0) {
				if (grid[r][c - 1] == 0) {
					count++;
				}
			}
			if (nextCol < nC) {
				// System.out.println("len+1="+grid[c+1].length + ", len="+grid[c].length);
//				System.out.println(r + ", " + c);
				if (grid[r][c + 1] == 0) {
					count++;
				}
			}
		}
		return count;
	}

	/*
	 * Your implementation goes here.
	 */
	public static int islandPerimeter(int[][] grid) {
		int r = grid.length;
		int result = 0;

		for (int i = 0; i < r; i++) {
			int c = grid[i].length;
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					result += sumofBoxPerimiter(i, j, r, c, grid);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] grid = {
				/*
						{1},
						{0,1,0,0,1},
						{1,1,1,0},
						{0,1,0,0},
						{1,1,0,0},
				*/
				// { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
				
		};
		System.out.println(islandPerimeter(grid));
	}

}