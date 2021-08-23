class Solution {
    public int[][] generateMatrix(int n) {
        int [][] mat = new int[n][n];
        int ele = 1;
        
        int row = n-1;
        int col = n-1;
        
        int sr = 0;
        int sc = 0;
        
        while(sr <= row && sc <= col) {
            for(int i = sr; i <= col; i++)   {
                mat[sr][i] = ele++;
            }
            
            for(int i = sr + 1; i <= row; i++)   {
                mat[i][col] = ele++;
            }
            
            if(sr < row && sc < col)    {
                for(int i = row-1; i >= sc; i--)   {
                    mat[row][i] = ele++;
                }
                
                for(int i = row-1; i > sr; i--)   {
                    mat[i][sc] = ele++;
                }
            }
            sr++;
            sc++;
            row--;
            col--;
        }
        return mat;
    }
}