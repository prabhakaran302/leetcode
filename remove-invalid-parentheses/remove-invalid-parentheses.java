class Solution {
    public List<String> removeInvalidParentheses(String s) 
    {
        Queue<String> q = new LinkedList();
        Set<String> visited = new HashSet();
        q.add(s);
        
        List<String> result = new ArrayList();
        boolean found = false;
        while (!q.isEmpty())
        {
            String curr = q.poll();
            if (is_valid(curr))
            {
                result.add(curr);
                found = true;
            }
            
            if (!found)
            {
                next(q, visited, curr);
            }
        }
        
        return result;
    }
    
    void next(Queue<String> q, Set<String> visited, String s)
    {
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == ')')
            {
                String n = s.substring(0, i) + s.substring(i + 1);
                if (!visited.contains(n))
                {
                    q.add(n);
                    visited.add(n);
                }
            }
        }
    }
    
    boolean is_valid(String s)
    {
        int count = 0;
        for (char c : s.toCharArray())
        {
            if (c == '(')
            {
                ++count;
            }
            else if (c == ')')
            {
                --count;
                if (count == -1) return false;
            }
        }
        
        return count == 0;
    }
    
}
