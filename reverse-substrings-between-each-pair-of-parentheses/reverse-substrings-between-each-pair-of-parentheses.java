class Solution {
    public String reverseParentheses(String s) {
        
		
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();

		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == ')') {
				StringBuilder temp = new StringBuilder();
				while (!stack.peek().equals("(")) {
					temp.append(stack.pop());
				}
				stack.pop();
				stack.push(temp.reverse().toString());
			} else {
				stack.push(String.valueOf(s.charAt(index)));
			}
		}

		while (!stack.isEmpty()) {
			if (!stack.peek().equals("("))
				sb.append(stack.pop());
		}
		return sb.reverse().toString();
	
	
    }
}