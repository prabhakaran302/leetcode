class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length * k == 0)
            return 0;
        if(k > prices.length/2) {
            int sum = 0;
            for(int i = 1; i < prices.length; i++)  {
                if(prices[i] > prices[i-1]) {
                    sum += (prices[i] - prices[i-1]);
                }
            }
            return sum;
        }
        
        
        int [] buy = new int[k];
        int[] sell = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        
        buy[0] = -prices[0];
        sell[0] = 0;
        
        for(int i = 1; i < prices.length; i++)  {
            for(int j = 0; j < k;j++)  {
                buy[j] = Math.max(buy[j], j > 0 ? sell[j-1] - prices[i] : -prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
        }
        
        return sell[sell.length - 1];
    }
}