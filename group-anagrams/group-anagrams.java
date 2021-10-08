class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs)  {
            String key = getKey(str);
            if(!map.containsKey(key))    {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        
        for(Map.Entry<String,List<String>> en : map.entrySet()) {
            result.add(en.getValue());
        }
        
        return result;
    }
    
    
    private String getKey(String str)   {
        int [] ca = new int[26];
        for(char c : str.toCharArray()) {
            ca[c-'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ca.length; i++)  {
            sb.append(ca[i]+",");
        }
        return sb.toString();
    }
    
}