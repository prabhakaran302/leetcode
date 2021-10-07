class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        
        res[0] = searchLeft(nums, target);
        res[1] = searchRight(nums, target);
        
        return res;
    }
    
    public int  searchLeft(int[] nums, int target)    {
        int left = 0;
        int right = nums.length - 1;
        int start = -1;
        
        while(left <= right)    {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                start = mid;
                right = mid - 1;
            }
            if(nums[mid] < target)  {
                left = mid + 1;
            } else  {
                right = mid - 1;
            }
        }
        
        return start;
        
    }
    
    public int  searchRight(int[] nums, int target)    {
        int left = 0;
        int right = nums.length - 1;
        int start = -1;
        
        while(left <= right)    {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                start = mid;
                left = mid + 1;
            }
            if(nums[mid] <= target)  {
                left = mid + 1;
            } else  {
                right = mid - 1;
            }
        }
        
        return start;
    }
    
}