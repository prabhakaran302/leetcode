class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        
        while(i < n && j < n)    {
            if(i < n && nums[i]%2 == 0)
                i += 2;
            else if(j < n && nums[j] % 2 != 0)  {
                j += 2;
            } else  {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
        return nums;
    }
}