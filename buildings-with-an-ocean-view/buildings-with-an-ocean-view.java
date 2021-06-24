class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> li = new ArrayList<>();
        int max = heights[heights.length - 1];
        li.add(heights.length - 1);
        
        for(int ind = heights.length - 2; ind  >= 0; ind--)   {
            if(heights[ind] > max)  {
                max = heights[ind];
                li.add(ind);
            }
        }
        
        Collections.reverse(li);
        
        int [] ans = new int[li.size()];
        int index = 0;
        for(int cur : li)
            ans[index++] = cur;
        
        return ans;
    }
}