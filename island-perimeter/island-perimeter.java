class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        int perm = 0;
        
        for(int i = 0; i < grid.length; i++)    {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    int val = 4;
                    if(i > 0 && grid[i-1][j] == 1)
                        val--;
                    
                    if(i < r - 1 && grid[i+1][j] == 1)
                        val--;
                    
                    if(j > 0 && grid[i][j-1] == 1)
                        val--;
                    
                    if(j < c - 1 && grid[i][j+1] == 1)
                        val--;
                    
                    perm += val;
                }
            }
        }
        
        return perm;
    }
}