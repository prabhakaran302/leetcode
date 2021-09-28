class Solution {
    public List<String> letterCombinations(String digits) {
        
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");

		List<String> result = new ArrayList<>();
        if(digits.length() == 0)
            return result;
		result.add("");
        
        
		for (char c : digits.toCharArray()) {
			String val = map.get(c);
			List<String> curList = new ArrayList<>();
			for (String t : result) {
				for (char nc : val.toCharArray()) {
					curList.add(t + nc);
				}
			}
			result = curList;
		}

		return result;
	
    }
}