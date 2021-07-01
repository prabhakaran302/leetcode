class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int j = 1;
        int prev = nums[0];
        
        for(int i = 1; i< nums.length;)  {
            while(i < nums.length && prev == nums[i]) {
                i++;
            }
            if(i == nums.length)
                return j;
            nums[j++] = nums[i];
            prev = nums[i];
            i++;
        }
        
        return j;
    }
}