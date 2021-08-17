class Solution {
    public int[] productExceptSelf(int[] nums) {
        
		int n = nums.length;
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		System.out.println(Arrays.toString(left));

		int res[] = new int[n];
		int right = 1;
		res[n - 1] = right * left[n - 1];
		right *= nums[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			res[i] = right * left[i];
			right *= nums[i];
		}

		return res;
	
    }
}