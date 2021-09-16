class Solution {
    public boolean isAlienSorted(String[] words, String order) {
		Map<Character, Integer> map = new HashMap<>();
		int index = 0;
		for (char c : order.toCharArray()) {
			map.put(c, index++);
		}

		for (int i = 0; i < words.length - 1; i++) {
			if (!isAlienSortedUtil(words[i], words[i + 1], map))
				return false;
		}
		return true;
	}

	private boolean isAlienSortedUtil(String str1, String str2, Map<Character, Integer> map) {
		for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);

			if (c1 == c2)
				continue;

			if (c1 != c2 && map.get(c1) > map.get(c2)) {
				return false;
			} else
				return true;
		}

		if (str1.length() > str2.length())
			return false;

		return true;
	}
}