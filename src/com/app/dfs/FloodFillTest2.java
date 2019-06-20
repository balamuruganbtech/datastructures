package com.app.dfs;

public class FloodFillTest2 {
	static int M = 6;
	static int N = 6;

	static void floodFillUtil(char mat[][], int r, int c) {

		if (r < 0 || r >= M || c < 0 || c >= N)
			return;

		if (mat[r][c] != '-')
			return;

		mat[r][c] = 'O';

		floodFillUtil(mat, r + 1, c);// north

		floodFillUtil(mat, r - 1, c);// south

		floodFillUtil(mat, r, c + 1);// east

		floodFillUtil(mat, r, c - 1);// west

	}

	static void replaceSurrounded(char mat[][]) {
		// step 1 : replace all 'O' with '-'
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				if (mat[i][j] == 'O')
					mat[i][j] = '-';
	}

	static void logic(char mat[][]) {
		// step 2 :

		// left iteration
		for (int i = 0; i < M; i++)
			if (mat[i][0] == '-')
				floodFillUtil(mat, i, 0);

		// right iteration
		for (int i = 0; i < M; i++)
			if (mat[i][M - 1] == '-')
				floodFillUtil(mat, i, M - 1);

		// top itr
		for (int i = 0; i < N; i++)
			if (mat[0][i] == '-')
				floodFillUtil(mat, 0, i);

		// bottom itr
		for (int i = 0; i < N; i++)
			if (mat[M - 1][i] == '-')
				floodFillUtil(mat, M - 1, i);
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
		char[][] mat = /*
						 * { { 'X', 'O', 'X', 'O', 'X', 'X' }, { 'X', 'O', 'X', 'X', 'O', 'X' }, { 'X',
						 * 'X', 'X', 'O', 'X', 'X' }, { 'O', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X',
						 * 'O', 'X', 'O' }, { 'O', 'O', 'X', 'O', 'O', 'O' } };
						 */

				{ 
						{ 'X', 'X', 'X', 'X', 'X', 'X' }, 
						{ 'X', 'O', 'X', 'X', 'O', 'X' }, 
						{ 'X', 'X', 'X', 'O', 'O', 'X' },
						{ 'O', 'X', 'O', 'X', 'X', 'X' }, 
						{ 'X', 'X', 'X', 'O', 'X', 'O' },
						{ 'O', 'O', 'X', 'O', 'O', 'O' }, 
				};

		print(mat);
		replaceSurrounded(mat);
		print(mat);
		logic(mat);
		print(mat);

	}
}
