class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> li = new ArrayList<>();
        
        int max = heights[heights.length - 1];
        li.add(heights.length - 1);
        for(int i = heights.length - 2; i >= 0; i--)    {
            if(heights[i] > max)    {
                max = heights[i];
                li.add(i);
            }
        }
        Collections.reverse(li);
        return li.stream().mapToInt(i->i).toArray();
    }
}