class Solution {
    public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		permute(nums, list, 0, nums.length - 1);
		return list;
	}

	private void permute(int[] nums, List<List<Integer>> list, int low, int high) {
		if (low == high) {
			list.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
		} else {
			for (int i = low; i <= high; i++) {
				nums = swap(nums, i, low);
				permute(nums, list, low + 1, high);
				nums = swap(nums, i, low);
			}
		}
	}

	private int[] swap(int[] nums, int i, int low) {
		int temp = nums[i];
		nums[i] = nums[low];
		nums[low] = temp;
		return nums;
	}
}