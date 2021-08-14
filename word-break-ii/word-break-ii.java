class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
		Set<String> set = new LinkedHashSet<String>(wordDict);
		List<String> list = new ArrayList<>();

		List<String>[] dp = new ArrayList[s.length() + 1];
		dp[0] = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			for (String cur : set) {
				if (i + cur.length() >= dp.length)
					continue;

				int begin = i;
				int end = i + cur.length();

				if (cur.equals(s.substring(begin, end))) {
					if (dp[end] == null) {
						dp[end] = new ArrayList<String>();
					}
					dp[end].add(s.substring(begin, end));
				}

			}
		}

		if (dp[dp.length - 1] == null)
			return list;

		List<String> temp = new ArrayList<>();
		dfs(dp, s.length(), temp, list);
		return list;
	}

	private void dfs(List<String>[] dp, int length, List<String> temp, List<String> list) {
		if (dp[length] == null)
			return;
        if (length <= 0) {
			
			String path = temp.get(temp.size() - 1);
			for (int i = temp.size() - 2; i >= 0; i--) {
				path = path + " " + temp.get(i);
			}
			list.add(path);
			return;
		
		}
		for (int i = 0; i < dp[length].size(); i++) {
			temp.add(dp[length].get(i));
			dfs(dp, length - dp[length].get(i).length(), temp, list);
			temp.remove(temp.size() - 1);
		}
	}
}