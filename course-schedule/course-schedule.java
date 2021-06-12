class Solution {
   public boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int[] p : prerequisites) {
			List<Integer> l = map.getOrDefault(p[0], new ArrayList<Integer>());
			l.add(p[1]);
			map.put(p[0], l);
		}

		int visited[] = new int[numCourses];

		for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
			if (!(dfs(e.getKey(), visited, map)))
				return false;
		}

		return true;
	}

	private boolean dfs(Integer key, int[] visited, Map<Integer, List<Integer>> map) {
		if (visited[key] == -1)
			return false;
		if (visited[key] == 1)
			return true;
		visited[key] = -1;
		List<Integer> l = map.get(key);
        if(l != null)
		    for (Integer cur : l) {
			    if (!dfs(cur, visited, map))
				    return false;
		    }
		visited[key] = 1;
		return true;
	}
}