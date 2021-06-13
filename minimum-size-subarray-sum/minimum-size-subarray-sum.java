class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
		int length = Integer.MAX_VALUE;

		int sum = 0;
		int left = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= target) {
				length = Math.min(i + 1 - left, length);
				sum -= nums[left++];
			}
		}

		return length == Integer.MAX_VALUE ? 0 : length;
	
    }
}