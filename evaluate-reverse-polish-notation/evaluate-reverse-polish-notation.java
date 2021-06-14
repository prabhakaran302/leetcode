class Solution {
    public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();

		Set<String> set = new HashSet<>();
		set.add("+");
		set.add("-");
		set.add("*");
		set.add("/");

		for (String s : tokens) {
			if (!set.contains(s))
				stack.push(Integer.valueOf(s));
			else {
				int f = stack.pop();
				int sc = stack.pop();

				stack.push(getEvalValue(s, f, sc));
			}
		}

		return stack.pop();
	}

	private Integer getEvalValue(String s, int f, int sc) {
		switch (s) {
		case "+":
			return f + sc;
		case "-":
			return sc - f;
		case "*":
			return sc * f;
		case "/":
			return sc / f;
		}
		return -1;
	}
}