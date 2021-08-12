class Solution {
    public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		permuteUtil(nums, list, 0, nums.length - 1);
		return list;
	}

	private void permuteUtil(int[] nums, List<List<Integer>> list, int low, int high) {
		if (low == high) {
			List<Integer> l = Arrays.stream(nums).boxed().collect(Collectors.toList());
			list.add(l);
			return;
		} else {
			for (int i = low; i <= high; i++) {
				swap(nums, i, low);
				permuteUtil(nums, list, low + 1, high);
				swap(nums, i, low);
			}
		}
	}

	private void swap(int[] tempar, int i, int low) {
		int temp = tempar[i];
		tempar[i] = tempar[low];
		tempar[low] = temp;
	}
}