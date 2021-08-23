class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new LinkedList<Integer>();
        for (int row = 0; row <= rowIndex; row++) {
            ret.add(0, 1);
            for (int i = 1; i < row; i++)
                ret.set(i, ret.get(i) + ret.get(i + 1));
        }
        return ret;
    }
    
}