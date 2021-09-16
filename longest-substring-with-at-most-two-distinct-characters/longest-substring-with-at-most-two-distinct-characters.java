class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left = 0;
        int right = 0;
        
        Map<Character,Integer> map = new LinkedHashMap<>();
        
        int ml = 1;
        
        while(right < s.length())   {
            char cur = s.charAt(right);
            
            if(map.containsKey(cur))
                map.remove(cur);
            
            map.put(cur, right++);
            
            if(map.size() == 3) {
                char lm = map.keySet().iterator().next();
                left = map.get(lm) + 1;
                map.remove(lm);
            }
            
            ml = Math.max(ml, right - left);
        }
        
        return ml;
    }
}