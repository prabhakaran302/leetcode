class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())   {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int count = 1;
        for(Map.Entry<Character,Integer> en : map.entrySet())   {
            if(en.getValue() % 2 != 0)  {
                count++;
            }
            if(count > 2)
                return false;
        }
        
        return true;
    }
}