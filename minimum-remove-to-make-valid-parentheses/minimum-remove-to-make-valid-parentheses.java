class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>();
        
        int open = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')  {
                stack.push(i);
                open++;
            } else if(s.charAt(i) == ')')   {
                open--;
                if(open == -1)  {
                    indexesToRemove.add(i);
                    open = 0;
                } else  {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty())
            indexesToRemove.add(stack.pop());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!indexesToRemove.contains(i))
                sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}