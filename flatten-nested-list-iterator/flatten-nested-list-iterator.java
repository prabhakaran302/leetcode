/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Deque<NestedInteger> q;
    public NestedIterator(List<NestedInteger> nestedList) {
        q = new LinkedList<>();
        for(NestedInteger n : nestedList) {
            q.addLast(n);
        }
    }

    @Override
    public Integer next() {
        if(!hasNext())
            return -1;
        return q.removeFirst().getInteger();
    }

    @Override
    public boolean hasNext() {
        makeTopAnInteger();
        return !q.isEmpty();
    }
    
    private void makeTopAnInteger() {
        while(!q.isEmpty() && !q.peekFirst().isInteger())   {
            List<NestedInteger> nestedList = q.removeFirst().getList();
            for (int i = nestedList.size() - 1; i >= 0; i--) {
                q.addFirst(nestedList.get(i));
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */