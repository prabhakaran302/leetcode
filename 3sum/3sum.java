class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
		
		
		
		List<List<Integer>> list = new ArrayList<>();
		Arrays.parallelSort(nums);
		for (int i = 0; i <= nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int j = i + 1;
				int k = nums.length - 1;

				int num = nums[i];

				while (j < k) {

					int sum = num + nums[j] + nums[k];
					if (sum == 0) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(num);
						l.add(nums[j]);
						l.add(nums[k]);
						list.add(l);
						while (j < k && nums[j + 1] == nums[j])
							j++;
						while (k > j && nums[k - 1] == nums[k])
							k--;

						j++;
						k--;
					} else if (sum > 0) {
						k--;
					} else {
						j++;
					}

				}
			}

		}

		return list;
	
	
	
	
    }
}