class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		int left = 0;
		int right = 0;
		int max = 0;
		while (right < s.length()) {
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
			if (map.size() > k) {
				char l = s.charAt(left++);
				map.put(l, map.get(l) - 1);
				if (map.get(l) == 0)
					map.remove(l);
			}
			right++;
			max = Math.max(max, right - left);
		}
		return max;
	
	
    }
}