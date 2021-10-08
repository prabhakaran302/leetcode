class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        boolean start = true;
        for(int i = 0; i < nums.length -2;i++)  {
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high)   {
                int sum = nums[i] + nums[low] + nums[high];
                if(start)   {
                    start = false;
                    closest = sum;
                } else  {
                    if(Math.abs(closest - target) > Math.abs(sum-target))   {
                        closest = sum;
                    }
                }
                
                System.out.println(sum + " "+ closest);
                
                if(sum > target)    {
                    high--;
                } else  {
                    low++;
                }
            }
        }
        System.out.println(closest);
        return closest;
    }
}