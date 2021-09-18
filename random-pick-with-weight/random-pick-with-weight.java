class Solution {

    int[] prefix;
    int totalSum;
    public Solution(int[] w) {
        prefix = new int[w.length];
        int sum = 0;
        
        for(int i = 0; i < w.length; i++)   {
            sum += w[i];
            prefix[i] = sum;
        }
        totalSum = sum;
    }
    
    public int pickIndex() {
        double ran = totalSum*Math.random();
        int low = 0;
        int high = prefix.length - 1;
        
        while(low < high)   {
            int mid = low + (high-low)/2;
            if(prefix[mid] < ran)
                low = mid+1;
            else
                high = mid;
        }
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */