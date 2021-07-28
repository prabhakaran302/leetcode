class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean mi = false;
        boolean md = false;
        
        int low = 0;
        
        while(low < nums.length - 1 && nums[low + 1] == nums[low])
            low++;
        
        if(low == nums.length - 1)
            return true;
        
        mi = nums[low + 1] > nums[low] ? true : false;
        md = nums[low + 1] < nums[low] ? true : false;
        
        for(int i = low;i < nums.length-1;i++) {
            if(mi && nums[i+1] < nums[i])
                return false;
            if(md && nums[i+1] > nums[i])
                return false;
        }
        
        return true;
    }
}