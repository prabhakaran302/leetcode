class Solution {
    public int[] findBuildings(int[] heights) {
        int max = heights[heights.length - 1];
        
        int [] ans = new int[heights.length];
        int counter = heights.length - 1;
        ans[counter--] = heights.length - 1;
        
        for(int ind = heights.length - 2; ind  >= 0; ind--)   {
            if(heights[ind] > max)  {
                max = heights[ind];
                ans[counter--] = ind;
            }
        }
        
        return Arrays.copyOfRange(ans, counter+1, ans.length);
    }
}