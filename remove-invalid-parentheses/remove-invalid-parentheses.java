class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        
        
        Set<String> visited = new HashSet<>();
        visited.add(s);
        
        boolean first = true;
        
        while(!q.isEmpty())  {
            
            String cur = q.poll();
            if(isBalanced(cur))    {
                res.add(cur);
                first = false;
            }
            
            if(first)   {
                for(int i = 0; i < cur.length();i++)  {
                    if(cur.charAt(i) == '(' || cur.charAt(i) == ')')    {
                        String ns = cur.substring(0, i) + cur.substring(i+1);
                        if(!visited.contains(ns))   {
                            q.offer(ns);
                            visited.add(ns);   
                        }   
                    }
                }
            }
            
            
        }
        
        return res;
    }
    
    public boolean isBalanced(String cur)  {
        int open = 0;
        for(int i = 0; i < cur.length();i++)  {
            if(cur.charAt(i) == '(')    {
                open++;
            } else if(cur.charAt(i) == ')') {
                open--;
                if(open < 0)
                    return false;
            }
        }
        return open == 0; 
    }
}