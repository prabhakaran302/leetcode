class Solution {
    public boolean isBipartite(int[][] graph) {
        

		Map<Integer, Integer> map = new HashMap<>();
		int curr = 1;

		for (int i = 0; i < graph.length; i++) {
            if(map.get(i) == null)  {
                Queue<Integer> q = new LinkedList<>();
			    q.offer(i);
            
            
			    map.put(i, curr);

			    while (!q.isEmpty()) {
				    int pele = q.poll();

				    for (int ele : graph[pele]) {
						if (!map.containsKey(ele)) {
							int nc = map.get(pele).compareTo(1) == 0 ? 2 : 1;
							map.put(ele, nc);
							q.offer(ele);
						} else if (map.get(ele).compareTo(map.get(pele)) == 0) {
							return false;
						}
					}
			    }
		   
                curr = curr == 1 ? 2 : 1;
            
            
            
            }
        }
		return true;
	
    }
}