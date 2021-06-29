class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
		double sum = 0.0;
		for (int index = 0; index < k; index++) {
			sum += nums[index];
		}

		double max = sum;
		
		for (int index = k; index < nums.length; index++) {
			sum = sum + nums[index] - nums[index - k];
			max = Math.max(max, sum);
		}

		return max / k;
	
    }
}