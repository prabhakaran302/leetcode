class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> set = new HashSet<>(wordList);

		Queue<WordNode> queue = new LinkedList<>();
		WordNode n = new WordNode(beginWord, 1);
		queue.add(n);

		while (!queue.isEmpty()) {
			WordNode cur = queue.poll();

			if (cur.word.equals(endWord))
				return cur.level;

			for (int wIndex = 0; wIndex < cur.word.length(); wIndex++) {
				for (char c = 'a'; c <= 'z'; c++) {
					String ns = swap(cur.word, wIndex, c);
					if (set.contains(ns)) {
						WordNode nTemp = new WordNode(ns, cur.level + 1);

						queue.add(nTemp);
						set.remove(ns);
					}
				}
			}
		}

		return 0;
	}

	class WordNode {
		String word;
		int level;

		public WordNode(String word, int level) {
			super();
			this.word = word;
			this.level = level;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + level;
			result = prime * result + ((word == null) ? 0 : word.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WordNode other = (WordNode) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (level != other.level)
				return false;
			if (word == null) {
				if (other.word != null)
					return false;
			} else if (!word.equals(other.word))
				return false;
			return true;
		}

		private Solution getEnclosingInstance() {
			return Solution.this;
		}
	}

	private String swap(String cur, int wIndex, char c) {
		char[] charArr = cur.toCharArray();
		charArr[wIndex] = c;
		return String.valueOf(charArr);
	}
}