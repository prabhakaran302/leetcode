class Solution {
    public int minReorder(int n, int[][] connections) {
        
		int sol = 0;
		Map<Integer, Set<Integer>> map = new HashMap<>();
		Set<String> set = new LinkedHashSet<>();
		for (int[] connection : connections) {
			set.add(connection[0] + "," + connection[1]);
			map.computeIfAbsent(connection[0], x -> new TreeSet<>());
			map.computeIfAbsent(connection[1], x -> new TreeSet<>());
			map.get(connection[0]).add(connection[1]);
			map.get(connection[1]).add(connection[0]);
		}

		Queue<Integer> q = new LinkedList<>();
		q.offer(0);

		boolean[] visited = new boolean[map.keySet().size()];
		visited[0] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			Set<Integer> neighbours = map.get(cur);
			for (Integer neighbour : neighbours) {
				if (visited[neighbour] == true)
					continue;
				if (!set.contains(neighbour + "," + cur))
					sol++;

				visited[neighbour] = true;
				q.offer(neighbour);
			}
		}

		return sol;
	
    }
}