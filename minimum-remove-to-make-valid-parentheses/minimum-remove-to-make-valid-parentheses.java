class Solution {
    public String minRemoveToMakeValid(String s) {
        
		Stack<Integer> stack = new Stack<>();
		StringBuilder res = new StringBuilder();

		Set<Integer> set = new HashSet<>();

		int open = 0;

		int index = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				open++;
				stack.push(index);
			} else if (c == ')') {
				
				if (open <= 0) {
					if (stack.isEmpty())
						set.add(index++);
					continue;
				}
				stack.pop();
				open--;
			
			}
			index++;
		}

		while (!stack.isEmpty())
			set.add(stack.pop());

		for (int i = 0; i < s.length(); i++) {
			if (!set.contains(i))
				res.append(s.charAt(i));
		}

		return res.toString();
	
    }
}