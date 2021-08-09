class Solution {
    public int numSimilarGroups(String[] strs) {
        
		int answer = 0;
		Queue<String> q = new LinkedList<>();
		boolean[] visited = new boolean[strs.length];

		for (int index = 0; index < strs.length; index++) {
			if (visited[index])
				continue;
			visited[index] = true;
			answer += 1;

			q.offer(strs[index]);

			while (!q.isEmpty()) {
				String curString = q.poll();
				for (int innerLoopIndex = 0; innerLoopIndex < strs.length; innerLoopIndex++) {
					if (visited[innerLoopIndex])
						continue;
                    
                    if (curString.equals(strs[innerLoopIndex])) {
						visited[innerLoopIndex] = true;
						continue;
					}

					int diff = 0;
					for (int charIndex = 0; charIndex < curString.length(); charIndex++) {
						if (curString.charAt(charIndex) != strs[innerLoopIndex].charAt(charIndex))
							diff++;
						if (diff > 2)
							break;
					}
					if (diff == 2) {
						visited[innerLoopIndex] = true;
						q.offer(strs[innerLoopIndex]);
					}
				}
			}
		}

		return answer;
	
    }
}