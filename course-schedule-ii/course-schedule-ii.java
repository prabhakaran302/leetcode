class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int [] incoming = new int[numCourses];
        
        for(int [] preq : prerequisites)    {
            incoming[preq[0]]++;
            if(map.get(preq[1]) == null)
                map.put(preq[1], new ArrayList<>());
            map.get(preq[1]).add(preq[0]);
        }
        
        System.out.println(map);
        
        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < numCourses; i++) {
            if(incoming[i] == 0)    {
                q.offer(i);
                res.add(i);
            }
        }
        System.out.println(q);
        
        while(!q.isEmpty())  {
            int cur = q.poll();
            if(map.get(cur) != null)    {
                for(int vals : map.get(cur))    {
                    incoming[vals]--;
                    if(incoming[vals] == 0)    {
                        q.offer(vals);
                        res.add(vals);
                    }
                }   
            }
        }
        
        if(res.size() != numCourses)
            return new int[]{};
        
        int[] ans = new int[res.size()];
        int ind = 0;
        for(Integer r : res)
            ans[ind++] = r;
        
        return ans;
    }
}