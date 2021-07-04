class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> q = new  PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            else return b[0] - a[0];
        });
        List<Integer> li = new ArrayList<>();
        int index = 0;
        int i = 0;
        for(int []  cur : mat)  {
            int ct = 0;
            for(int len = 0; len < cur.length; len++)   {
                if(cur[len] == 1)
                  ct++;  
            }
            int[] entry = new int[]{ct, i++};
            q.add(entry);
            if (q.size() > k) {
                q.poll();
            }
        }
        
        int[] indexes = new int[k];
        for (i = k - 1; i >= 0; i--) {
            int[] pair = q.poll();
            indexes[i] = pair[1];
        }

        return indexes;
    }
}