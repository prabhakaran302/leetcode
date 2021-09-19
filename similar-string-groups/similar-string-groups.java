class Solution {
    public int numSimilarGroups(String[] strs) {
        
		int ans = 0;
		boolean[] visited = new boolean[strs.length];
		for (int i = 0; i < strs.length; i++) {
			if (visited[i])
				continue;

			ans++;
			visited[i] = true;

			Queue<String> q = new LinkedList<>();
			q.offer(strs[i]);

			while (!q.isEmpty()) {
				String cur = q.poll();
				for (int j = 0; j < strs.length; j++) {
					if (visited[j])
						continue;

					String nw = strs[j];
					int diff = 0;
					for (int k = 0; k < Math.min(nw.length(), cur.length()); k++) {
						if (cur.charAt(k) != nw.charAt(k))
							diff++;
						if (diff > 2)
							break;
					}
                        
                    
					if(diff == 2 || diff == 0)	{
						q.offer(strs[j]);
						visited[j] = true;
					}

				}
			}
		}
		return ans;
	
    }
}