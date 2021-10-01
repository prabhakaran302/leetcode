class Solution {
    public void nextPermutation(int[] nums) {
        int current = nums.length - 2;
        while(current >= 0 && nums[current] >= nums[current + 1])   {
            current--;
        }
        
        if(current >= 0)    {
            int end = nums.length - 1;
            while(nums[end] <= nums[current])
                end--;
            
            int temp = nums[end];
            nums[end] = nums[current];
            nums[current] = temp;
        }
        
        reverse(nums, current + 1);
    }
    
    public void reverse(int [] nums, int start) {
        int high = nums.length - 1;
        while(start < high) {
            int temp = nums[start];
            nums[start] = nums[high];
            nums[high] = temp;
            start++;
            high--;
        }
    }
}