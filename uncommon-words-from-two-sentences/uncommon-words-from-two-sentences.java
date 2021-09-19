class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : s1.split(" "))
            map.put(s,map.getOrDefault(s,0)+1);
        
        
        List<String> l = new ArrayList<>();
        for(String s : s2.split(" "))   {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(Map.Entry<String,Integer> en : map.entrySet())
            if(en.getValue() == 1)
                l.add(en.getKey());
        
        return l.toArray(new String[l.size()]);
    }
}