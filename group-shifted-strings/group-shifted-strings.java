class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
		
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strings) {
			String key = getKey(str);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(str);
		}
		List<List<String>> res = new ArrayList<>();
		for (Map.Entry<String, List<String>> en : map.entrySet()) {
			res.add(en.getValue());
		}
		return res;
	
	
    }
    
    private String getKey(String str) {
        if (str.length() == 1)
			return "-1";
		StringBuilder sb = new StringBuilder();
		char[] sc = str.toCharArray();

		for (int i = 1; i < sc.length; i++) {
			int diff = sc[i] - sc[i - 1];
			if (diff < 0) {
				diff = 26 + diff;
			}
			sb.append(diff).append(",");
		}

		return sb.substring(0, sb.length() - 1).toString();
	}
}