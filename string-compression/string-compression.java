class Solution {
    public int compress(char[] chars) {
		int prevIndex = 0;
		char prev = chars[0];
		int count = 1;
		for (int curIndex = 1; curIndex < chars.length; curIndex++) {
			if (chars[curIndex] == prev) {
				count++;
			} else {
				prevIndex = compressUtil(count, chars, prevIndex, prev);
				prev = chars[curIndex];
				count = 1;
			}

		}
		prevIndex = compressUtil(count, chars, prevIndex, prev);

		return prevIndex;
	}

	private int compressUtil(int count, char[] chars, int prevIndex, char prev) {
		if (count == 1) {
			chars[prevIndex++] = prev;
			return prevIndex;
		} else {
			StringBuilder sb = new StringBuilder();
			while (count >= 1) {
				sb.append(count % 10);
				count = count / 10;
			}
			sb.reverse();
			chars[prevIndex++] = prev;
			for (char c : sb.toString().toCharArray())
				chars[prevIndex++] = c;
		}
		return prevIndex;
	}

}