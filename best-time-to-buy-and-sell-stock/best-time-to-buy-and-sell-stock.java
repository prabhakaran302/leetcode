class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++)  {
            min = Math.min(min, prices[i]);
            sum = Math.max(sum, prices[i]-min);
        }
        return sum;
    }
}