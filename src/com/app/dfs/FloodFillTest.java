package com.app.dfs;

public class FloodFillTest {
	static int M = 6;
	static int N = 6;

	static void floodFillUtil(char mat[][], int x, int y) {

		// Base Case
		if (x < 0 || x >= M || y < 0 || y >= N)
			return;

		if (mat[x][y] != '-')
			return;

		// Replace the values(x,y)
		mat[x][y] = 'O';

		// recursion for north, south, east, west
		floodFillUtil(mat, x + 1, y);
		floodFillUtil(mat, x - 1, y);
		floodFillUtil(mat, x, y + 1);
		floodFillUtil(mat, x, y - 1);

	}

	static void replaceSurrounded(char mat[][]) {

		// Step 1: Replace
		// all 'O' with '-'
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				if (mat[i][j] == 'O')
					mat[i][j] = '-';

	}

	static void logic(char mat[][]) {
		// Left side
		for (int i = 0; i < M; i++)
			if (mat[i][0] == '-')
				floodFillUtil(mat, i, 0);
		
		print(mat);

		// Right side
		for (int i = 0; i < M; i++)
			if (mat[i][N - 1] == '-')
				floodFillUtil(mat, i, N - 1);

		print(mat);

		// Top side
		for (int i = 0; i < N; i++)
			if (mat[0][i] == '-')
				floodFillUtil(mat, 0, i);
		
		print(mat);

		// Bottom side
		for (int i = 0; i < N; i++)
			if (mat[i][N - 1] == '-')
				floodFillUtil(mat, M - 1, i);
		
		print(mat);

	}

	static void print(char mat[][]) {

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(mat[i][j] + " ");

			System.out.println("");
		}
		System.out.println("-----------------------------------------");
	}

	// Driver Code
	public static void main(String[] args) {
		char[][] mat = /*{ { 'X', 'O', 'X', 'O', 'X', 'X' }, { 'X', 'O', 'X', 'X', 'O', 'X' },
				{ 'X', 'X', 'X', 'O', 'X', 'X' }, { 'O', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'O', 'X', 'O' },
				{ 'O', 'O', 'X', 'O', 'O', 'O' } };*/
		
		 {	 {'X', 'O', 'X', 'X', 'X', 'X'},
             {'X', 'O', 'X', 'X', 'O', 'X'},
             {'X', 'X', 'X', 'O', 'O', 'X'},
             {'O', 'X', 'O', 'X', 'X', 'X'},
             {'X', 'X', 'X', 'O', 'X', 'O'},
             {'O', 'O', 'X', 'O', 'O', 'O'},
          };

		print(mat);
		replaceSurrounded(mat);
		print(mat);
		logic(mat);
		print(mat);

	}
}
