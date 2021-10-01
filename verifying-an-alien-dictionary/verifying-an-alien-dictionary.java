class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        int ind = 0;
        for(char c : order.toCharArray())   {
            map.put(c,ind++);
        }
        
        for(int i = 1; i < words.length;i++)    {
            if(compare(words[i-1], words[i], map) == false)
                return false;
        }
        return true;
    }
    
    public boolean compare(String w1, String w2, Map<Character,Integer> map)    {
        if(w1.startsWith(w2) && w1.length() > w2.length())
            return false;
        
        for(int i = 0; i < Math.min(w1.length(),w2.length());i++) {
            if(w1.charAt(i) != w2.charAt(i))    {
                if(map.get(w1.charAt(i)) > map.get(w2.charAt(i)))
                    return false;
                else
                    return true;
            }
        }
        return true;
    }
}