class Solution {
    public int numSquares(int n) {
        
		int ans = 0;

		List<Integer> li = new ArrayList<>();
		for (int i = 1; i * i <= n; i++)
			li.add(i * i);

		Set<Integer> q = new HashSet<>();
		q.add(n);

		while (!q.isEmpty()) {
			ans++;
			Set<Integer> ns = new HashSet<>();
			for (int cur : q) {
				for (int l : li) {
					if (l == cur) {
						return ans;
					} else if (!(l > cur)) {
						int diff = cur - l;
						if (!q.contains(diff))
							ns.add(diff);
					}

				}
			}
			q = ns;
		}

		return ans;
	
    }
}