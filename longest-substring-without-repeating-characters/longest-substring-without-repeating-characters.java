class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        
        Map<Character,Integer> map = new HashMap<>();
        
        int maxLength = 0;
        for(right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right)))    {
                
                left = Math.max(map.get(s.charAt(right)), left);
            }
            map.put(s.charAt(right), right + 1);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}