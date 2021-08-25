class Solution {
    public int trap(int[] height) {
        
		int n = height.length;
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = height[0];
		int max = height[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, height[i]);
			left[i] = max;
		}

		right[n - 1] = height[n - 1];
		max = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			max = Math.max(max, height[i]);
			right[i] = max;
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.min(left[i], right[i]) - height[i];
		}
		return sum;
	
    }
}