class Solution {
    public int romanToInt(String s) {
        
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int s1 = map.get(s.charAt(i));
			if (i + 1 < s.length()) {
				int s2 = map.get(s.charAt(i + 1));
				if (s1 >= s2) {
					result += s1 ;
				} else {
					result = result + s2 - s1;
                    i++;
				}
				
			} else {
				result += s1;
			}
		}

		return result;
	
    }
}