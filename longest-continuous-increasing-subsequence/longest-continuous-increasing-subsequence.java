class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int start = 1;
        int max = 1;
        int cur = 1;
        
        while(start < nums.length)  {
            if(nums[start] > nums[start-1]) {
                cur++;
            } else  {
                cur = 1;
            }
            
            max = Math.max(max,cur);
            start++;
        }
        
        return max;
    }
}