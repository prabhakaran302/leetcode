class Solution {
    public String longestNiceSubstring(String s) {
        
		
		if (s.length() < 2)
			return "";
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray())
			set.add(c);

		for (int index = 0; index < s.length(); index++) {
			char cur = s.charAt(index);

			if (set.contains(Character.toUpperCase(cur)) && set.contains(Character.toLowerCase(cur)))
				continue;

			String sub1 = longestNiceSubstring(s.substring(0, index));
			String sub2 = longestNiceSubstring(s.substring(index + 1));

			return sub1.length() >= sub2.length() ? sub1 : sub2;
		}
		return s;
	
	
    }
}