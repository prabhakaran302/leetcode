class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->-a[0]*a[0]-a[1]*a[1]+b[0]*b[0]+b[1]*b[1]);
        
        for(int [] p : points)  {
            q.offer(p);
            if(q.size() > k)
                q.poll();
        }
        
        int [][] res = new int[q.size()][2];
        int ind = 0;
        while(!q.isEmpty()) {
            res[ind++] = q.poll();
        }
        return res;
    }
}