class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        int count = 0;
        for(String w : words)   {
            Map<Character,Integer> tmap = new HashMap<>();
            for(char c : w.toCharArray()) {
                tmap.put(c, tmap.getOrDefault(c,0)+1);
            }
            
            
            for(Map.Entry<Character,Integer> en : map.entrySet())   {
                if(tmap.get(en.getKey()) != null)   {
                    if(en.getValue() >= tmap.get(en.getKey()))  {
                        tmap.remove(en.getKey());
                    }
                }
            }
            
            if(tmap.size() == 0)    {
                count += w.length();
            }
            
        }
        
        return count;
    }
}