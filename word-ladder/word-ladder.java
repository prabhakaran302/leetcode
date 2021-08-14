class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        

		Set<String> set = new LinkedHashSet<String>(wordList);
		if (!set.contains(endWord))
			return 0;

		Queue<LadderNode> q = new LinkedList<>();
		LadderNode l = new LadderNode();
		l.str = beginWord;
		l.level = 1;
		q.offer(l);

		while (!q.isEmpty()) {
			LadderNode cur = q.poll();
			String curStr = cur.str;

			for (int i = 0; i < curStr.length(); i++) {
				StringBuilder sb = new StringBuilder(curStr);
				for (char c = 'a'; c <= 'z'; c++) {
					sb.replace(i, i + 1, String.valueOf(c));
					if (endWord.equals(sb.toString()))
						return cur.level + 1;

					if (set.contains(sb.toString())) {
						l = new LadderNode();
						l.str = sb.toString();
						l.level = cur.level + 1;
						q.offer(l);
                        
                        set.remove(sb.toString());
					}
				}
			}
		}

		return 0;
	
    }
    
    class LadderNode {
		String str;
		int level;
	}
    
}