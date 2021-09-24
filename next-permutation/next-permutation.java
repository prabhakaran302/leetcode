class Solution {
    public void nextPermutation(int[] nums) {
        int k = nums.length - 2;
        
        while(k >= 0 && nums[k+1] <= nums[k])  {
            k--;
        }
        
        if(k >= 0)   {
            int last = nums.length - 1;
            while(nums[k] >= nums[last]) {
                last--;
            }
            int temp = nums[last];
            nums[last] = nums[k];
            nums[k] = temp;
        }
        
        reverse(nums,k+1);
        
    }
    
    public void reverse(int[] nums,int j)   {
        int k = nums.length - 1;
        while(j < k)    {
            int temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;
            j++;
            k--;
        }
        
    }
}