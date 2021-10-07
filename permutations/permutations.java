class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        List<Integer> current = new ArrayList<>();
        backtrack(nums, list, 0);
        
        return list;
    }
    
    public void backtrack(int[] nums, List<List<Integer>> list, int start) {
        
        if(start == nums.length - 1)    {
            List<Integer> li = new ArrayList<>();
            for(int i : nums)
                li.add(i);
            list.add(li);
            return;
        } else  {
            for(int i = start; i < nums.length; i++)    {
                swap(nums, start, i);
                backtrack(nums, list, start+1);
                swap(nums, start, i);
            }
        }
        
    }
    
    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}