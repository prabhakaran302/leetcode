class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)   {
            if(i == 0 || st1.isEmpty() || s.charAt(i) != st1.peek())   {
                st1.push(s.charAt(i));
                st2.push(1);
            } else if(s.charAt(i) == st1.peek())    {
                
				int val = st2.pop();
				if (val == k - 1) {
                    int t = val;
                    while(t-- > 0)
					    st1.pop();
				} else {
					st2.push(val + 1);
					st1.push(s.charAt(i));
				}
			
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st1.isEmpty())
            sb.append(st1.pop());
        
        return sb.reverse().toString();
        
    }
}