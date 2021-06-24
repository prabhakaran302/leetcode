class Solution {
    public int minFallingPathSum(int[][] matrix) {
		int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, matrix[0][i]);
		}

		for (int row = 1; row < matrix.length; row++) {
			ans = Integer.MAX_VALUE;
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] += getMin(matrix, row, col);
				if (row == matrix.length - 1)
					ans = Math.min(matrix[row][col], ans);
			}
		}

		return ans;
	}

	private int getMin(int[][] matrix, int row, int col) {
		int lftUpperDiag = col - 1 < 0 ? Integer.MAX_VALUE : matrix[row - 1][col - 1];
		int upperN = matrix[row - 1][col];
		int rghtUpperDiag = col + 1 < matrix.length ? matrix[row - 1][col + 1] : Integer.MAX_VALUE;
		return Math.min(lftUpperDiag, Math.min(upperN, rghtUpperDiag));
	}
}