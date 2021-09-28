class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1)
            return 0;
        
        Map<Character, Integer> map = new HashMap<>();
		int last = 0;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				last = Math.max(last, map.get(s.charAt(i)));
			}
            max = Math.max(max, i - last+1);
			map.put(s.charAt(i), i+1);
		}
		return max;
	
    }
}