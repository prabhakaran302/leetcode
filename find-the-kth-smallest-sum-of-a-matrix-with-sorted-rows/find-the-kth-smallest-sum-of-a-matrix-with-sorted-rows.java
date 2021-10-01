class Solution {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        
        for(int [] r : mat) {
            PriorityQueue<Integer> cpq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i : pq) {
                
                for(int c = 0; c < r.length; c++)   {
                    cpq.add(i + r[c]);
                    if(cpq.size() > k)
                        cpq.poll();
                }
            }
            pq = cpq;
        }
        
        return pq.poll();
    }
}