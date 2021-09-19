class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 1;
        
        for(int i = 1; i < nums.length; i++)    {
            if(nums[i] == maj)  {
                count++;
            } else  {
                count--;
            }
            if(count == 0)  {
                maj = nums[i];
                count = 1;
            }
        }
        
        count = 1;
        
        for(int num : nums) {
            if(num == maj)
                count++;
        }

        if(count >= nums.length / 2)
            return maj;
        
        return -1;
    }
}