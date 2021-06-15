class Solution {
   public int maxAreaOfIsland(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		int max = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int curs = dfs(grid, i, j);
					max = Math.max(curs, max);
				}

			}
		}

		return max;
	}

	private int dfs(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1)
			return 0;

		int[][] dir = new int[][] { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

		grid[i][j] = 2;
		int sum = 0;
		for (int k = 0; k <= 3; k++) {
			sum += dfs(grid, i + dir[k][0], j + dir[k][1]);
		}
		return 1 + sum;
	}
    
}