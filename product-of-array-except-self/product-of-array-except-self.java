class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        left[0] = 1;
        
        for(int i = 1; i < nums.length; i++)    {
            left[i] = left[i-1]*nums[i-1];
        }
        
        int right = nums[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            left[i] = left[i] * right;
            right = nums[i] * right;
        }
        
        return left;
    }
}