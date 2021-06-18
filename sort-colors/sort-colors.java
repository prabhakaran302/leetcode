class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int index = 0;
        while(mid <= high)   {
            if(nums[index] == 0)    {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[index] == 1) {
                mid++;
            } else  {
                swap(nums,mid,high);
                high--;
                continue;
            }
            index++;
        }
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}