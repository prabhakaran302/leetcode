class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indexes = new HashSet<>();
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length();i++)   {
            char c = s.charAt(i);
            if(c == '(')    {
                stack.push(i);
            } else  if(c == ')')    {
                if(!stack.isEmpty())    {
                    stack.pop();
                } else  {
                    indexes.add(i);
                }
            }
        }
        while(!stack.isEmpty())
            indexes.add(stack.pop());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();i++)   {
            if(!indexes.contains(i))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}