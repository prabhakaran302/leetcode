class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int edge[] : edges) {
            map.computeIfAbsent(edge[0],x -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1],x -> new ArrayList<>()).add(edge[0]);
        }
        
        int count = 0;
        for(int i = 0; i < n;i++)   {
            if(!visited[i]) {
                bfs(i,map,visited);
                count++;
            }
        }
        
        return count;
    }
    
    public void bfs(int cur, Map<Integer,List<Integer>> map, boolean[] visited)   {
        Queue<Integer> q = new LinkedList<>();
        q.offer(cur);
        
        while(!q.isEmpty())  {
            int polCur = q.poll();
            visited[polCur] = true;
            if(map.containsKey(polCur)) {
                for(Integer val :  map.get(polCur)) {
                    if(!visited[val])
                        q.offer(val);
                }
            }
        }
    }
}