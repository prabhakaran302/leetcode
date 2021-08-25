class Solution {
    public int longestIncreasingPath(int[][] matrix) {
		int max = 1;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int ans = dfs(matrix, i, j, dp);
				max = Math.max(ans, max);
			}
		}

		return max;
	}

	private int dfs(int[][] matrix, int row, int col, int[][] dp) {
		if (dp[row][col] != 0)
			return dp[row][col];

		int max = 1;
		int[][] dir = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		for (int i = 0; i < 4; i++) {
			int x = dir[i][0] + row;
			int y = dir[i][1] + col;

			if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] <= matrix[row][col])
				continue;

			int curMax = 1 + dfs(matrix, x, y, dp);

			max = Math.max(max, curMax);
		}
		dp[row][col] = max;
		return max;
	}

}