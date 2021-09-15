class Solution {
    public void nextPermutation(int[] nums) {
        int lastPos = nums.length - 2;
		while (lastPos >= 0 && nums[lastPos] >= nums[lastPos+1])
			lastPos--;

		if (lastPos >= 0) {
			int j = nums.length - 1;
			while (nums[lastPos] >= nums[j])
				j--;

			int temp = nums[lastPos];
			nums[lastPos] = nums[j];
			nums[j] = temp;
		}

		reverse(nums, lastPos + 1);
	}

	private void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1;
        while (i < j) {
        	int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			
            i++;
            j--;
        }
	}
}