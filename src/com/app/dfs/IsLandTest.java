package com.app.dfs;

public class IsLandTest {

	static int mat[][] = {

			{ 0, 0, 0, 1, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 0, 0, 1 }, { 0, 0, 0, 0, 0, 1, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0 }

	};

	// No of rows and columns
	static final int ROW = 6, COL = 7;

	static boolean isSafe(int r, int c, boolean visited[][]) {
		return (r >= 0) && (r < ROW) && (c >= 0) && (c < COL) && mat[r][c] == 1 && !visited[r][c];
	}

	static int DFS(int r, int c, boolean visited[][]) {
		int size = 1;
		visited[r][c] = true;
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
		for (int k = 0; k < 8; k++) {
			int row = r + rowNbr[k];
			int col = c + colNbr[k];
			if (isSafe(row, col, visited)) {
				size += DFS(row, col, visited);
			}
		}
		return size;
	}

	static int countIsLand() {
		boolean visited[][] = new boolean[ROW][COL];
		int count = 0;

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (mat[i][j] == 1 && !visited[i][j]) {
					int size = DFS(i, j, visited);
					System.out.println("Size= " + size);
					++count;

				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countIsLand());
	}
}
