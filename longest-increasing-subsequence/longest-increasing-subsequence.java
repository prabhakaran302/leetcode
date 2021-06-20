class Solution {
    public int lengthOfLIS(int[] nums) {
        
		int l[] = new int[nums.length];
		Arrays.fill(l, 1);

		int ans = 1;
		for (int j = 1; j < nums.length; j++) {
			for (int i = 0; i < j; i++) {
				if (nums[j] > nums[i]) {
					l[j] = Math.max(l[j], l[i] + 1);
					ans = Math.max(l[j], ans);
				}
			}
		}

		return ans;
	
        
        
    }
}