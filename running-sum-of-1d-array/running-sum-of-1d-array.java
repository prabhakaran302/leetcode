class Solution {
    public int[] runningSum(int[] nums) {
        for(int cur = 1; cur < nums.length; cur++)
            nums[cur] += nums[cur-1];
        return nums;
    }
}