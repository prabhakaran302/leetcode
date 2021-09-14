class Solution {
    public boolean differByOne(String[] dict) {
        Set<String> set = new HashSet<>();
        
        for(String d : dict)    {
            StringBuilder sb = new StringBuilder(d);
            
            for(int i = 0; i < d.length();i++)  {
                StringBuilder temp = new StringBuilder(sb.toString());
                temp.replace(i, i + 1,"*");
                String str = temp.toString();
                if(set.contains(str))
                    return true;
                
                set.add(str);
            }
        }
        
        return false;
    }
}