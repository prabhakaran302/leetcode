class Solution {
    public void solveSudoku(char[][] board) {
		solveSudokuUtil(board);
	}

	private boolean solveSudokuUtil(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '.') {
					for (char c = '1'; c <= '9'; c++) {
						if (isValidSudoku(board, i, j, c)) {
							board[i][j] = c;
							if (solveSudokuUtil(board))
								return true;
						}
						board[i][j] = '.';
					}
					return false;
				}
			}
		}
		return true;
	}

	private boolean isValidSudoku(char[][] board, int row, int col, char c) {
		for (int i = 0; i < board.length; i++) {
			if (board[row][i] != '.' && board[row][i] == c)
				return false;
			if (board[i][col] != '.' && board[i][col] == c)
				return false;

			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
					&& board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
				return false;

		}
		return true;
	}
}