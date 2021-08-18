class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> q = new PriorityQueue();
        for(int num : sticks)   {
            q.offer(num);
        }
        
        int tc = 0;
        while(q.size() > 1) {
            int curval = q.poll() +( q.isEmpty() ? 0 : q.poll());
            
            tc += curval;
            
            if(!q.isEmpty())
                q.offer(curval);
        }
        
        return tc;
    }
}