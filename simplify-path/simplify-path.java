class Solution {
    public String simplifyPath(String path) {
        
		Deque<String> stack = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		String[] pa = path.split("/");

		for (String s : pa) {
			s = s.strip();
			if (s.length() != 0) {
				if (s.equals(".") || s.equals("/"))
					continue;
				else if (s.equals("..")) {
					if (!stack.isEmpty())
						stack.removeFirst();
				} else {
					stack.push(s);
				}
			}
		}

		sb.append("/");
		while (!stack.isEmpty()) {
			if (stack.peekLast().length() == 0)
				stack.removeLast();
			else
				sb.append(stack.removeLast()).append("/");
		}
		System.out.println(sb.toString());
		if (sb.length() == 1)
			return "/";

		return sb.substring(0, sb.length() - 1).toString();
	
    }
}