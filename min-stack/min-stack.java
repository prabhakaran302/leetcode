class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty())    {
            stack.push(val);
            min.push(val);
        } else  {
            if(val <= min.peek())  {
                stack.push(val);
                min.push(val);
            } else  {
                stack.push(val);
            }
        }
    }
    
    public void pop() {
        if(stack.isEmpty())
            return;
        if(stack.peek().equals(min.peek()))  {
            stack.pop();
            min.pop();
        } else  {
            stack.pop();
        }
    }
    
    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }
    
    public int getMin() {
        return min.isEmpty() ? -1 : min.peek();
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