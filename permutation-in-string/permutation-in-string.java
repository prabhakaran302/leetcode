class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
		Map<Character, Integer> map = new HashMap<>();
		if (s1.length() == 0 ^ s2.length() == 0)
			return true;
		if (s1.length() > s2.length())
			return false;
		for (char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
			String cur = s2.substring(i, i + s1.length());

			Map<Character, Integer> curMap = new HashMap<>();
			for (char c : cur.toCharArray()) {
				curMap.put(c, curMap.getOrDefault(c, 0) + 1);
			}


			for (Map.Entry<Character, Integer> en : map.entrySet()) {
					if (en.getValue().equals(curMap.get(en.getKey()))) {
						curMap.remove(en.getKey());
					}
				}
			if (curMap.size() == 0)
				return true;

		}
        

		return false;
	
    }
}