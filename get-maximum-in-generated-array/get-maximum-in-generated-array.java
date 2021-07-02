class Solution {
    public int getMaximumGenerated(int n) {
        int max = -1;
        for(int i = n ; i >= 0; i--)    {
            max = Math.max(max, getRec(i));
        }
        return max;
    }
    
    public int getRec(int n)    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n % 2 == 0)
            return getRec(n/2);
        else
            return getRec(n/2) + getRec(n/2+1);
    }
}