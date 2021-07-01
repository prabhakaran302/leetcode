class Solution {
    public int findKthPositive(int[] arr, int k) {
        
		int start = 1;
		int missing = 0;
		for (int i = 0; i < arr.length; i++) {
			missing += arr[i] - start;
			if (missing >= k) {
				return arr[i] - (missing - k + 1);
			}
			start = arr[i] + 1;
		}
		return arr[arr.length - 1] + k - missing;
	
    }
}