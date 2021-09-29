class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs)  {
            char c [] = str.toCharArray();
            Arrays.sort(c);
            map.computeIfAbsent(String.valueOf(c), x -> new ArrayList<>()).add(str);
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String,List<String>> en :  map.entrySet())    {
            list.add(en.getValue());
        }
        return list;
    }
}