class MovingAverage {

    Deque<Integer> list;
    double sum;
    int s;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        s = size;
        list = new LinkedList<>();
        sum = 0;
    }
    
    public double next(int val) {
        if(list.size() == s)    {
            sum -= list.getFirst();
            list.removeFirst();
        }
        list.addLast(val);
        sum += val;
        return sum/list.size();
            
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */