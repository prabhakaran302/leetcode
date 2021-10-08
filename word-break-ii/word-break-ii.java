class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> [] dp = new ArrayList[s.length() + 1];
        List<String> result = new ArrayList<>();
        
        Set<String> dict = new HashSet<>(wordDict);
        
        dp[0] = new ArrayList<>();
            
        for(int i = 0; i < s.length(); i++) {
            if(dp[i] == null)
                continue;
            
            for(String cur : dict)  {
                int end = cur.length();
                
                if(i + end <= s.length())   {
                    if(s.substring(i, i + end).equals(cur))  {
                        if(dp[i + end] == null)
                            dp[i + end] = new ArrayList<>();
                        
                        dp[i + end].add(s.substring(i, i + end));
                    }
                }
            }
        }
        
        System.out.println(Arrays.deepToString(dp));
        
        if(dp[dp.length - 1] == null)
            return result;
        
        List<String> temp = new ArrayList<>();
        backtrack(dp, dp.length - 1, result, temp);
        return result;
    }
    
    public void backtrack(List<String> [] dp, int index, List<String> result, List<String> temp) {
        if(index <= 0)  {
            StringBuilder sb = new StringBuilder();
            
            for(int i = temp.size() - 1; i >= 0; i--)   {
                String s = temp.get(i);
                sb.append(s + " ");
            }
                
            
            result.add(sb.substring(0, sb.length() - 1).toString());
            
            return;
        }
        
        for(String str : dp[index]) {
            temp.add(str);
            backtrack(dp, index - str.length(), result, temp);
            temp.remove(temp.size() - 1);
        } 
    }
        
    
}