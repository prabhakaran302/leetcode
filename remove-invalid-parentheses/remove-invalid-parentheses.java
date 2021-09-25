class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        set.add(s);
        
        boolean found = false;
        
        while(!q.isEmpty()) {
            String cur = q.poll();
            if(isValid(cur))    {
                result.add(cur);
                found  = true;
            }
            
            if(!found)  {
                for(int i = 0; i < cur.length();i++)  {
                    if(cur.charAt(i) == '(' || cur.charAt(i) == ')')    {
                        String ns = cur.substring(0,i) + cur.substring(i+1);
                        if(!set.contains(ns))    {
                            q.offer(ns);
                            set.add(ns);
                        }
                    }
                    
                } 
            }
        }
        
        return result;
    }
    
    public boolean isValid(String str)  {
        int low = 0;
        int high = str.length() - 1;
        
        int open = 0;
        for(int i = 0; i <= high;i++)   {
            if(str.charAt(i) == '(')    {
                open++;
            } else if(str.charAt(i) == ')') {
                open--;
                if(open == -1)
                    return false;
            }
        }
        
        return open == 0;
    }
}