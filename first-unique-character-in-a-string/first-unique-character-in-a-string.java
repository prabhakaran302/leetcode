class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char cur : s.toCharArray()) {
            map.put(cur, map.getOrDefault(cur,0)+1);
        }
        
        for(char cur : map.keySet())
            if(map.get(cur) == 1)
                return s.indexOf(cur);
        
        return -1;
    }
}