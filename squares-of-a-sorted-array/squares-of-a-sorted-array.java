class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int n = nums.length - 1;
        
        while(i <= j)    {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))   {
                res[n] = nums[i]*nums[i];
                i++;
            } else {
                res[n] = nums[j]*nums[j];
                j--;
            }
            n--;
        }
        
        return res;
    }
}