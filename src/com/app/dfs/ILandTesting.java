package com.app.dfs;

public class ILandTesting {

	static int mat[][] = {

			{ 0, 0, 0, 1, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 0, 0, 1 }, { 0, 0, 0, 0, 0, 1, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0 }

	};

	static int ROW = 6, COL = 7;

	static boolean isSafe(int r, int c, boolean[][] visited) {
		return (r >= 0) && (r < ROW) && (c >= 0) && (c < COL) && !visited[r][c] && mat[r][c] == 1;
	}

	static int DFS(int r, int c, boolean visited[][]) {
		int count = 1;
		visited[r][c] = true;
		int rowNbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
		for (int k = 0; k < 8; k++) {
			int row = r + rowNbr[k];
			int col = c + colNbr[k];
			if (isSafe(row, col, visited)) {
				count += DFS(row, col, visited);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		boolean visited[][] = new boolean[ROW][COL];
		int count = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (mat[i][j] == 1 && !visited[i][j]) {
					System.out.println("size= " + DFS(i, j, visited));
					++count;
				}
			}
		}
		System.out.println("is-land count --> " + count);
	}

}
