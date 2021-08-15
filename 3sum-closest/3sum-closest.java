class Solution {
    public int threeSumClosest(int[] nums, int target) {
         int diff = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i = 0; i <= nums.length-2; i++)    {
            System.out.println(diff);
            int low = i+1;
            int high = nums.length - 1;
        
            while(low < high)   {
                int sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(target-sum) < Math.abs(diff))   {
                    diff = target-sum;
                }
                if(sum > target)
                    high--;
                else
                    low++;
            }
        
        }
        
        return target-diff;
    }
}