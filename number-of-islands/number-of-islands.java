class Solution {
    int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public int numIslands(char[][] grid) {
		int count = 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					dfs(grid, i, j, visited);
					count++;
				}
			}
		}
		return count;
	}

	public void dfs(char[][] grid, int row, int col, boolean[][] visited) {
		for (int[] dir : dirs) {
			visited[row][col] = true;

			int x = row + dir[0];
			int y = col + dir[1];

			if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && !visited[x][y] && grid[x][y] == '1') {
				dfs(grid, x, y, visited);
			}
		}
	}
}