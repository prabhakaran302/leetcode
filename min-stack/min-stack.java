class MinStack {

    Stack<Integer> stack;
	Stack<Integer> mstack;

	public MinStack() {
		stack = new Stack<>();
		mstack = new Stack<>();
	}

	public void push(int val) {
		if (stack.isEmpty() || mstack.isEmpty() || mstack.peek() >= val) {
			mstack.push(val);
		}
		stack.push(val);
	}

	public void pop() {
		if (stack.peek().equals(mstack.peek())) {
			mstack.pop();
		}
		stack.pop();
	}

	public int top() {
		return !stack.isEmpty() ? stack.peek() : -1;
	}

	public int getMin() {
		return !mstack.isEmpty() ? mstack.peek() : -1;
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */