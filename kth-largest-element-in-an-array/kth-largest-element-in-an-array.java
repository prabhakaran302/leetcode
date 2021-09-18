class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int lo = 0;
        int high = nums.length - 1;
        
        while(lo < high)    {
            int j = pivot(nums, lo, high);
            if(j < k)   {
                lo = j + 1;
            } else if(j > k)    {
                high = j - 1;
            } else  {
                return nums[j];
            }
        }
        
        return nums[lo];
    }
    
    public int pivot(int[] nums, int low, int high) {
        int i = low + 1;
        int j = high;
        
        while(true) {
            while(i < nums.length && nums[low] >= nums[i])
                i++;
            while(j >= 0 && nums[low] < nums[j])
                j--;
            if(i >= j)
                break;
            
            swap(nums,i,j);
        }
        swap(nums,low,j);
        
        return j;
    }
    
    public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}