class Solution {
    public boolean isValid(String s) {
        
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		Stack<Character> stack = new Stack<>();
		for (char cur : s.toCharArray()) {
			switch (cur) {
			case '(':
			case '{':
			case '[':
				stack.push(cur);
				break;
			case ')':
			case '}':
			case ']':
				if (stack.isEmpty() || stack.pop() != map.get(cur))
					return false;
				break;
			default:
				return false;
			}
		}
        if(!stack.isEmpty())
            return false;
		return true;
	
    }
}