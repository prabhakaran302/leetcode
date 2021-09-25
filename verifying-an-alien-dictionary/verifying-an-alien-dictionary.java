class Solution {
    public boolean isAlienSorted(String[] words, String order) {
		Map<Character, Integer> map = new HashMap<>();
		int index = 0;
		for (char c : order.toCharArray()) {
			map.put(c, index++);
		}

		for (int i = 1; i < words.length; i++) {
			String w1 = words[i - 1];
			String w2 = words[i];
			if (!isAlienSortedUtil(w1, w2, map)) {
				return false;
			}
		}
		return true;
	}

	private boolean isAlienSortedUtil(String str1, String str2, Map<Character, Integer> map) {
		if (str1.length() > str2.length() && str1.startsWith(str2))
			return false;

		for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if(map.get(str1.charAt(i)) > map.get(str2.charAt(i)))
                    return false;
                else
                    return true;
                    
			}
		}
		return true;
	}
}