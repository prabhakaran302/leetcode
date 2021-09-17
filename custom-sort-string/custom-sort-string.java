class Solution {
    public String customSortString(String order, String s) {
        
		
		
		
		
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		Set<Character> set = new LinkedHashSet<>();
		for (char c : order.toCharArray())
			set.add(c);

		StringBuilder sb = new StringBuilder();
		for (char c : set) {
			if (map.containsKey(c)) {
				int val = map.get(c);
				while (val-- > 0)
					sb.append(c);
			}
			map.remove(c);
		}
		
		for(Map.Entry<Character, Integer> en : map.entrySet())	{
			int val = en.getValue();
			while (val-- > 0)
				sb.append(en.getKey());
		}

		return sb.toString();
	
	
	
	
	
    }
}