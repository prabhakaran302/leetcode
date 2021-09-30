class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n,0)+1);
        
        
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)->a.getValue().compareTo(b.getValue()));
        for(Map.Entry<Integer,Integer> en : map.entrySet()) {
            q.offer(en);
            if(q.size() > k)
                q.poll();
        }
        
        int [] res = new int[q.size()];
        int index = 0;
        while(!q.isEmpty())
            res[index++] = q.poll().getKey();
        
        return res;
    }
}