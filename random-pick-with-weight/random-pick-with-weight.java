class Solution {
    int [] prefixSum;
    int ts = 0;
    public Solution(int[] w) {
        int ind = 0;
        prefixSum = new int[w.length];
        for(int i : w)  {
            ts += i;
            prefixSum[ind++] = ts;
            
        }
    }
    
    public int pickIndex() {
        double val = Math.random() * ts;
        int low  = 0;
        int high = prefixSum.length;
        while(low < high)   {
            int mid = low + (high-low)/2;
            if(val > prefixSum[mid])    {
                low = mid + 1;
            } else  {
                high = mid;
            }
            
        }
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */