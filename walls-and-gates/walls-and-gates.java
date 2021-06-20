class Solution {
    public void wallsAndGates(int[][] rooms) {
        
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				if (rooms[i][j] == 0)
					q.add(new int[] { i, j });
			}
		}
		int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		while (!q.isEmpty()) {
			int cur[] = q.poll();
			int row = cur[0];
			int col = cur[1];
			for (int i = 0; i < 4; i++) {
				int nr = row + dir[i][0];
				int nc = col + dir[i][1];
                
                
				if (nr >= 0 && nr < rooms.length && nc >= 0 && nc < rooms[0].length
						&& rooms[nr][nc] == 2147483647) {
					rooms[nr][nc] = rooms[row][col] + 1;
					q.add(new int[] { nr, nc });
				}
			}

		}
	
    }
}