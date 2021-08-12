class Solution {
    public int maxProduct(int[] nums) {
        
		
		
		int max = nums[0];
		int min = nums[0];

		int ans = max;
		
		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];
			int prevmax = max;
			int prevmin = min;
			max = Math.max(current, Math.max(prevmax * current, prevmin * current));
			min = Math.min(current, Math.min(prevmax * current, prevmin * current));
			
			ans = Math.max(ans, max);
		}

		return ans;
	
	
	
    }
}