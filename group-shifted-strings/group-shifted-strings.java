class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strings)   {
            String key = getKey(str);
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(str);
        }
        System.out.println(map);
        for(Map.Entry<String,List<String>> en :  map.entrySet())    {
            list.add(en.getValue());
        }
        
        return list;
    }
    
    public String getKey(String s)  {
        StringBuilder sb = new StringBuilder();
        sb.append("0,");
        for(int i = 1; i < s.length(); i++)   {
            int diff = s.charAt(i) - s.charAt(i-1);
            if(diff < 0)
                diff += 26;
            sb.append(diff+",");
        }
        return sb.substring(0, sb.length()-1).toString();
    }
}