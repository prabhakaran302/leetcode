class Solution {
    public void moveZeroes(int[] nums) {
        
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0 && nums[counter] == 0) {
				nums[counter++] = nums[i];
				nums[i] = 0;
			} else if (nums[i] != 0 && nums[counter] != 0)  {
                counter++;
            }
		}
	
    }
}