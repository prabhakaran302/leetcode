class Solution {
    public int titleToNumber(String columnTitle) {
        
		Map<Character, Integer> map = new HashMap<>();
		int index = 1;
		for (char cur = 'A'; cur <= 'Z'; cur++) {
			map.put(cur, index++);
		}

		int val = 0;
		for (char c : columnTitle.toCharArray()) {
            val *= 26;
			val += map.get(c);
			
		}

		return val;
	
    }
}