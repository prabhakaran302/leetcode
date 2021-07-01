class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean visited[][] = new boolean[image.length][image[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        int val [] = new int[2];
        val[0] = sr;
        val[1] = sc;
        q.offer(val);
        
        int ac = image[sr][sc];
        
        int[] xrow = {-1,1,0,0};
        int[] xcol = {0,0,1,-1};
        
        while(!q.isEmpty())  {
            int[] cur = q.poll();
            if(visited[cur[0]][cur[1]])
                continue;
            
            visited[cur[0]][cur[1]] = true;
            image[cur[0]][cur[1]] = newColor;
            
            for(int i = 0; i < 4; i++)    {
                int nr = cur[0] + xrow[i];
                int nc = cur[1] + xcol[i];
                
                if(nr >= 0 && nr < image.length && nc >= 0 && nc < image[0].length && image[nr][nc] == ac) {
                    val = new int[]{nr,nc};
                    q.offer(val);
                }
            }
            
        }
        return image;
    }
}