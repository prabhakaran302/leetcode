class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        
        int[] prev = points[0];
        for(int[] point : points) {
            ans += Math.max(Math.abs(prev[0]-point[0]), Math.abs(prev[1]-point[1]));
            prev = point;
        }
        
        return ans;
    }
}