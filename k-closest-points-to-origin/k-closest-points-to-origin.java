class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q = new PriorityQueue<>((a,b)->b[0]*b[0]+b[1]*b[1] - a[0]*a[0] - a[1]*a[1]);
        
        for(int[] point : points)   {
            q.offer(point);
            if(q.size() > k)
                q.poll();
        }
        
        int res[][] = new int[q.size()][2];
        int index = q.size() - 1;
        while(!q.isEmpty())
            res[index--] = q.poll();
        
        return res;
    }
}