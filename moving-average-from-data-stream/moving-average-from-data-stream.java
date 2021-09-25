class MovingAverage {
    Deque<Integer> deque;
    int sum;
    int cap;
    public MovingAverage(int size) {
        deque = new LinkedList<>();
        sum = 0;
        cap = size;
    }
    
    public double next(int val) {
        if(deque.size() == cap) {
            sum -= deque.removeFirst();
        }
        sum += val;
        deque.add(val);
        return (sum / (deque.size() * 1.0));
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */