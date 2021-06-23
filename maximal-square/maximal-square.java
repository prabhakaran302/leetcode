class Solution {
    public int maximalSquare(char[][] matrix) {
        
		
		
		int max = 0;

		int dp[][] = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (row == 0 || col == 0 || matrix[row][col] == '0') {
					dp[row][col] = Integer.parseInt(String.valueOf(matrix[row][col]));

				} else if (matrix[row][col] == '1') {
					dp[row][col] = Math.min(dp[row - 1][col], Math.min(dp[row][col - 1], dp[row - 1][col - 1])) + 1;

				}
				if (max < dp[row][col])
					max = dp[row][col];
			}
		}

		return max * max;
	
	
	
    }
}