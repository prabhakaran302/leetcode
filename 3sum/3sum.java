class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3)
            return list;
        
        
        //-4,-1,-1,0,1,2
        for(int i = 0; i < nums.length && nums[i] <= 0;i++)   {
            if(i == 0 || nums[i-1] != nums[i])  {
                int low = i+1;
                int high = nums.length - 1;
                while(low < high)   {
                
                    if(nums[i] + nums[low] + nums[high] == 0)   {
                        list.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                        while(low < high && nums[low-1] == nums[low])
                            low++;
                    }
                    else if(nums[i] + nums[low] + nums[high] > 0)
                        high--;
                    else
                        low++;
                }   
            }
        }
        System.out.println(list);
        return list;
    }
}