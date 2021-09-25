class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new TreeMap<>();
        for(String str : strings)   {
            String key = getKey(str);
            map.computeIfAbsent(key, x->new ArrayList<>()).add(str);
        }
        for(Map.Entry<String, List<String>> en : map.entrySet())
            result.add(en.getValue());
        return result;
    }
    
    public String getKey(String str)  {
        
		if (str.length() == 1)
			return "single";

		char[] cs = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < cs.length; i++) {
			int diff = cs[i] - cs[i - 1];
			if (diff < 0)
				diff += 26;
			sb.append(diff + ",");
		}
		return sb.substring(0, sb.length() - 1);
	
    }
}