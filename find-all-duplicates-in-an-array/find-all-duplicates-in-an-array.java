class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        
        
        for(int i = 0 ; i < nums.length; i++)   {
            int num = nums[i];
            if(nums[Math.abs(num) - 1] < 0)
                li.add(Math.abs(nums[i]));
        
            if(nums[Math.abs(num) - 1] > 0)
                nums[Math.abs(num) - 1] *= -1;
        }
        
        return li;
    }
}